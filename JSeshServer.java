
import java.awt.geom.Dimension2D;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringWriter;
import java.io.StringReader;
import java.net.InetSocketAddress;
import java.net.URLDecoder;
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import jsesh.graphics.export.BaseGraphics2DFactory;
import org.qenherkhopeshef.graphics.svg.SVGGraphics2D;
import jsesh.graphics.export.SelectionExporter;
import jsesh.graphics.export.ExportData;
import jsesh.mdcDisplayer.preferences.DrawingSpecificationsImplementation;
import jsesh.mdc.MDCParserModelGenerator;
import jsesh.mdc.model.MDCPosition;
import jsesh.mdc.model.TopItemList;
import jsesh.mdc.MDCSyntaxError;

public class JSeshServer {
	public static void main(String[] args) {
		boolean debug = false;

		if (args.length > 2 && (args[1].equals("--debug") || args[1].equals("-d")))
			debug = true;

		try {
			HttpServer srv = HttpServer.create(new InetSocketAddress(5001), 0);
			srv.createContext("/render_mdc", new MDCRenderHandler(debug));
			srv.setExecutor(null);
			srv.start();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	private static class MDCRenderHandler implements HttpHandler  {
		private boolean debug;

		public MDCRenderHandler(boolean debug) {
			this.debug = debug;
		}

		@Override
		public void handle(HttpExchange t) throws IOException {
			String query = t.getRequestURI().getRawQuery();
			String[] components = query.split("=", 2);
			if (query.contains("&") || !components[0].equals("mdc")) {
				t.sendResponseHeaders(400, 0);
				t.getResponseBody().close();
				return;
			}

			try {
				String mdc = URLDecoder.decode(components[1], "utf-8");

				MDCParserModelGenerator gen = new MDCParserModelGenerator();
				gen.setPhilologyAsSigns(true);
				gen.setDebug(debug);

				TopItemList l = gen.parse(new StringReader(mdc));
				DrawingSpecificationsImplementation ds = new DrawingSpecificationsImplementation();
				MDCPosition start = new MDCPosition(l, 0), end = new MDCPosition(l, l.getNumberOfChildren());
				ExportData data = new ExportData(ds, start, end, l, 1.0);

				StringWriter sw = new StringWriter();
				GraphicsProxy gp = new GraphicsProxy(sw);
				SelectionExporter exp = new SelectionExporter(data, gp);
				exp.setClearBeforeDrawing(false);
				exp.exportSelection();

				String svg = sw.getBuffer().toString();
				t.sendResponseHeaders(200, svg.length());
				OutputStream os = t.getResponseBody();
				os.write(svg.getBytes());
				os.close();
			} catch (MDCSyntaxError e) {
				t.sendResponseHeaders(400, 0);
				t.getResponseBody().close();
				return;
			}
		}
	}

	private static class GraphicsProxy implements BaseGraphics2DFactory {
		Dimension2D dim;
		StringWriter writer;

		public GraphicsProxy(StringWriter writer) {
			this.dim = null;
			this.writer = writer;
		}

		public void setDimension(Dimension2D dim) {
			this.dim = dim;
		}

		public void writeGraphics() {
		}

		public void newPage() {
		}

		public SVGGraphics2D buildGraphics() throws IOException {
			return new SVGGraphics2D(writer, dim);
		}
	}
}

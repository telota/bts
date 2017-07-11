package org.bbaw.bts.commons;

public class OSValidator {

    public enum OSType { WINDOWS, MAC, LINUX };

	public static String osName;
	public static OSType osType;
	static {
	    osName = System.getProperty("os.name");
	    String foo = osName.toLowerCase();
	    if (foo.contains("win"))
	        osType = OSType.WINDOWS;
	    else if (foo.contains("mac"))
	        osType = OSType.MAC;
	    else
	        osType = OSType.LINUX;
    };

    public static boolean isWindows() {
        return osType == OSType.WINDOWS;
    }

    public static boolean isMac() {
        return osType == OSType.MAC;
    }

    public static boolean isUnix() {
        // FIXME Rename to isLinux
        return osType == OSType.LINUX;
    }
}

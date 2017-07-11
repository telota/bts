// FIXME javascript korrigieren
function (doc, userCtx, secObj) {
    if (!doc.visibility) {
        return;
    } else {
        if (doc.visibility == 'public' || doc.visibility == 'repository' || doc.visibility == 'project') {
            return;
        }
    }
    if (userCtx.roles.indexOf('_admin') !== -1 || userCtx.roles.indexOf('admin') !== -1) {
        return;
    } else if (secObj && secObj.admins && secObj.admins.roles) {
        for (var i = 0, l = secObj.admins.roles.length; i < l; i++) {
            if (userCtx.roles.indexOf(secObj.admins.roles[i]) !== -1) {
                return;
            }
        }
    } else {
        if (userCtx.roles.indexOf('editors') !== -1) {
            return;
        }
        if (secObj && secObj.editors && secObj.editors.roles) {
            for (var i = 0, l = secObj.editors.roles.length; i < l; i++) {
                if (userCtx.roles.indexOf(secObj.editors[i]) !== -1) {
                    return;
                }
            }
        }
        for (var i = 0, l = doc.readers.length; i < l; i++) {
            if (doc.readers[i] == userCtx.name) {
                return;
            }
            if (userCtx.roles.indexOf(doc.readers[i]) !== -1) {
                return;
            }
        }
    }
    throw({forbidden: secObj.admins.names[0] + secObj.editors.names[0] + 'name: ' + userCtx.name + userCtx.roles[0] + ' ' + userCtx.roles[1] + ' Only admins may edit the database. writers: ' + doc.readers[0]});
}
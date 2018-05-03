package php.pkg.jphpswtdialogext;

import php.pkg.jphpswtdialogext.classes.UIDialogs;
import php.runtime.env.CompileScope;
import php.runtime.ext.support.Extension;

public class JphpSwtDialogExtExtension extends Extension {
    public static final String NS = "jphpswtdialogext";
    
    @Override
    public Status getStatus() {
        return Status.EXPERIMENTAL;
    }
    
    @Override
    public void onRegister(CompileScope scope) {
        // register classes ...
        registerClass(scope, UIDialogs.class);
    }
}
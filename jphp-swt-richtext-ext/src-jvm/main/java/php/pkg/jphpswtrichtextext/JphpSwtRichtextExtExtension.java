package php.pkg.jphpswtrichtextext;

import php.runtime.env.CompileScope;
import php.runtime.ext.support.Extension;

public class JphpSwtRichtextExtExtension extends Extension {
    public static final String NS = "swt";
    
    @Override
    public Status getStatus() {
        return Status.EXPERIMENTAL;
    }
    
    @Override
    public void onRegister(CompileScope scope) {
        // register classes ...

    }
}
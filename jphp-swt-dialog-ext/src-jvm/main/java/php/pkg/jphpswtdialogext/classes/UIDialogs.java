package php.pkg.jphpswtdialogext.classes;

import org.eclipse.nebula.widgets.opal.dialog.Dialog;
import org.eclipse.swt.widgets.Shell;
import php.pkg.jphpswtext.JphpSwtExtExtension;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Nullable;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.lang.BaseObject;
import php.runtime.reflection.ClassEntity;

@Namespace(JphpSwtExtExtension.NS)
public class UIDialogs extends BaseObject {
    public UIDialogs(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    private void __construct() {
    }

    @Signature
    public static void info(String title, String text) {
        Dialog.inform(title, text);
    }

    @Signature
    public static void info(String title, String text, @Nullable Shell shell) {
        Dialog.inform(shell, title, text);
    }

    @Signature
    public static void error(String title, String text) {
        Dialog.error(title, text);
    }

    @Signature
    public static void error(String title, String text, @Nullable Shell shell) {
        Dialog.error(shell, title, text);
    }

    @Signature
    public static boolean confirm(String title, String text) {
        return Dialog.isConfirmed(title, text);
    }

    @Signature
    public static boolean confirm(String title, String text, @Nullable Shell shell) {
        return Dialog.isConfirmed(shell, title, text);
    }
}

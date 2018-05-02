package php.pkg.jphpswtext.classes;

import php.pkg.jphpswtext.JphpSwtExtExtension;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.ext.java.JavaException;
import php.runtime.reflection.ClassEntity;

@Reflection.Namespace(JphpSwtExtExtension.NS)
public class UIException extends JavaException {
    public UIException(Environment env, Throwable throwable) {
        super(env, throwable);
    }

    public UIException(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
}

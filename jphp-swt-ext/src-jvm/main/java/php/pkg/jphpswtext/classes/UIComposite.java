package php.pkg.jphpswtext.classes;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import php.pkg.jphpswtext.JphpSwtExtExtension;
import php.runtime.Memory;
import php.runtime.annotation.Reflection;
import php.runtime.annotation.Reflection.Getter;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

import java.util.Arrays;
import java.util.List;

@Namespace(JphpSwtExtExtension.NS)
abstract public class UIComposite<T extends Composite> extends UIControl<T> {
    public UIComposite(Environment env, T wrappedObject) {
        super(env, wrappedObject);
    }

    public UIComposite(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Getter
    public List<Control> getChildren() {
        Control[] children = getWrappedObject().getChildren();
        return Arrays.asList(children);
    }
}

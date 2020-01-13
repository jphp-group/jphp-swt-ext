package php.pkg.jphpswtext.classes;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import php.pkg.jphpswtext.JphpSwtExtExtension;
import php.pkg.jphpswtext.support.WidgetEventManager;
import php.runtime.annotation.Reflection;
import php.runtime.annotation.Reflection.Getter;
import php.runtime.annotation.Reflection.Setter;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Reflection.Namespace(JphpSwtExtExtension.NS)
public class UIButton extends UIControl<Button> {
    public static final int PUSH = SWT.PUSH;
    public static final int ARROW = SWT.ARROW;
    public static final int CHECK = SWT.CHECK;
    public static final int RADIO = SWT.RADIO;
    public static final int TOGGLE = SWT.TOGGLE;
    public static final int FLAT = SWT.FLAT;
    public static final int WRAP = SWT.WRAP;

    public UIButton(Environment env, Button wrappedObject) {
        super(env, wrappedObject);
    }

    public UIButton(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public void __construct(Composite composite) {
        __wrappedObject = new Button(composite, SWT.PUSH);
    }

    @Signature
    public void __construct(Composite composite, int type) {
        __wrappedObject = new Button(composite, type);
    }

    @Getter
    public String getText() {
        return getWrappedObject().getText();
    }

    @Setter
    public void setText(String text) {
        getWrappedObject().setText(text);
    }

    public WidgetEventManager actionEventManager() {
        return new WidgetEventManager(this, SWT.Selection);
    }
}

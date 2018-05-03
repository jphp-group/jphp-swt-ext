package php.pkg.jphpswtext.classes;

import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Display;
import php.pkg.jphpswtext.JphpSwtExtExtension;
import php.runtime.annotation.Reflection;
import php.runtime.annotation.Reflection.Getter;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;

@Namespace(JphpSwtExtExtension.NS)
public class UIDisplay extends BaseWrapper<Display> {
    public UIDisplay(Environment env, Display wrappedObject) {
        super(env, wrappedObject);
    }

    public UIDisplay(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public void __construct() {
        __wrappedObject = new Display();
    }

    @Signature
    public void close() {
        getWrappedObject().close();
    }

    @Signature
    public void beep() {
        getWrappedObject().beep();
    }

    @Getter
    public Point getCursorPosition() {
        return getWrappedObject().getCursorLocation();
    }

    @Getter
    public void setCursorPosition(Point point) {
        getWrappedObject().setCursorLocation(point);
    }

    @Signature
    public boolean readAndDispatch() {
        return getWrappedObject().readAndDispatch();
    }

    @Signature
    public void sleep() {
        getWrappedObject().sleep();
    }

    @Signature
    public void wake() {
        getWrappedObject().wake();
    }

    @Signature
    public void update() {
        getWrappedObject().update();
    }

    @Signature
    public void free() {
        getWrappedObject().dispose();
    }

    @Signature
    public boolean isFree() {
        return getWrappedObject().isDisposed();
    }

    @Signature
    public static Display getDefault() {
        return Display.getDefault();
    }

    @Signature
    public static Display getCurrent() {
        return Display.getCurrent();
    }
}

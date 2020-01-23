package php.pkg.jphpswtext.classes;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Widget;
import php.pkg.jphpswtext.JphpSwtExtExtension;
import php.pkg.jphpswtext.support.EventManager;
import php.pkg.jphpswtext.support.WidgetEventManager;
import php.runtime.annotation.Reflection.Getter;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.invoke.Invoker;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;

import java.lang.reflect.InvocationTargetException;

@Namespace(JphpSwtExtExtension.NS)
abstract public class UIWidget<T extends Widget> extends BaseWrapper<T> {
    public UIWidget(Environment env, T wrappedObject) {
        super(env, wrappedObject);
    }

    public UIWidget(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Override
    public T getWrappedObject() {
        return super.getWrappedObject();
    }

    @Getter
    public Display getDisplay() {
        return getWrappedObject().getDisplay();
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
    public void data(String name, Object value) {
        getWrappedObject().setData(name, value);
    }

    @Signature
    public Object data(String name) {
        return getWrappedObject().getData(name);
    }

    @Signature
    public void bind(Environment env, String event, Invoker invoker) throws InvocationTargetException, IllegalAccessException {
        EventManager.create(this, event).bind(env, invoker);
    }

    @Signature
    public void unbind(Environment env, String event) throws InvocationTargetException, IllegalAccessException {
        EventManager.create(this, event).unbind(env);
    }

    @Signature
    public void trigger(Environment env, String event) throws InvocationTargetException, IllegalAccessException {
        EventManager.create(this, event).trigger(env);
    }

    public WidgetEventManager paintEventManager() {
        return new WidgetEventManager(this, SWT.Paint);
    }

    public WidgetEventManager keyUpEventManager() {
        return new WidgetEventManager(this, SWT.KeyUp);
    }

    public WidgetEventManager keyDownEventManager() {
        return new WidgetEventManager(this, SWT.KeyDown);
    }
}

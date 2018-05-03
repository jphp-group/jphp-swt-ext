package php.pkg.jphpswtext.classes;

import org.develnext.jphp.ext.image.classes.PColor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import php.pkg.jphpswtext.JphpSwtExtExtension;
import php.pkg.jphpswtext.support.EventManager;
import php.pkg.jphpswtext.support.WidgetEventManager;
import php.runtime.annotation.Reflection;
import php.runtime.annotation.Reflection.Getter;
import php.runtime.annotation.Reflection.Setter;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.invoke.Invoker;
import php.runtime.reflection.ClassEntity;

@Reflection.Namespace(JphpSwtExtExtension.NS)
abstract public class UIControl<T extends Control> extends UIWidget<T> {
    public UIControl(Environment env, T wrappedObject) {
        super(env, wrappedObject);
    }

    public UIControl(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    public EventManager mouseDownEventManager() {
        return new WidgetEventManager(this, SWT.MouseDown);
    }

    public EventManager mouseUpEventManager() {
        return new WidgetEventManager(this, SWT.MouseUp);
    }

    @Getter
    public boolean isEnabled() {
        return getWrappedObject().isEnabled();
    }

    @Setter
    public void setEnabled(boolean value) {
        getWrappedObject().setEnabled(value);
    }

    @Getter
    public boolean isVisible() {
        return getWrappedObject().isVisible();
    }

    @Setter
    public void setVisible(boolean value) {
        getWrappedObject().setVisible(value);
    }

    @Getter
    public Color getBackground() {
        return getWrappedObject().getBackground();
    }

    @Getter
    public void setBackground(Color color) {
        getWrappedObject().setBackground(color);
    }

    @Getter
    public Point getSize() {
        return getWrappedObject().getSize();
    }

    @Setter
    public void setSize(Point point) {
        getWrappedObject().setSize(point);
    }

    @Getter
    public Point getPosition() {
        return getWrappedObject().getLocation();
    }

    @Setter
    public void setPosition(Point point) {
        getWrappedObject().setLocation(point);
    }

    @Getter
    public boolean getFocused() {
        return getWrappedObject().isFocusControl();
    }

    @Getter
    public Composite getParent() {
        return getWrappedObject().getParent();
    }

    @Setter
    public void setParent(Composite parent) {
        getWrappedObject().setParent(parent);
    }

    @Signature
    public void pack() {
        getWrappedObject().pack();
    }

    @Signature
    public void requestFocus() {
        getWrappedObject().setFocus();
    }
}

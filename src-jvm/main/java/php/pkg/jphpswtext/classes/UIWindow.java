package php.pkg.jphpswtext.classes;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Monitor;
import org.eclipse.swt.widgets.Shell;
import php.pkg.jphpswtext.JphpSwtExtExtension;
import php.pkg.jphpswtext.support.EventManager;
import php.pkg.jphpswtext.support.WidgetEventManager;
import php.runtime.annotation.Reflection;
import php.runtime.annotation.Reflection.Getter;
import php.runtime.annotation.Reflection.Nullable;
import php.runtime.annotation.Reflection.Setter;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Reflection.Namespace(JphpSwtExtExtension.NS)
public class UIWindow extends UIComposite<Shell> {
    public UIWindow(Environment env, Shell wrappedObject) {
        super(env, wrappedObject);
    }

    public UIWindow(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public void __construct() {
        __wrappedObject = new Shell();
    }

    @Signature
    public void __construct(@Nullable Display display) {
        __wrappedObject = new Shell(display);
    }

    @Setter
    public void setOpacity(float value) {
        getWrappedObject().setAlpha((int)(value * 255));
    }

    @Getter
    public float getOpacity() {
        float opacity = getWrappedObject().getAlpha() / 255.0f;
        return opacity >= 1.0f ? 1.0f : opacity;
    }

    @Setter
    public void setTitle(String value) {
        getWrappedObject().setText(value);
    }

    @Getter
    public String getTitle() {
        return getWrappedObject().getText();
    }

    @Setter
    public void setFullscreen(boolean value) {
        getWrappedObject().setFullScreen(value);
    }

    @Getter
    public boolean isFullscreen() {
        return getWrappedObject().getFullScreen();
    }

    @Setter
    public void setMaximized(boolean value) {
        getWrappedObject().setMaximized(value);
    }

    @Getter
    public boolean isMaximized() {
        return getWrappedObject().getMaximized();
    }

    @Signature
    public void close() {
        getWrappedObject().close();
    }

    @Signature
    public void open() {
        getWrappedObject().open();
    }

    @Signature
    public void center() {
        Monitor monitor = getWrappedObject().getMonitor();

        Rectangle bounds = monitor.getBounds();
        Rectangle rect = getWrappedObject().getBounds();

        int x = bounds.x + (bounds.width - rect.width) / 2;
        int y = bounds.y + (bounds.height - rect.height) / 2;

        getWrappedObject().setLocation(x, y);
    }

    public EventManager closeEventManager() {
        return new WidgetEventManager(this, SWT.Close);
    }

    public EventManager activateEventManager() {
        return new WidgetEventManager(this, SWT.Activate);
    }

    public EventManager deactivateEventManager() {
        return new WidgetEventManager(this, SWT.Deactivate);
    }

    public EventManager iconifyEventManager() {
        return new WidgetEventManager(this, SWT.Iconify);
    }

    public EventManager deiconifyEventManager() {
        return new WidgetEventManager(this, SWT.Deiconify);
    }
}

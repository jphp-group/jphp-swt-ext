package php.pkg.jphpswtext.support;

import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Widget;
import php.pkg.jphpswtext.classes.UIWidget;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.invoke.Invoker;

public class WidgetEventManager extends EventManager {
    private final Widget widget;
    private final int eventType;

    public WidgetEventManager(Widget widget, int eventType) {
        this.widget = widget;
        this.eventType = eventType;
    }

    public WidgetEventManager(UIWidget widget, int eventType) {
        this.widget = widget.getWrappedObject();
        this.eventType = eventType;
    }

    @Override
    public void bind(Environment env, Invoker invoker) {
        this.widget.addListener(eventType, event -> invoker.callAny(Memory.wrap(env, event)));
    }

    @Override
    public void unbind(Environment env) {
        Listener[] listeners = widget.getListeners(eventType);
        for (Listener listener : listeners) {
            widget.removeListener(eventType, listener);
        }
    }

    @Override
    public void trigger(Environment env) {
        Listener[] listeners = widget.getListeners(eventType);
        for (Listener listener : listeners) {
            listener.handleEvent(new Event());
        }
    }
}

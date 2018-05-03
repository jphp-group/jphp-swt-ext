package php.pkg.jphpswtext.support;

import org.eclipse.swt.SWTException;
import org.eclipse.swt.widgets.Widget;
import php.runtime.env.Environment;
import php.runtime.exceptions.CriticalException;
import php.runtime.invoke.Invoker;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

abstract public class EventManager {
    abstract public void bind(Environment env, Invoker invoker);
    abstract public void unbind(Environment env);
    abstract public void trigger(Environment env);

    public static EventManager create(Object context, String event) {
        String method = event + "EventManager";
        try {
            Method bindMethod = context.getClass().getMethod(method);
            bindMethod.setAccessible(true);

            try {
                return (EventManager) bindMethod.invoke(context);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new CriticalException(e);
            }
        } catch (NoSuchMethodException e) {
            throw new SWTException("Widget hasn't the '" + event+ "' event, " + e.getMessage());
        }
    }
}

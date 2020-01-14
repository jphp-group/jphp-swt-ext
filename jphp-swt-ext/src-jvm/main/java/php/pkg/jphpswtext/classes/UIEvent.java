package php.pkg.jphpswtext.classes;

import org.eclipse.swt.widgets.Display;
import php.pkg.jphpswtext.JphpSwtExtExtension;
import php.runtime.Memory;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import org.eclipse.swt.widgets.Event;
import php.runtime.reflection.ClassEntity;

@Reflection.Namespace(JphpSwtExtExtension.NS)
public class UIEvent extends BaseWrapper<Event> {
    public UIEvent(Environment env, Event wrappedObject) {
        super(env, wrappedObject);
    }

    public UIEvent(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Reflection.Getter
    public Display getDisplay() {
        return getWrappedObject().display;
    }

    @Reflection.Getter
    public Memory getWidget() {
        return Memory.wrap(getEnvironment(), getWrappedObject().widget);
    }

    @Reflection.Getter
    public int getX() {
        return getWrappedObject().x;
    }

    @Reflection.Getter
    public int getY() {
        return getWrappedObject().y;
    }

    @Reflection.Getter
    public int getWidth() {
        return getWrappedObject().width;
    }

    @Reflection.Getter
    public int getHeight() {
        return getWrappedObject().height;
    }

    @Reflection.Getter
    public int getCount() {
        return getWrappedObject().count;
    }

    @Reflection.Getter
    public int getTime() {
        return getWrappedObject().time;
    }

    @Reflection.Getter
    public int getButton() {
        return getWrappedObject().button;
    }

    @Reflection.Getter
    public char getCharacter() {
        return getWrappedObject().character;
    }

    @Reflection.Getter
    public int getKeyCode() {
        return getWrappedObject().keyCode;
    }

    @Reflection.Getter
    public int getKeyLocation() {
        return getWrappedObject().keyLocation;
    }

    @Reflection.Getter
    public int getStateMask() {
        return getWrappedObject().stateMask;
    }

    @Reflection.Getter
    public int getStart() {
        return getWrappedObject().start;
    }

    @Reflection.Getter
    public int getEnd() {
        return getWrappedObject().end;
    }

    @Reflection.Getter
    public String getText() {
        return getWrappedObject().text;
    }

    @Reflection.Getter
    public Object getData() {
        return getWrappedObject().data;
    }

    @Reflection.Getter
    public int getXDirection() {
        return getWrappedObject().xDirection;
    }

    @Reflection.Getter
    public int getYDirection() {
        return getWrappedObject().yDirection;
    }

    @Reflection.Getter
    public double getMagnification() {
        return getWrappedObject().magnification;
    }

    @Reflection.Getter
    public double getRotation() {
        return getWrappedObject().rotation;
    }
}

package php.pkg.jphpswtext.bind;

import org.develnext.jphp.ext.image.classes.PColor;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGBA;
import php.runtime.Memory;
import php.runtime.env.Environment;
import php.runtime.env.TraceInfo;
import php.runtime.memory.ObjectMemory;
import php.runtime.memory.support.MemoryOperation;
import php.runtime.reflection.ParameterEntity;
import php.runtime.reflection.support.TypeChecker;

public class ColorMemoryOperation extends MemoryOperation<Color> {
    @Override
    public Class<?>[] getOperationClasses() {
        return new Class[] { Color.class };
    }

    @Override
    public Color convert(Environment environment, TraceInfo traceInfo, Memory memory) throws Throwable {
        if (memory.isNull()) return null;

        PColor pColor;
        if (memory.instanceOf(PColor.class)) {
            pColor = memory.toObject(PColor.class);
        } else {
            pColor = new PColor(environment, memory.toString());
        }

        return new Color(
                null,
                new RGBA(pColor.getRed(), pColor.getGreen(), pColor.getBlue(), pColor.getAlpha())
        );
    }

    @Override
    public Memory unconvert(Environment environment, TraceInfo traceInfo, Color color) throws Throwable {
        if (color == null) {
            return Memory.NULL;
        }

        return ObjectMemory.valueOf(new PColor(
                environment,new java.awt.Color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha())
        ));
    }

    @Override
    public void applyTypeHinting(ParameterEntity parameter) {

    }
}

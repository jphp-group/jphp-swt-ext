package php.pkg.jphpswtext.bind;

import org.eclipse.swt.graphics.Point;
import php.runtime.Memory;
import php.runtime.common.HintType;
import php.runtime.env.Environment;
import php.runtime.env.TraceInfo;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.support.MemoryOperation;
import php.runtime.reflection.ParameterEntity;

public class PointMemoryOperation extends MemoryOperation<Point> {
    @Override
    public Class<?>[] getOperationClasses() {
        return new Class[] { Point.class };
    }

    @Override
    public Point convert(Environment environment, TraceInfo traceInfo, Memory memory) throws Throwable {
        return memory.isNull() ? null : new Point(memory.valueOfIndex(0).toInteger(), memory.valueOfIndex(1).toInteger());
    }

    @Override
    public Memory unconvert(Environment environment, TraceInfo traceInfo, Point point) throws Throwable {
        return ArrayMemory.ofIntegers(point.x, point.y);
    }

    @Override
    public void applyTypeHinting(ParameterEntity parameter) {
        parameter.setType(HintType.ARRAY);
    }
}

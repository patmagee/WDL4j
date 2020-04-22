package io.github.patmagee.wdl4j.v1.typing;

public class FloatType extends Type {

    private static final FloatType INSTANCE = new FloatType();

    public static FloatType getType() {
        return INSTANCE;
    }

    private FloatType() {

    }

    @Override
    public String getTypeName() {
        return "Float";
    }
}

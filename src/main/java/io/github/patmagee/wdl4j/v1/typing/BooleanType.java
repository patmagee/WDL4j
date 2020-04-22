package io.github.patmagee.wdl4j.v1.typing;

public class BooleanType extends Type {

    private static final BooleanType INSTANCE = new BooleanType();

    public static BooleanType getType() {
        return INSTANCE;
    }

    private BooleanType() {
    }

    @Override
    public String getTypeName() {
        return "Boolean";
    }
}

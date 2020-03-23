package io.github.patmagee.wdl4j.v1.typing;

public class ObjectType extends Type {

    private static final ObjectType INSTANCE = new ObjectType();

    private ObjectType() {

    }

    public static ObjectType getType() {
        return INSTANCE;
    }

    @Override
    public String getTypeName() {
        return "Object";
    }
}

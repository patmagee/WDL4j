package io.github.patmagee.wdl4j.v1.expression.literal;

import io.github.patmagee.wdl4j.v1.expression.Expression;
import lombok.NonNull;
import lombok.Value;

@Value
public class BooleanLiteral extends Expression {

    @NonNull
    private final boolean value;

}
package org.openwdl.wdl4j.expression;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FloatLiteral extends Expression {

    private Float value;

    @Override
    public String getElementName() {
        return "Int";
    }
}
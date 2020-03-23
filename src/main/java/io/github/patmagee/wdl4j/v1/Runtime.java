package io.github.patmagee.wdl4j.v1;

import io.github.patmagee.wdl4j.v1.api.WdlElement;
import io.github.patmagee.wdl4j.v1.expression.Expression;

import java.util.Map;
import java.util.Objects;

public class Runtime implements WdlElement {

    private final Map<String, Expression> attributes;

    public static Builder newBuilder() {
        return new Builder();
    }

    public Runtime(Map<String, Expression> attributes) {
        this.attributes = attributes;
    }

    private Runtime(Builder builder) {
        attributes = builder.attributes;
    }

    public Map<String, Expression> getAttributes() {
        return attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Runtime runtime = (Runtime) o;
        return Objects.equals(attributes, runtime.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attributes);
    }

    public static final class Builder {

        private Map<String, Expression> attributes;

        private Builder() {
        }

        public Builder withAttributes(Map<String, Expression> val) {
            attributes = val;
            return this;
        }

        public Runtime build() {
            return new Runtime(this);
        }
    }

}

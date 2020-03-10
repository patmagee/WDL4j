package org.openwdl.wdl4j.v1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.openwdl.wdl4j.v1.api.WdlElement;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Version implements WdlElement {

    private String release;

    @Override
    public String getElementName() {
        return "version " + release;
    }
}
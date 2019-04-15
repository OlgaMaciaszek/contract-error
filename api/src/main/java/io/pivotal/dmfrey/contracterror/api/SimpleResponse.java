package io.pivotal.dmfrey.contracterror.api;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SimpleResponse {

    private final Simple simple;

}

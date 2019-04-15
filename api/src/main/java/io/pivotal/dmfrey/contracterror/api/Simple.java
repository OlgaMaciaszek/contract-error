package io.pivotal.dmfrey.contracterror.api;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Simple {

    private final String message;
    private final LocalDate dateCompleted;

}

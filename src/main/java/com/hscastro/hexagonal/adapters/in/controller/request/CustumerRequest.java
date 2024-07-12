package com.hscastro.hexagonal.adapters.in.controller.request;

import lombok.Data;
import javax.validation.constraints.NotBlank;

@Data
public class CustumerRequest {

    @NotBlank
    private String name;

    @NotBlank
    private String cpf;

    @NotBlank
    private String zipCode;

    public String getZipCode() {
        return zipCode;
    }
}

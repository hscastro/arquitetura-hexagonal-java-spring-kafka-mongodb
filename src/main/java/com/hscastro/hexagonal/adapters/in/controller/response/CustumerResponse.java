package com.hscastro.hexagonal.adapters.in.controller.response;

import com.hscastro.hexagonal.application.core.domain.Address;
import lombok.Data;

@Data
public class CustumerResponse {
    private String id;
    private String name;
    private Address address;
    private String cpf;
    private boolean isValidaCpf;
}

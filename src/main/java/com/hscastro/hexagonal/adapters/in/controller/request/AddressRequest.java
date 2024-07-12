package com.hscastro.hexagonal.adapters.in.controller.request;

import lombok.Data;

@Data
public class AddressRequest {
    private String street;
    private String city;
    private String state;
}

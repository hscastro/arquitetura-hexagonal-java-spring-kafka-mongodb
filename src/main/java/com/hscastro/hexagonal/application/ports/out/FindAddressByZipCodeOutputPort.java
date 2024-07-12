package com.hscastro.hexagonal.application.ports.out;

import com.hscastro.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);
}

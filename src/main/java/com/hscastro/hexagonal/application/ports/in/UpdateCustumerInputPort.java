package com.hscastro.hexagonal.application.ports.in;

import com.hscastro.hexagonal.application.core.domain.Custumer;

public interface UpdateCustumerInputPort {

     void updateCustumer(Custumer custumer, String zipCode);
}

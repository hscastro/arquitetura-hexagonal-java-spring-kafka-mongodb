package com.hscastro.hexagonal.application.ports.in;

import com.hscastro.hexagonal.application.core.domain.Custumer;
import com.hscastro.hexagonal.application.ports.out.InsertCustumerOutputPort;

public interface InsertCustumerInputPort {

     void insertCustumer(Custumer custumer, String zipCode);
}

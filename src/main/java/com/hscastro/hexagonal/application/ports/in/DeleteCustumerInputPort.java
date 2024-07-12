package com.hscastro.hexagonal.application.ports.in;

import com.hscastro.hexagonal.application.core.domain.Custumer;

public interface DeleteCustumerInputPort {

     void deleteCustumer(Custumer custumer);
}

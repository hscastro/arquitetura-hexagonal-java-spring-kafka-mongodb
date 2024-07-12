package com.hscastro.hexagonal.application.ports.in;

import com.hscastro.hexagonal.application.core.domain.Custumer;

public interface FindCustumerByIdInputPort {

    Custumer findCustumer(String id);
}

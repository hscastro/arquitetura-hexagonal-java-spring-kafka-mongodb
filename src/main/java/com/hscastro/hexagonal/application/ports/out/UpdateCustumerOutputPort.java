package com.hscastro.hexagonal.application.ports.out;

import com.hscastro.hexagonal.application.core.domain.Custumer;

public interface UpdateCustumerOutputPort {

    void update(Custumer custumer);
}

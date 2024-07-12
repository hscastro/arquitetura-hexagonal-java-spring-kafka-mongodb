package com.hscastro.hexagonal.application.ports.out;

import com.hscastro.hexagonal.application.core.domain.Custumer;

import java.util.Optional;

public interface FindCustumerByIdOuputPort {

    Optional<Custumer> findCustumer(String id);
}

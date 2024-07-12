package com.hscastro.hexagonal.application.core.usecase;

import com.hscastro.hexagonal.application.core.domain.Custumer;
import com.hscastro.hexagonal.application.ports.in.FindCustumerByIdInputPort;
import com.hscastro.hexagonal.application.ports.out.FindCustumerByIdOuputPort;


public class FindCustumerByIdUseCase implements FindCustumerByIdInputPort {

    private FindCustumerByIdOuputPort findCustumerByIdOuputPort;

    public FindCustumerByIdUseCase(FindCustumerByIdOuputPort findCustumerByIdOuputPort){
        this.findCustumerByIdOuputPort = findCustumerByIdOuputPort;
    }

    @Override
    public Custumer findCustumer(String id) {
        return this.findCustumerByIdOuputPort.findCustumer(id)
                .orElseThrow(() -> new RuntimeException("Custumer  not found!"));
    }
}

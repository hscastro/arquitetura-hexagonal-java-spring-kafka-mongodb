package com.hscastro.hexagonal.application.core.usecase;

import com.hscastro.hexagonal.application.core.domain.Custumer;
import com.hscastro.hexagonal.application.ports.in.DeleteCustumerInputPort;
import com.hscastro.hexagonal.application.ports.in.FindCustumerByIdInputPort;
import com.hscastro.hexagonal.application.ports.out.DeleteCustumerOutputPort;

public class DeleteCustumerUseCase implements DeleteCustumerInputPort {

    private final FindCustumerByIdInputPort findCustumerByIdInputPort;

    private final DeleteCustumerOutputPort deleteCustumerOutputPort;

    public DeleteCustumerUseCase(FindCustumerByIdInputPort findCustumerByIdInputPort,
                                 DeleteCustumerOutputPort deleteCustumerOutputPort) {
        this.findCustumerByIdInputPort = findCustumerByIdInputPort;
        this.deleteCustumerOutputPort = deleteCustumerOutputPort;
    }

    @Override
    public void deleteCustumer(Custumer custumer) {
        var address = this.findCustumerByIdInputPort.findCustumer(custumer.getId());
        deleteCustumerOutputPort.delete(custumer.getId());
    }
}

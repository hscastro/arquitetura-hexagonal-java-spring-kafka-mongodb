package com.hscastro.hexagonal.application.core.usecase;

import com.hscastro.hexagonal.application.core.domain.Custumer;
import com.hscastro.hexagonal.application.ports.in.FindCustumerByIdInputPort;
import com.hscastro.hexagonal.application.ports.in.UpdateCustumerInputPort;
import com.hscastro.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import com.hscastro.hexagonal.application.ports.out.UpdateCustumerOutputPort;

public class UpdateCustumerUseCase implements UpdateCustumerInputPort {

    private final FindCustumerByIdInputPort findCustumerByIdInputPort;

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;

    private final UpdateCustumerOutputPort updateCustumerOutputPort;


    public UpdateCustumerUseCase(FindCustumerByIdInputPort findCustumerByIdInputPort,
                                 FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
                                 UpdateCustumerOutputPort updateCustumerOutputPort) {
        this.findCustumerByIdInputPort = findCustumerByIdInputPort;
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.updateCustumerOutputPort = updateCustumerOutputPort;
    }

    @Override
    public void updateCustumer(Custumer custumer, String zipCode) {
        findCustumerByIdInputPort.findCustumer(custumer.getId());
        var address = this.findAddressByZipCodeOutputPort.find(zipCode);
        custumer.setAddress(address);
        updateCustumerOutputPort.update(custumer);    }
}

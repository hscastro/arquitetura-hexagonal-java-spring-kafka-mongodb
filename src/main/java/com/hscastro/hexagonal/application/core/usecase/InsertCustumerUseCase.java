package com.hscastro.hexagonal.application.core.usecase;

import com.hscastro.hexagonal.application.core.domain.Custumer;
import com.hscastro.hexagonal.application.ports.in.InsertCustumerInputPort;
import com.hscastro.hexagonal.application.ports.out.InsertCustumerOutputPort;
import com.hscastro.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;

public class InsertCustumerUseCase implements InsertCustumerInputPort {

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;

    private final InsertCustumerOutputPort insertCustumerOutputPort;

    public InsertCustumerUseCase(FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
                                 InsertCustumerOutputPort insertCustumerOutputPort) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustumerOutputPort = insertCustumerOutputPort;
    }

    @Override
    public void insertCustumer(Custumer custumer, String zipCode){
        var address = this.findAddressByZipCodeOutputPort.find(zipCode);
        custumer.setAddress(address);
        insertCustumerOutputPort.insert(custumer);
    }
}

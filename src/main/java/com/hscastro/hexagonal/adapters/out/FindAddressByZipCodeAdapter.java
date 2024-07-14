package com.hscastro.hexagonal.adapters.out;

import com.hscastro.hexagonal.adapters.out.client.AddressResponseMapper;
import com.hscastro.hexagonal.adapters.out.client.FindAddressByZipCodeClient;
import com.hscastro.hexagonal.application.core.domain.Address;
import com.hscastro.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import org.mapstruct.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

//    @Autowired
//    private AddressResponseMapper addressResponseMapper;

    @Autowired
    private ModelMapper mapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        var response = mapper.map(addressResponse, Address.class);
        //return addressResponseMapper.toAddress(addressResponse);
        return response;
    }
}

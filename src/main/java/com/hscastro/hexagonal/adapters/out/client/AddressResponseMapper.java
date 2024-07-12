package com.hscastro.hexagonal.adapters.out.client;


import com.hscastro.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

  Address toAddress(AddressResponse addressResponse);
}

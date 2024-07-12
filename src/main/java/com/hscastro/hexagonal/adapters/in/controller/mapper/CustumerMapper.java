package com.hscastro.hexagonal.adapters.in.controller.mapper;

import com.hscastro.hexagonal.adapters.in.controller.request.CustumerRequest;
import com.hscastro.hexagonal.adapters.in.controller.response.CustumerResponse;
import com.hscastro.hexagonal.application.core.domain.Custumer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustumerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    Custumer toCustumer(CustumerRequest custumerRequest);

    CustumerResponse toCustumerResponse(Custumer custumer);
}

package com.hscastro.hexagonal.adapters.out.repositoy.mapper;

import com.hscastro.hexagonal.adapters.out.repositoy.entity.CustumerEntity;
import com.hscastro.hexagonal.application.core.domain.Custumer;
import org.mapstruct.Mapper;
import org.springframework.context.annotation.Primary;

@Primary
@Mapper(componentModel = "spring")
public interface CustumerEntityMapper {

    CustumerEntity toCustumerEntity(Custumer custumer);
    Custumer toCustumer(CustumerEntity custumerEntity);

}

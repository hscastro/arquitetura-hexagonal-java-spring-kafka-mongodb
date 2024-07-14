package com.hscastro.hexagonal.adapters.out;

import com.hscastro.hexagonal.adapters.out.repositoy.CustumerRepository;
import com.hscastro.hexagonal.adapters.out.repositoy.entity.CustumerEntity;
import com.hscastro.hexagonal.adapters.out.repositoy.mapper.CustumerEntityMapper;
import com.hscastro.hexagonal.application.core.domain.Custumer;
import com.hscastro.hexagonal.application.ports.out.InsertCustumerOutputPort;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustumerAdapter implements InsertCustumerOutputPort {

    @Autowired
    private CustumerRepository custumerRepository;

    //@Autowired
    //private CustumerEntityMapper custumerEntityMapper;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void insert(Custumer custumer) {
          //var custumerEntity = custumerEntityMapper.toCustumerEntity(custumer);
          var custumerEntity = modelMapper.map(custumer, CustumerEntity.class);
          custumerRepository.insert(custumerEntity);
    }
}

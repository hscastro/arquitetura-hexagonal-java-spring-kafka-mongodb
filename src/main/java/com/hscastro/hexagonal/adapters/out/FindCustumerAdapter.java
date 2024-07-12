package com.hscastro.hexagonal.adapters.out;

import com.hscastro.hexagonal.adapters.out.repositoy.CustumerRepository;
import com.hscastro.hexagonal.adapters.out.repositoy.mapper.CustumerEntityMapper;
import com.hscastro.hexagonal.application.core.domain.Custumer;
import com.hscastro.hexagonal.application.ports.out.FindCustumerByIdOuputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindCustumerAdapter implements FindCustumerByIdOuputPort {

    @Autowired
    private CustumerRepository custumerRepository;

    @Autowired
    private CustumerEntityMapper custumerEntityMapper;

    @Override
    public Optional<Custumer> findCustumer(String id) {
          var custumerEntity = custumerRepository.findById(id);
          return custumerEntity.map(entity -> custumerEntityMapper.toCustumer(entity));
    }
}

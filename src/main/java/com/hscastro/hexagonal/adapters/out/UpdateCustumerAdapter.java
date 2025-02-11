package com.hscastro.hexagonal.adapters.out;

import com.hscastro.hexagonal.adapters.out.repositoy.CustumerRepository;
import com.hscastro.hexagonal.adapters.out.repositoy.mapper.CustumerEntityMapper;
import com.hscastro.hexagonal.application.core.domain.Custumer;
import com.hscastro.hexagonal.application.ports.out.UpdateCustumerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateCustumerAdapter implements UpdateCustumerOutputPort {

    @Autowired
    private CustumerRepository custumerRepository;

    @Autowired
    private CustumerEntityMapper custumerEntityMapper;

    @Override
    public void update(Custumer custumer) {
        var custumerEntiry = custumerEntityMapper.toCustumerEntity(custumer);
        custumerRepository.save(custumerEntiry);
    }
}

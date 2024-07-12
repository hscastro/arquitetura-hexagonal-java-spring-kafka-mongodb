package com.hscastro.hexagonal.adapters.out;

import com.hscastro.hexagonal.adapters.out.repositoy.CustumerRepository;
import com.hscastro.hexagonal.application.ports.out.DeleteCustumerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteCustumerByIdAdapter implements DeleteCustumerOutputPort {

    @Autowired
    private CustumerRepository custumerRepository;

    @Override
    public void delete(String id) {
        custumerRepository.deleteById(id);
    }
}

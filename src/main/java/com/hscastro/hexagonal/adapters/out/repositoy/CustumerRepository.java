package com.hscastro.hexagonal.adapters.out.repositoy;

import com.hscastro.hexagonal.adapters.out.repositoy.entity.CustumerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustumerRepository extends MongoRepository<CustumerEntity, String> {
}

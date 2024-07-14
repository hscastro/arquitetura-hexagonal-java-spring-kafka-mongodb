package com.hscastro.hexagonal.adapters.out.repositoy.entity;

import com.hscastro.hexagonal.application.core.domain.Address;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "custumers")
public class CustumerEntity {

    @Id
    private String id;

    private String nome;

    private Address address;

    private String cpf;

    private Boolean isValidCpf;
}

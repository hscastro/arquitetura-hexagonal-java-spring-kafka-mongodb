package com.hscastro.hexagonal.adapters.out.repositoy.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "custumers")
data class CustumerEntity(

    @Id
    var id: String,
    var name: String,
    var email: String
)

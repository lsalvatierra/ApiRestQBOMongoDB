package com.qbo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.qbo.model.Cliente;

@Repository
public interface ClienteRepository extends MongoRepository<Cliente, String> {

}

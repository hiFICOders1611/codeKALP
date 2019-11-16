package com.hiFICOder.smart.sanchar.mongo.dal;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hiFICOder.smart.sanchar.mongo.model.TravelTransaction;

@Repository
public interface TravelTransactionRepository extends MongoRepository<TravelTransaction, String> {
}

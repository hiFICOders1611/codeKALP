package com.hiFICOder.smart.sanchar.mongo.dal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.hiFICOder.smart.sanchar.mongo.model.TravelTransaction;

@Repository
public class TravelTransactionDALImpl implements TravelTransactionDAL {

	@Autowired
	private MongoTemplate mongoTemplate;


	@Override
	public List<TravelTransaction> getAllTravelTransactionsById(String rfid) {
		Query query = new Query();
		query.addCriteria(Criteria.where("rfid").is(rfid));
		return mongoTemplate.find(query, TravelTransaction.class);
	}

}

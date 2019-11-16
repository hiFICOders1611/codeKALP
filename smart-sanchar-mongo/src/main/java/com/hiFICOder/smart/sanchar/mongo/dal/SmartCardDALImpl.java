package com.hiFICOder.smart.sanchar.mongo.dal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.hiFICOder.smart.sanchar.mongo.model.SmartCard;

@Repository
public class SmartCardDALImpl implements SmartCardDAL {

	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public List<SmartCard> getAllSmartCards() {
		return mongoTemplate.findAll(SmartCard.class);
	}

	@Override
	public SmartCard getSmartCardById(String smartCardId) {
		Query query = new Query();
		query.addCriteria(Criteria.where("smartCardId").is(smartCardId));
		return mongoTemplate.findOne(query, SmartCard.class);
	}

	@Override
	public SmartCard addNewSmartCard(SmartCard smartCard) {
		mongoTemplate.save(smartCard);
		// Now, smartCard object will contain the ID as well
		return smartCard;
	}

}

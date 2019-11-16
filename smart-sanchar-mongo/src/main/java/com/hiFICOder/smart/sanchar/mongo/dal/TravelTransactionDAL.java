package com.hiFICOder.smart.sanchar.mongo.dal;

import java.util.List;

import com.hiFICOder.smart.sanchar.mongo.model.TravelTransaction;

public interface TravelTransactionDAL {
	public List<TravelTransaction> getAllTravelTransactionsById(String rfid);
}
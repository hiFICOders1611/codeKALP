package com.hiFICOder.smart.sanchar.mongo.dal;

import java.util.List;

import com.hiFICOder.smart.sanchar.mongo.model.SmartCard;

public interface SmartCardDAL {

	List<SmartCard> getAllSmartCards();

	SmartCard getSmartCardById(String smartCardId);

	SmartCard addNewSmartCard(SmartCard smartCard);
}
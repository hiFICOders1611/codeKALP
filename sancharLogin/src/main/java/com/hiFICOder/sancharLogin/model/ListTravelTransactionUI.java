package com.hiFICOder.sancharLogin.model;

import java.util.ArrayList;
import java.util.List;


public class ListTravelTransactionUI {
	
private static final long serialVersionUID = 1L;
	
	private List<TravelTransactionUI> listofTravelTrasaction = new ArrayList<TravelTransactionUI>();

	public List<TravelTransactionUI> getListofTravelTrasaction() {
		return listofTravelTrasaction;
	}

	public void setListofTravelTrasaction(List<TravelTransactionUI> listofTravelTrasaction) {
		this.listofTravelTrasaction = listofTravelTrasaction;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}

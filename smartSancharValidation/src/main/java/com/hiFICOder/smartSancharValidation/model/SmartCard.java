package com.hiFICOder.smartSancharValidation.model;

public class SmartCard {
	
	private final String rfid;
    private final String content;
    


    public SmartCard(String rfid, String content) {
		this.rfid = rfid;
        this.content = content;
    }

    public String getId() {
        return rfid;
    }

    public String getContent() {
        return content;
    }

}

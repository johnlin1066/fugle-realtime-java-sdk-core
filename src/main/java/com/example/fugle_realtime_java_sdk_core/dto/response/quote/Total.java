package com.example.fugle_realtime_java_sdk_core.dto.response.quote;

public class Total {
	
	private String at;
	private Double transaction;
	private Double tradeValue;
	private Double tradeVolume;
	private Double tradeVolumeAtBid;
	private Double tradeVolumeAtAsk;
	private Double bidOrders;
	private Double askOrders;
	private Double bidVolume;
	private Double askVolume;
	private Double serial;
	
	public String getAt() {
		return at;
	}
	public void setAt(String at) {
		this.at = at;
	}
	public Double getTransaction() {
		return transaction;
	}
	public void setTransaction(Double transaction) {
		this.transaction = transaction;
	}
	public Double getTradeValue() {
		return tradeValue;
	}
	public void setTradeValue(Double tradeValue) {
		this.tradeValue = tradeValue;
	}
	public Double getTradeVolume() {
		return tradeVolume;
	}
	public void setTradeVolume(Double tradeVolume) {
		this.tradeVolume = tradeVolume;
	}
	public Double getTradeVolumeAtBid() {
		return tradeVolumeAtBid;
	}
	public void setTradeVolumeAtBid(Double tradeVolumeAtBid) {
		this.tradeVolumeAtBid = tradeVolumeAtBid;
	}
	public Double getTradeVolumeAtAsk() {
		return tradeVolumeAtAsk;
	}
	public void setTradeVolumeAtAsk(Double tradeVolumeAtAsk) {
		this.tradeVolumeAtAsk = tradeVolumeAtAsk;
	}
	public Double getBidOrders() {
		return bidOrders;
	}
	public void setBidOrders(Double bidOrders) {
		this.bidOrders = bidOrders;
	}
	public Double getAskOrders() {
		return askOrders;
	}
	public void setAskOrders(Double askOrders) {
		this.askOrders = askOrders;
	}
	public Double getBidVolume() {
		return bidVolume;
	}
	public void setBidVolume(Double bidVolume) {
		this.bidVolume = bidVolume;
	}
	public Double getAskVolume() {
		return askVolume;
	}
	public void setAskVolume(Double askVolume) {
		this.askVolume = askVolume;
	}
	public Double getSerial() {
		return serial;
	}
	public void setSerial(Double serial) {
		this.serial = serial;
	}
}

package com.example.fugle_realtime_java_sdk_core.intraday.response;

public class Total {

	private double tradeValue;
	private double tradeVolume;
	private double tradeVolumeAtBid;
	private double tradeVolumeAtAsk;
	private double transaction;
	private double time;
	
	public double getTradeValue() {
		return tradeValue;
	}
	public void setTradeValue(double tradeValue) {
		this.tradeValue = tradeValue;
	}
	public double getTradeVolume() {
		return tradeVolume;
	}
	public void setTradeVolume(double tradeVolume) {
		this.tradeVolume = tradeVolume;
	}
	public double getTradeVolumeAtBid() {
		return tradeVolumeAtBid;
	}
	public void setTradeVolumeAtBid(double tradeVolumeAtBid) {
		this.tradeVolumeAtBid = tradeVolumeAtBid;
	}
	public double getTradeVolumeAtAsk() {
		return tradeVolumeAtAsk;
	}
	public void setTradeVolumeAtAsk(double tradeVolumeAtAsk) {
		this.tradeVolumeAtAsk = tradeVolumeAtAsk;
	}
	public double getTransaction() {
		return transaction;
	}
	public void setTransaction(double transaction) {
		this.transaction = transaction;
	}
	public double getTime() {
		return time;
	}
	public void setTime(double time) {
		this.time = time;
	}
}

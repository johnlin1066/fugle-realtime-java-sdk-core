package com.example.fugle_realtime_java_sdk_core.dto.response.quote;

public class Trade {
	
	private String at;
	private Double bid;
	private Double ask;
	private Double price;
	private Double volume;
	private Double serial;
	
	public String getAt() {
		return at;
	}
	public void setAt(String at) {
		this.at = at;
	}
	public Double getBid() {
		return bid;
	}
	public void setBid(Double bid) {
		this.bid = bid;
	}
	public Double getAsk() {
		return ask;
	}
	public void setAsk(Double ask) {
		this.ask = ask;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getVolume() {
		return volume;
	}
	public void setVolume(Double volume) {
		this.volume = volume;
	}
	public Double getSerial() {
		return serial;
	}
	public void setSerial(Double serial) {
		this.serial = serial;
	}
}

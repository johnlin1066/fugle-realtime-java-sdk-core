package com.example.fugle_realtime_java_sdk_core.intraday.response;

public class LastTrial {
	
	private double bid;
	private double ask;
	private double price;
	private double size;
	private double time;
	private double serial;
	
	public double getBid() {
		return bid;
	}
	public void setBid(double bid) {
		this.bid = bid;
	}
	public double getAsk() {
		return ask;
	}
	public void setAsk(double ask) {
		this.ask = ask;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public double getTime() {
		return time;
	}
	public void setTime(double time) {
		this.time = time;
	}
	public double getSerial() {
		return serial;
	}
	public void setSerial(double serial) {
		this.serial = serial;
	}
}

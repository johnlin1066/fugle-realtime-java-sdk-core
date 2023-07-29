package com.example.fugle_realtime_java_sdk_core.intraday.response;

public class Data {
	
	private String symbol;
	private String name;
	
	private String date;
	private double open;
	private double high;
	private double low;
	private double close;
	private double volume;
	private double average;
	
	private double bid;
	private double ask;
	private double price;
	private double size;
	private double time;
	
	private double serial;
	
	private double volumeAtBid;
	private double volumeAtAsk;
	
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getOpen() {
		return open;
	}
	public void setOpen(double open) {
		this.open = open;
	}
	public double getHigh() {
		return high;
	}
	public void setHigh(double high) {
		this.high = high;
	}
	public double getLow() {
		return low;
	}
	public void setLow(double low) {
		this.low = low;
	}
	public double getClose() {
		return close;
	}
	public void setClose(double close) {
		this.close = close;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
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
	public double getVolumeAtBid() {
		return volumeAtBid;
	}
	public void setVolumeAtBid(double volumeAtBid) {
		this.volumeAtBid = volumeAtBid;
	}
	public double getVolumeAtAsk() {
		return volumeAtAsk;
	}
	public void setVolumeAtAsk(double volumeAtAsk) {
		this.volumeAtAsk = volumeAtAsk;
	}
	public double getSerial() {
		return serial;
	}
	public void setSerial(double serial) {
		this.serial = serial;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
}

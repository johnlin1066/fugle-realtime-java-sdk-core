package com.example.fugle_realtime_java_sdk_core.snapshot.response;

public class Snapshot {
	
	private String type;
	private String symbol;
	private String name;
	private double openPrice;
	private double highPrice;
	private double lowPrice;
	private double closePrice;
	private double change;
	private double changePercent;
	private double tradeVolume;
	private double tradeValue;
	private double lastUpdated;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
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
	public double getOpenPrice() {
		return openPrice;
	}
	public void setOpenPrice(double openPrice) {
		this.openPrice = openPrice;
	}
	public double getHighPrice() {
		return highPrice;
	}
	public void setHighPrice(double highPrice) {
		this.highPrice = highPrice;
	}
	public double getLowPrice() {
		return lowPrice;
	}
	public void setLowPrice(double lowPrice) {
		this.lowPrice = lowPrice;
	}
	public double getClosePrice() {
		return closePrice;
	}
	public void setClosePrice(double closePrice) {
		this.closePrice = closePrice;
	}
	public double getChange() {
		return change;
	}
	public void setChange(double change) {
		this.change = change;
	}
	public double getChangePercent() {
		return changePercent;
	}
	public void setChangePercent(double changePercent) {
		this.changePercent = changePercent;
	}
	public double getTradeVolume() {
		return tradeVolume;
	}
	public void setTradeVolume(double tradeVolume) {
		this.tradeVolume = tradeVolume;
	}
	public double getTradeValue() {
		return tradeValue;
	}
	public void setTradeValue(double tradeValue) {
		this.tradeValue = tradeValue;
	}
	public double getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(double lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
}

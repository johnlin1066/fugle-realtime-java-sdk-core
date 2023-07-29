package com.example.fugle_realtime_java_sdk_core.intraday.response;

import java.util.List;

public class CandlesResponse {
	
	private String date;
	private String type;
	private String exchange;
	private String market;
	private String symbol;
	private double timeframe;
	private List<Data> data;
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getExchange() {
		return exchange;
	}
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}
	public String getMarket() {
		return market;
	}
	public void setMarket(String market) {
		this.market = market;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public double getTimeframe() {
		return timeframe;
	}
	public void setTimeframe(double timeframe) {
		this.timeframe = timeframe;
	}
	public List<Data> getData() {
		return data;
	}
	public void setData(List<Data> data) {
		this.data = data;
	}
}

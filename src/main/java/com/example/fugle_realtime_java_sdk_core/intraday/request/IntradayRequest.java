package com.example.fugle_realtime_java_sdk_core.intraday.request;

public class IntradayRequest {
	
	private String type;
	private String exchange;
	private String market;
	private String industry;
	private boolean isNormal;
	private boolean isAttention;
	private boolean isDisposition;
	private boolean isHalted;
	
	private String symbol;
	private String timeframe;
	private double offset;
	private double limit;
	
	public IntradayRequest() {
		exchange = "TWSE";
		market = "TSE";
		industry = "24";
		
		timeframe = "1";
		
		offset = 0;
		limit = 0;
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
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public boolean isNormal() {
		return isNormal;
	}
	public void setNormal(boolean isNormal) {
		this.isNormal = isNormal;
	}
	public boolean isAttention() {
		return isAttention;
	}
	public void setAttention(boolean isAttention) {
		this.isAttention = isAttention;
	}
	public boolean isDisposition() {
		return isDisposition;
	}
	public void setDisposition(boolean isDisposition) {
		this.isDisposition = isDisposition;
	}
	public boolean isHalted() {
		return isHalted;
	}
	public void setHalted(boolean isHalted) {
		this.isHalted = isHalted;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getTimeframe() {
		return timeframe;
	}
	public void setTimeframe(String timeframe) {
		this.timeframe = timeframe;
	}
	public double getOffset() {
		return offset;
	}
	public void setOffset(double offset) {
		this.offset = offset;
	}
	public double getLimit() {
		return limit;
	}
	public void setLimit(double limit) {
		this.limit = limit;
	}
}

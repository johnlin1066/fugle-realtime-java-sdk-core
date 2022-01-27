package com.example.fugle_realtime_java_sdk_core.dto.request;

public class RequestObject {
	
	private String symbolId;
	private String apiToken;
	private boolean oddLot;
	private int limit;
	private int offset;
	
	public RequestObject() {}
	public RequestObject(String symbolId, String apiToken, boolean oddLot, int limit, int offset) {
		this.symbolId = symbolId;
		this.apiToken = apiToken;
		this.oddLot = oddLot;
		this.limit = limit;
		this.offset = offset;
	}
	
	public String getSymbolId() {
		return symbolId;
	}
	public void setSymbolId(String symbolId) {
		this.symbolId = symbolId;
	}
	public String getApiToken() {
		return apiToken;
	}
	public void setApiToken(String apiToken) {
		this.apiToken = apiToken;
	}
	public boolean isOddLot() {
		return oddLot;
	}
	public void setOddLot(boolean oddLot) {
		this.oddLot = oddLot;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
}

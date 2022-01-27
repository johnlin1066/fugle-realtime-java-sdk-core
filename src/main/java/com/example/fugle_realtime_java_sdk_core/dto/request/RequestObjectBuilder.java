package com.example.fugle_realtime_java_sdk_core.dto.request;

public class RequestObjectBuilder {
	
	private RequestObject requestObject;
	
	public RequestObjectBuilder() {
		requestObject = new RequestObject("2884", "demo", false, 50, 0);
	}
	
	public RequestObject build() {
		return requestObject;
	}
	
	public RequestObjectBuilder setSymbolId(String symbolId) {
		requestObject.setSymbolId(symbolId);
		return this;
	}
	public RequestObjectBuilder setApiToken(String apiToken) {
		requestObject.setApiToken(apiToken);
		return this;
	}
	public RequestObjectBuilder setOddLot(boolean oddLot) {
		requestObject.setOddLot(oddLot);
		return this;
	}
	public RequestObjectBuilder setLimit(int limit) {
		requestObject.setLimit(limit);
		return this;
	}
	public RequestObjectBuilder setOffset(int offset) {
		requestObject.setOffset(offset);
		return this;
	}
}

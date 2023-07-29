package com.example.fugle_realtime_java_sdk_core.intraday.request;

public class IntradayRequestBuilder {
	
	private IntradayRequest intradayRequest;
	
	public IntradayRequestBuilder() {
		intradayRequest = new IntradayRequest();
	}
	
	public IntradayRequest build() {
		return intradayRequest;
	}

	public IntradayRequestBuilder setType(String type) {
		intradayRequest.setType(type);
		return this;
	}

	public IntradayRequestBuilder setExchange(String exchange) {
		intradayRequest.setExchange(exchange);
		return this;
	}

	public IntradayRequestBuilder setMarket(String market) {
		intradayRequest.setMarket(market);
		return this;
	}

	public IntradayRequestBuilder setIndustry(String industry) {
		intradayRequest.setIndustry(industry);
		return this;
	}

	public IntradayRequestBuilder setNormal(boolean isNormal) {
		intradayRequest.setNormal(isNormal);
		return this;
	}

	public IntradayRequestBuilder setAttention(boolean isAttention) {
		intradayRequest.setAttention(isAttention);
		return this;
	}

	public IntradayRequestBuilder setDisposition(boolean isDisposition) {
		intradayRequest.setDisposition(isDisposition);
		return this;
	}

	public IntradayRequestBuilder setHalted(boolean isHalted) {
		intradayRequest.setHalted(isHalted);
		return this;
	}

	public IntradayRequestBuilder setSymbol(String symbol) {
		intradayRequest.setSymbol(symbol);
		return this;
	}

	public IntradayRequestBuilder setTimeframe(String timeframe) {
		intradayRequest.setTimeframe(timeframe);
		return this;
	}

	public IntradayRequestBuilder setOffset(double offset) {
		intradayRequest.setOffset(offset);
		return this;
	}

	public IntradayRequestBuilder setLimit(double limit) {
		intradayRequest.setLimit(limit);
		return this;
	}
}

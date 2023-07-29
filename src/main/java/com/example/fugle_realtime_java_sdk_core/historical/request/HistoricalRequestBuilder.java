package com.example.fugle_realtime_java_sdk_core.historical.request;

public class HistoricalRequestBuilder {
	
	private HistoricalRequest historicalRequest;
	
	public HistoricalRequestBuilder() {
		historicalRequest = new HistoricalRequest();
	}
	
	public HistoricalRequest build() {
		return historicalRequest;
	}

	public HistoricalRequestBuilder setSymbol(String symbol) {
		historicalRequest.setSymbol(symbol);
		return this;
	}

	public HistoricalRequestBuilder setFrom(String from) {
		historicalRequest.setFrom(from);
		return this;
	}

	public HistoricalRequestBuilder setTo(String to) {
		historicalRequest.setTo(to);
		return this;
	}

	public HistoricalRequestBuilder setTimeframe(String timeframe) {
		historicalRequest.setTimeframe(timeframe);
		return this;
	}

	public HistoricalRequestBuilder setFields(String fields) {
		historicalRequest.setFields(fields);
		return this;
	}
}

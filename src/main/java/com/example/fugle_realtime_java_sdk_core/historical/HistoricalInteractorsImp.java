package com.example.fugle_realtime_java_sdk_core.historical;

import java.text.MessageFormat;

import com.example.fugle_realtime_java_sdk_core.historical.request.HistoricalRequest;
import com.example.fugle_realtime_java_sdk_core.historical.response.HistoricalCandlesResponse;
import com.example.fugle_realtime_java_sdk_core.historical.response.StatsResponse;
import com.example.fugle_realtime_java_sdk_core.tool.Constant;
import com.example.fugle_realtime_java_sdk_core.tool.HttpTool;

public class HistoricalInteractorsImp implements HistoricalInteractors {
	
	HttpTool httpTool;
	Constant constant;
	
	public HistoricalInteractorsImp(HttpTool httpTool, Constant constant) {
		this.httpTool = httpTool;
		this.constant = constant;
	}

	@Override
	public HistoricalCandlesResponse historicalCandles(HistoricalRequest historicalRequest) {
		String url = MessageFormat.format(constant.getFugleApiUrl()+"/historical/candles/{0}?from={1}"
				+ "&to={2}&timeframe={3}&fields={4}",
				historicalRequest.getSymbol(), historicalRequest.getFrom(), historicalRequest.getTo(),
				historicalRequest.getTimeframe(), historicalRequest.getFields());
		return httpTool.getForHistoricalCandlesResponse(url);
	}

	@Override
	public StatsResponse stats(HistoricalRequest historicalRequest) {
		String url = MessageFormat.format(constant.getFugleApiUrl()+"/historical/stats/{0}",historicalRequest.getSymbol());
		return httpTool.getForStatsResponse(url);
	}

}

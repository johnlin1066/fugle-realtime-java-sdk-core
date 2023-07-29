package com.example.fugle_realtime_java_sdk_core.historical;

import com.example.fugle_realtime_java_sdk_core.historical.request.HistoricalRequest;
import com.example.fugle_realtime_java_sdk_core.historical.response.HistoricalCandlesResponse;
import com.example.fugle_realtime_java_sdk_core.historical.response.StatsResponse;

public interface HistoricalInteractors {
	
	public HistoricalCandlesResponse historicalCandles(HistoricalRequest historicalRequest);
	public StatsResponse stats(HistoricalRequest historicalRequest);

}

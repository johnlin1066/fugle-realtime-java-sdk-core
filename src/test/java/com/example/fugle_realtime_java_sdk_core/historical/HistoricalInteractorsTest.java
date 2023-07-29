package com.example.fugle_realtime_java_sdk_core.historical;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.fugle_realtime_java_sdk_core.historical.request.HistoricalRequest;
import com.example.fugle_realtime_java_sdk_core.historical.request.HistoricalRequestBuilder;
import com.example.fugle_realtime_java_sdk_core.historical.response.HistoricalCandlesResponse;
import com.example.fugle_realtime_java_sdk_core.historical.response.StatsResponse;
import com.example.fugle_realtime_java_sdk_core.tool.Constant;
import com.example.fugle_realtime_java_sdk_core.tool.HttpTool;

public class HistoricalInteractorsTest {
	
	HistoricalInteractors historicalInteractors;
	HttpTool httpTool;
	Constant constant;
	
	@BeforeEach
	void initial() {
		httpTool = mock(HttpTool.class);
		constant = mock(Constant.class);
		historicalInteractors = new HistoricalInteractorsImp(httpTool, constant);
	}
	
	@Test
	void historicalCandles() {
		HistoricalRequest historicalRequest = new HistoricalRequestBuilder().setSymbol("0050")
				.setFields("open,high,low,close,volume").build();
		when(constant.getFugleApiUrl()).thenReturn("");
		when(httpTool.getForHistoricalCandlesResponse(any())).thenReturn(new HistoricalCandlesResponse());
		
		HistoricalCandlesResponse result = historicalInteractors.historicalCandles(historicalRequest);
		
		assertEquals(true, null!=result);
	}
	
	@Test
	void Stats() {
		HistoricalRequest historicalRequest = new HistoricalRequestBuilder().setSymbol("0050").build();
		when(constant.getFugleApiUrl()).thenReturn("");
		when(httpTool.getForStatsResponse(any())).thenReturn(new StatsResponse());
		
		StatsResponse result = historicalInteractors.stats(historicalRequest);
		
		assertEquals(true, null!=result);
		
	}

}

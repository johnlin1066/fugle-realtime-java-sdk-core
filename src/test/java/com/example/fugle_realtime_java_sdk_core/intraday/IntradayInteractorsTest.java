package com.example.fugle_realtime_java_sdk_core.intraday;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.fugle_realtime_java_sdk_core.intraday.request.IntradayRequest;
import com.example.fugle_realtime_java_sdk_core.intraday.request.IntradayRequestBuilder;
import com.example.fugle_realtime_java_sdk_core.intraday.response.CandlesResponse;
import com.example.fugle_realtime_java_sdk_core.intraday.response.QuoteResponse;
import com.example.fugle_realtime_java_sdk_core.intraday.response.TickerResponse;
import com.example.fugle_realtime_java_sdk_core.intraday.response.TickersResponse;
import com.example.fugle_realtime_java_sdk_core.intraday.response.TradesResponse;
import com.example.fugle_realtime_java_sdk_core.tool.Constant;
import com.example.fugle_realtime_java_sdk_core.tool.HttpTool;
import com.example.fugle_realtime_java_sdk_core.intraday.response.VolumesResponse;

public class IntradayInteractorsTest {
	
	IntradayInteractors intradayInteractors;
	HttpTool httpTool;
	Constant constant;
	
	@BeforeEach
	void initial() {
		httpTool = mock(HttpTool.class);
		constant = mock(Constant.class);
		intradayInteractors = new IntradayInteractorsImp(httpTool, constant);
	}
	
	@Test
	void tickers() {
		IntradayRequest intradayRequest = new IntradayRequestBuilder().setType("EQUITY")
				.setExchange("TWSE").setMarket("TSE").setIndustry("01").setNormal(true).build();
		when(constant.getFugleApiUrl()).thenReturn("");
		when(httpTool.getForTickersResponse(any())).thenReturn(new TickersResponse());
		
		TickersResponse result = intradayInteractors.tickers(intradayRequest);
		
		assertEquals(true, null!=result);
	}
	
	@Test
	void ticker() {
		IntradayRequest intradayRequest = new IntradayRequestBuilder().setSymbol("2330").build();
		when(constant.getFugleApiUrl()).thenReturn("");
		when(httpTool.getForTickerResponse(any())).thenReturn(new TickerResponse());
		
		TickerResponse result = intradayInteractors.ticker(intradayRequest);
		
		assertEquals(true, null!=result);
	}
	
	@Test
	void quote() {
		IntradayRequest intradayRequest = new IntradayRequestBuilder().setSymbol("2330").build();
		when(constant.getFugleApiUrl()).thenReturn("");
		when(httpTool.getForQuoteResponse(any())).thenReturn(new QuoteResponse());
		
		QuoteResponse result = intradayInteractors.quote(intradayRequest);
		
		assertEquals(true, null!=result);
	}
	
	@Test
	void candles() {
		IntradayRequest intradayRequest = new IntradayRequestBuilder().setSymbol("2330").build();
		when(constant.getFugleApiUrl()).thenReturn("");
		when(httpTool.getForCandlesResponse(any())).thenReturn(new CandlesResponse());
		
		CandlesResponse result = intradayInteractors.candles(intradayRequest);
		
		assertEquals(true, null!=result);
	}
	
	@Test
	void trades() {
		IntradayRequest intradayRequest = new IntradayRequestBuilder().setSymbol("0050").build();
		when(constant.getFugleApiUrl()).thenReturn("");
		when(httpTool.getForTradesResponse(any())).thenReturn(new TradesResponse());
		
		TradesResponse result = intradayInteractors.trades(intradayRequest);
		
		assertEquals(true, null!=result);
	}
	
	@Test
	void volumes() {
		IntradayRequest intradayRequest = new IntradayRequestBuilder().setSymbol("2330").build();
		when(constant.getFugleApiUrl()).thenReturn("");
		when(httpTool.getForVolumesResponse(any())).thenReturn(new VolumesResponse());
		
		VolumesResponse result = intradayInteractors.volumes(intradayRequest);
		
		assertEquals(true, null!=result);
		
	}
}

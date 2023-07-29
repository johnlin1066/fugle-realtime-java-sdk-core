package com.example.fugle_realtime_java_sdk_core.tool;

import com.example.fugle_realtime_java_sdk_core.historical.response.HistoricalCandlesResponse;
import com.example.fugle_realtime_java_sdk_core.historical.response.StatsResponse;
import com.example.fugle_realtime_java_sdk_core.intraday.response.CandlesResponse;
import com.example.fugle_realtime_java_sdk_core.intraday.response.QuoteResponse;
import com.example.fugle_realtime_java_sdk_core.intraday.response.TickerResponse;
import com.example.fugle_realtime_java_sdk_core.intraday.response.TickersResponse;
import com.example.fugle_realtime_java_sdk_core.intraday.response.TradesResponse;
import com.example.fugle_realtime_java_sdk_core.intraday.response.VolumesResponse;
import com.example.fugle_realtime_java_sdk_core.snapshot.response.ActivesResponse;
import com.example.fugle_realtime_java_sdk_core.snapshot.response.MoversResponse;
import com.example.fugle_realtime_java_sdk_core.snapshot.response.QuotesResponse;

public interface HttpTool {
	
	public TickersResponse getForTickersResponse(String url);
	public TickerResponse getForTickerResponse(String url);
	public QuoteResponse getForQuoteResponse(String url);
	public CandlesResponse getForCandlesResponse(String url);
	public TradesResponse getForTradesResponse(String url);
	public VolumesResponse getForVolumesResponse(String url);
	
	public QuotesResponse getForQuotesResponse(String url);
	public MoversResponse getForMoversResponse(String url);
	public ActivesResponse getForActivesResponse(String url);
	
	public HistoricalCandlesResponse getForHistoricalCandlesResponse(String url);
	public StatsResponse getForStatsResponse(String url);

}

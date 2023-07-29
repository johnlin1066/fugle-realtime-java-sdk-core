package com.example.fugle_realtime_java_sdk_core.intraday;

import com.example.fugle_realtime_java_sdk_core.intraday.request.IntradayRequest;
import com.example.fugle_realtime_java_sdk_core.intraday.response.CandlesResponse;
import com.example.fugle_realtime_java_sdk_core.intraday.response.QuoteResponse;
import com.example.fugle_realtime_java_sdk_core.intraday.response.TickerResponse;
import com.example.fugle_realtime_java_sdk_core.intraday.response.TickersResponse;
import com.example.fugle_realtime_java_sdk_core.intraday.response.TradesResponse;
import com.example.fugle_realtime_java_sdk_core.intraday.response.VolumesResponse;

public interface IntradayInteractors {
	
	public TickersResponse tickers(IntradayRequest intradayRequest);
	public TickerResponse ticker(IntradayRequest intradayRequest);
	public QuoteResponse quote(IntradayRequest intradayRequest);
	public CandlesResponse candles(IntradayRequest intradayRequest);
	public TradesResponse trades(IntradayRequest intradayRequest);
	public VolumesResponse volumes(IntradayRequest intradayRequest);

}

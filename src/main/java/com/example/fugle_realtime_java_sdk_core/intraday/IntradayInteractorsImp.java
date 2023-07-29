package com.example.fugle_realtime_java_sdk_core.intraday;

import java.text.MessageFormat;

import com.example.fugle_realtime_java_sdk_core.intraday.request.IntradayRequest;
import com.example.fugle_realtime_java_sdk_core.intraday.response.CandlesResponse;
import com.example.fugle_realtime_java_sdk_core.intraday.response.QuoteResponse;
import com.example.fugle_realtime_java_sdk_core.intraday.response.TickerResponse;
import com.example.fugle_realtime_java_sdk_core.intraday.response.TickersResponse;
import com.example.fugle_realtime_java_sdk_core.intraday.response.TradesResponse;
import com.example.fugle_realtime_java_sdk_core.intraday.response.VolumesResponse;
import com.example.fugle_realtime_java_sdk_core.tool.Constant;
import com.example.fugle_realtime_java_sdk_core.tool.HttpTool;

public class IntradayInteractorsImp implements IntradayInteractors{
	
	HttpTool httpTool;
	Constant constant;
	
	public IntradayInteractorsImp(HttpTool httpTool, Constant constant) {
		this.httpTool = httpTool;
		this.constant = constant;
	}

	@Override
	public TickersResponse tickers(IntradayRequest intradayRequest) {
		StringBuilder sb = new StringBuilder(constant.getFugleApiUrl()+"/intraday/tickers?type={0}&exchange={1}&market={2}"
				+ "&industry={3}");
		if(intradayRequest.isNormal())
			sb.append("&isNormal={4}");
		else {
			if(intradayRequest.isAttention())
				sb.append("&isAttention={5}");
			if(intradayRequest.isDisposition())
				sb.append("&isDisposition={6}");
		}
		if(intradayRequest.isHalted())
			sb.append("&isHalted={7}");
		String url = MessageFormat.format(sb.toString(),
				intradayRequest.getType(), intradayRequest.getExchange(), intradayRequest.getMarket(),
				intradayRequest.getIndustry(), intradayRequest.isNormal(), intradayRequest.isAttention(),
				intradayRequest.isDisposition(), intradayRequest.isHalted());
		return httpTool.getForTickersResponse(url);
	}

	@Override
	public TickerResponse ticker(IntradayRequest intradayRequest) {
		StringBuilder sb = new StringBuilder(constant.getFugleApiUrl()+"/intraday/ticker/{0}");
		if(null != intradayRequest.getType())
			sb.append("?type={1}");
		String url = MessageFormat.format(sb.toString(),
				intradayRequest.getSymbol(), intradayRequest.getType());
		return httpTool.getForTickerResponse(url);
	}

	@Override
	public QuoteResponse quote(IntradayRequest intradayRequest) {
		StringBuilder sb = new StringBuilder(constant.getFugleApiUrl()+"/intraday/quote/{0}");
		if(null != intradayRequest.getType())
			sb.append("?type={1}");
		String url = MessageFormat.format(sb.toString(),
				intradayRequest.getSymbol(), intradayRequest.getType());
		return httpTool.getForQuoteResponse(url);
	}

	@Override
	public CandlesResponse candles(IntradayRequest intradayRequest) {
		StringBuilder sb = new StringBuilder(constant.getFugleApiUrl()+"/intraday/candles/{0}?timeframe={2}");
		if(null != intradayRequest.getType())
			sb.append("&type={1}");
		String url = MessageFormat.format(sb.toString(),
				intradayRequest.getSymbol(), intradayRequest.getType(), intradayRequest.getTimeframe());
		return httpTool.getForCandlesResponse(url);
	}

	@Override
	public TradesResponse trades(IntradayRequest intradayRequest) {
		StringBuilder sb = new StringBuilder(constant.getFugleApiUrl()+"/intraday/trades/{0}?offset={2}&limit={3}");
		if(null != intradayRequest.getType())
			sb.append("&type={1}");
		String url = MessageFormat.format(sb.toString(),
				intradayRequest.getSymbol(), intradayRequest.getType(), intradayRequest.getOffset(), intradayRequest.getLimit());
		return httpTool.getForTradesResponse(url);
	}

	@Override
	public VolumesResponse volumes(IntradayRequest intradayRequest) {
		StringBuilder sb = new StringBuilder(constant.getFugleApiUrl()+"/intraday/volumes/{0}");
		if(null != intradayRequest.getType())
			sb.append("?type={1}");
		String url = MessageFormat.format(sb.toString(),
				intradayRequest.getSymbol(), intradayRequest.getType());
		return httpTool.getForVolumesResponse(url);
	}

}

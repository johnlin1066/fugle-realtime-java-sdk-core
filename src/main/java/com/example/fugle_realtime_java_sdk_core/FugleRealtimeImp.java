package com.example.fugle_realtime_java_sdk_core;

import java.text.MessageFormat;

import com.example.fugle_realtime_java_sdk_core.dto.request.RequestObject;
import com.example.fugle_realtime_java_sdk_core.dto.response.ResponseObject;
import com.example.fugle_realtime_java_sdk_core.tool.Constant;
import com.example.fugle_realtime_java_sdk_core.tool.HttpTool;

public class FugleRealtimeImp implements FugleRealtime{
	
	HttpTool httpTool;
	Constant constant;
	
	public FugleRealtimeImp(HttpTool httpTool) {
		this.httpTool = httpTool;
		this.constant = new Constant();
	}

	@Override
	public ResponseObject chart(RequestObject requestObject) {
		String url = MessageFormat.format(constant.getFugleApiUrl()+"/chart?symbolId={0}&apiToken={1}&oddLot={2}",
				requestObject.getSymbolId(), requestObject.getApiToken(), requestObject.isOddLot());
		return httpTool.getForObject(url);
	}

	@Override
	public ResponseObject quote(RequestObject requestObject) {
		String url = MessageFormat.format(constant.getFugleApiUrl()+"/quote?symbolId={0}&apiToken={1}&oddLot={2}",
				requestObject.getSymbolId(), requestObject.getApiToken(), requestObject.isOddLot());
		return httpTool.getForObject(url);
	}

	@Override
	public ResponseObject meta(RequestObject requestObject) {
		String url = MessageFormat.format(constant.getFugleApiUrl()+"/meta?symbolId={0}&apiToken={1}&oddLot={2}",
				requestObject.getSymbolId(), requestObject.getApiToken(), requestObject.isOddLot());
		return httpTool.getForObject(url);
	}

	@Override
	public ResponseObject dealts(RequestObject requestObject) {
		String url = MessageFormat.format(constant.getFugleApiUrl()+"/dealts?symbolId={0}&apiToken={1}&limit={2}&offset={3}&oddLot={4}",
				requestObject.getSymbolId(), requestObject.getApiToken(), requestObject.getLimit(),
				requestObject.getOffset(), requestObject.isOddLot());
		return httpTool.getForObject(url);
	}

	@Override
	public ResponseObject volumes(RequestObject requestObject) {
		String url = MessageFormat.format(constant.getFugleApiUrl()+"/volumes?symbolId={0}&apiToken={1}&oddLot={2}",
				requestObject.getSymbolId(), requestObject.getApiToken(), requestObject.isOddLot());
		return httpTool.getForObject(url);
	}
}

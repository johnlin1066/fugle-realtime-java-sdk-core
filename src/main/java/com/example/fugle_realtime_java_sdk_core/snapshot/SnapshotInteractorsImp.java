package com.example.fugle_realtime_java_sdk_core.snapshot;

import java.text.MessageFormat;

import com.example.fugle_realtime_java_sdk_core.snapshot.request.SnapshotRequest;
import com.example.fugle_realtime_java_sdk_core.snapshot.response.ActivesResponse;
import com.example.fugle_realtime_java_sdk_core.snapshot.response.MoversResponse;
import com.example.fugle_realtime_java_sdk_core.snapshot.response.QuotesResponse;
import com.example.fugle_realtime_java_sdk_core.tool.Constant;
import com.example.fugle_realtime_java_sdk_core.tool.HttpTool;

public class SnapshotInteractorsImp implements SnapshotInteractors{
	
	HttpTool httpTool;
	Constant constant;
	
	public SnapshotInteractorsImp(HttpTool httpTool, Constant constant) {
		this.httpTool = httpTool;
		this.constant = constant;
	}

	@Override
	public QuotesResponse quotes(SnapshotRequest snapshotRequest) {
		String url = MessageFormat.format(constant.getFugleApiUrl()+"/snapshot/quotes/{0}",
				snapshotRequest.getMarket());
		return httpTool.getForQuotesResponse(url);
	}

	@Override
	public MoversResponse movers(SnapshotRequest snapshotRequest) {
		String url = MessageFormat.format(constant.getFugleApiUrl()+"/snapshot/movers/{0}?direction={1}&change={2}&gt={3}"
				+ "&gte={4}&lt={5}&lte={6}&eq={7}", snapshotRequest.getMarket(), snapshotRequest.getDirection(),
				snapshotRequest.getChange(), snapshotRequest.getGt(), snapshotRequest.getGte(), snapshotRequest.getLt(),
				snapshotRequest.getLte(), snapshotRequest.getEq());
		return httpTool.getForMoversResponse(url);
	}

	@Override
	public ActivesResponse actives(SnapshotRequest snapshotRequest) {
		String url = MessageFormat.format(constant.getFugleApiUrl()+"/snapshot/actives/{0}?trade={1}",
				snapshotRequest.getMarket(), snapshotRequest.getTrade());
		return httpTool.getForActivesResponse(url);
	}

}

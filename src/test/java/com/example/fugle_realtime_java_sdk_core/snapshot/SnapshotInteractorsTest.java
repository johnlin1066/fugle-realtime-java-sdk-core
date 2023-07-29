package com.example.fugle_realtime_java_sdk_core.snapshot;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.fugle_realtime_java_sdk_core.snapshot.request.SnapshotRequest;
import com.example.fugle_realtime_java_sdk_core.snapshot.request.SnapshotRequestBuilder;
import com.example.fugle_realtime_java_sdk_core.snapshot.response.ActivesResponse;
import com.example.fugle_realtime_java_sdk_core.snapshot.response.MoversResponse;
import com.example.fugle_realtime_java_sdk_core.snapshot.response.QuotesResponse;
import com.example.fugle_realtime_java_sdk_core.tool.Constant;
import com.example.fugle_realtime_java_sdk_core.tool.HttpTool;

public class SnapshotInteractorsTest {
	
	SnapshotInteractors snapshotInteractors;
	HttpTool httpTool;
	Constant constant;
	
	@BeforeEach
	void initial() {
		httpTool = mock(HttpTool.class);
		constant = mock(Constant.class);
		snapshotInteractors = new SnapshotInteractorsImp(httpTool, constant);
	}
	
	@Test
	void quotes() {
		SnapshotRequest snapshotRequest = new SnapshotRequestBuilder().setMarket("TSE").build();
		when(constant.getFugleApiUrl()).thenReturn("");
		when(httpTool.getForQuotesResponse(any())).thenReturn(new QuotesResponse());
		
		QuotesResponse result = snapshotInteractors.quotes(snapshotRequest);
		
		assertEquals(true, null!=result);
	}
	
	@Test
	void Movers() {
		SnapshotRequest snapshotRequest = new SnapshotRequestBuilder().setMarket("TSE").setDirection("up")
				.setChange("percent").build();
		when(constant.getFugleApiUrl()).thenReturn("");
		when(httpTool.getForMoversResponse(any())).thenReturn(new MoversResponse());
		
		MoversResponse result = snapshotInteractors.movers(snapshotRequest);
		
		assertEquals(true, null!=result);
	}
	
	@Test
	void Actives() {
		SnapshotRequest snapshotRequest = new SnapshotRequestBuilder().setMarket("TSE").setTrade("value").build();
		when(constant.getFugleApiUrl()).thenReturn("");
		when(httpTool.getForActivesResponse(any())).thenReturn(new ActivesResponse());
		
		ActivesResponse result = snapshotInteractors.actives(snapshotRequest);
		
		assertEquals(true, null!=result);
	}

}

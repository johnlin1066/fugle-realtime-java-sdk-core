package com.example.fugle_realtime_java_sdk_core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.fugle_realtime_java_sdk_core.dto.request.RequestObject;
import com.example.fugle_realtime_java_sdk_core.dto.request.RequestObjectBuilder;
import com.example.fugle_realtime_java_sdk_core.dto.response.ResponseObject;
import com.example.fugle_realtime_java_sdk_core.tool.Constant;
import com.example.fugle_realtime_java_sdk_core.tool.HttpTool;

public class FugleRealtimeTest {
	
	FugleRealtime fugleRealtime;
	HttpTool httpTool;
	Constant constant;
	
	@BeforeEach
	void initial() {
		httpTool = mock(HttpTool.class);
		fugleRealtime = new FugleRealtimeImp(httpTool);
	}
	
	@Test
	void chart() {
		RequestObject requestObject = new RequestObjectBuilder().setSymbolId("2884").setApiToken("demo").build();
		when(httpTool.getForObject(any())).thenReturn(new ResponseObject());
		
		ResponseObject result = fugleRealtime.chart(requestObject);
		
		assertEquals(true, null!=result);
	}
	
	@Test
	void quote() {
		RequestObject requestObject = new RequestObjectBuilder().setSymbolId("2884").setApiToken("demo").build();
		when(httpTool.getForObject(any())).thenReturn(new ResponseObject());
		
		ResponseObject result = fugleRealtime.quote(requestObject);
		
		assertEquals(true, null!=result);
	}
	
	@Test
	void meta() {
		RequestObject requestObject = new RequestObjectBuilder().setSymbolId("2884").setApiToken("demo").build();
		when(httpTool.getForObject(any())).thenReturn(new ResponseObject());
		
		ResponseObject result = fugleRealtime.meta(requestObject);
		
		assertEquals(true, null!=result);
	}
	
	@Test
	void dealts() {
		RequestObject requestObject = new RequestObjectBuilder().setSymbolId("2884").setApiToken("demo").build();
		when(httpTool.getForObject(any())).thenReturn(new ResponseObject());
		
		ResponseObject result = fugleRealtime.dealts(requestObject);
		
		assertEquals(true, null!=result);
	}
	
	@Test
	void volumes() {
		RequestObject requestObject = new RequestObjectBuilder().setSymbolId("2884").setApiToken("demo").build();
		when(httpTool.getForObject(any())).thenReturn(new ResponseObject());
		
		ResponseObject result = fugleRealtime.volumes(requestObject);
		
		assertEquals(true, null!=result);
	}

}

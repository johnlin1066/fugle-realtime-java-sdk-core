package com.example.fugle_realtime_java_sdk_core;

import com.example.fugle_realtime_java_sdk_core.dto.request.RequestObject;
import com.example.fugle_realtime_java_sdk_core.dto.response.ResponseObject;

public interface FugleRealtime {
	
	public ResponseObject chart(RequestObject requestObject);
	public ResponseObject quote(RequestObject requestObject);
	public ResponseObject meta(RequestObject requestObject);
	public ResponseObject dealts(RequestObject requestObject);
	public ResponseObject volumes(RequestObject requestObject);

}

package com.example.fugle_realtime_java_sdk_core.snapshot;

import com.example.fugle_realtime_java_sdk_core.snapshot.request.SnapshotRequest;
import com.example.fugle_realtime_java_sdk_core.snapshot.response.ActivesResponse;
import com.example.fugle_realtime_java_sdk_core.snapshot.response.MoversResponse;
import com.example.fugle_realtime_java_sdk_core.snapshot.response.QuotesResponse;

public interface SnapshotInteractors {
	
	public QuotesResponse quotes(SnapshotRequest snapshotRequest);
	public MoversResponse movers(SnapshotRequest snapshotRequest);
	public ActivesResponse actives(SnapshotRequest snapshotRequest);

}

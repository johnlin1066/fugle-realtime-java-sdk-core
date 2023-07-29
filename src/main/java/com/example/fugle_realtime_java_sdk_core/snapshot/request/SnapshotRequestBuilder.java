package com.example.fugle_realtime_java_sdk_core.snapshot.request;

public class SnapshotRequestBuilder {
	
	private SnapshotRequest snapshotRequest;
	
	public SnapshotRequestBuilder() {
		snapshotRequest = new SnapshotRequest();
	}
	
	public SnapshotRequest build() {
		return snapshotRequest;
	}

	public SnapshotRequestBuilder setMarket(String market) {
		snapshotRequest.setMarket(market);
		return this;
	}

	public SnapshotRequestBuilder setDirection(String direction) {
		snapshotRequest.setDirection(direction);
		return this;
	}

	public SnapshotRequestBuilder setChange(String change) {
		snapshotRequest.setChange(change);
		return this;
	}

	public SnapshotRequestBuilder setGt(double gt) {
		snapshotRequest.setGt(gt);
		return this;
	}

	public SnapshotRequestBuilder setGte(double gte) {
		snapshotRequest.setGte(gte);
		return this;
	}

	public SnapshotRequestBuilder setLt(double lt) {
		snapshotRequest.setLt(lt);
		return this;
	}

	public SnapshotRequestBuilder setLte(double lte) {
		snapshotRequest.setLte(lte);
		return this;
	}

	public SnapshotRequestBuilder setEq(double eq) {
		snapshotRequest.setEq(eq);
		return this;
	}

	public SnapshotRequestBuilder setTrade(String trade) {
		snapshotRequest.setTrade(trade);
		return this;
	}
}

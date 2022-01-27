package com.example.fugle_realtime_java_sdk_core.dto.response.quote;

import java.util.List;

public class Order {
	
	private String at;
	private List<BidAskObject> bids;
	private List<BidAskObject> asks;
	
	public String getAt() {
		return at;
	}
	public void setAt(String at) {
		this.at = at;
	}
	public List<BidAskObject> getBids() {
		return bids;
	}
	public void setBids(List<BidAskObject> bids) {
		this.bids = bids;
	}
	public List<BidAskObject> getAsks() {
		return asks;
	}
	public void setAsks(List<BidAskObject> asks) {
		this.asks = asks;
	}
}

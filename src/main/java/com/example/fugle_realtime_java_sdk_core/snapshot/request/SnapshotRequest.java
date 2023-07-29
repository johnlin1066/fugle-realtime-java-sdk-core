package com.example.fugle_realtime_java_sdk_core.snapshot.request;

public class SnapshotRequest {
	
	private String market;
	
	private String direction;
	private String change;
	private double gt;
	private double gte;
	private double lt;
	private double lte;
	private double eq;
	
	private String trade;
	
	public SnapshotRequest() {
		gt = 0;
		gte = 0;
		lt = 0;
		lte = 0;
		eq = 0;
	}
	
	public String getMarket() {
		return market;
	}
	public void setMarket(String market) {
		this.market = market;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public String getChange() {
		return change;
	}
	public void setChange(String change) {
		this.change = change;
	}
	public double getGt() {
		return gt;
	}
	public void setGt(double gt) {
		this.gt = gt;
	}
	public double getGte() {
		return gte;
	}
	public void setGte(double gte) {
		this.gte = gte;
	}
	public double getLt() {
		return lt;
	}
	public void setLt(double lt) {
		this.lt = lt;
	}
	public double getLte() {
		return lte;
	}
	public void setLte(double lte) {
		this.lte = lte;
	}
	public double getEq() {
		return eq;
	}
	public void setEq(double eq) {
		this.eq = eq;
	}
	public String getTrade() {
		return trade;
	}
	public void setTrade(String trade) {
		this.trade = trade;
	}
}

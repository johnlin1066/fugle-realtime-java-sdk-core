package com.example.fugle_realtime_java_sdk_core.snapshot.response;

import java.util.List;

public class QuotesResponse {
	
	private String date;
	private String time;
	private String market;
	private List<Snapshot> data;
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getMarket() {
		return market;
	}
	public void setMarket(String market) {
		this.market = market;
	}
	public List<Snapshot> getData() {
		return data;
	}
	public void setData(List<Snapshot> data) {
		this.data = data;
	}
}

package com.example.fugle_realtime_java_sdk_core.intraday.response;

import java.util.List;

public class TickersResponse {
	
	private String date;
	private String type;
	private String exchange;
	private String market;
	private String industry;
	private boolean isNormal;
	private boolean isAttention;
	private boolean isDisposition;
	private boolean isHalted;
	private List<Data> data;
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getExchange() {
		return exchange;
	}
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}
	public String getMarket() {
		return market;
	}
	public void setMarket(String market) {
		this.market = market;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public boolean isNormal() {
		return isNormal;
	}
	public void setNormal(boolean isNormal) {
		this.isNormal = isNormal;
	}
	public boolean isAttention() {
		return isAttention;
	}
	public void setAttention(boolean isAttention) {
		this.isAttention = isAttention;
	}
	public boolean isDisposition() {
		return isDisposition;
	}
	public void setDisposition(boolean isDisposition) {
		this.isDisposition = isDisposition;
	}
	public boolean isHalted() {
		return isHalted;
	}
	public void setHalted(boolean isHalted) {
		this.isHalted = isHalted;
	}
	public List<Data> getData() {
		return data;
	}
	public void setData(List<Data> data) {
		this.data = data;
	}

}

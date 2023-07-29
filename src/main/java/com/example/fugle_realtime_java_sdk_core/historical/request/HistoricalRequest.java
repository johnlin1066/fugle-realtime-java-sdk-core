package com.example.fugle_realtime_java_sdk_core.historical.request;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HistoricalRequest {
	
	private String symbol;
	private String from;
	private String to;
	private String timeframe;
	private String fields;
	
	public HistoricalRequest() {
		LocalDate date = LocalDate.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		from = dateTimeFormatter.format(date.minusWeeks(1));
		to = dateTimeFormatter.format(date);
		timeframe = "D";
		fields = "open,high,low,close,volume"; 
	}
	
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getTimeframe() {
		return timeframe;
	}
	public void setTimeframe(String timeframe) {
		this.timeframe = timeframe;
	}
	public String getFields() {
		return fields;
	}
	public void setFields(String fields) {
		this.fields = fields;
	}
}

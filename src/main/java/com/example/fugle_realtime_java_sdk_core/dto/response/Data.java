package com.example.fugle_realtime_java_sdk_core.dto.response;

import java.util.List;

import com.example.fugle_realtime_java_sdk_core.dto.response.chart.Chart;
import com.example.fugle_realtime_java_sdk_core.dto.response.dealts.Dealts;
import com.example.fugle_realtime_java_sdk_core.dto.response.meta.Meta;
import com.example.fugle_realtime_java_sdk_core.dto.response.quote.Quote;
import com.example.fugle_realtime_java_sdk_core.dto.response.volumes.Volumes;

public class Data {
	
	private Info info;
	private Chart chart;
	private Quote quote;
	private Meta meta;
	private List<Dealts> dealts;
	private List<Volumes> volumes;
	
	public Info getInfo() {
		return info;
	}
	public void setInfo(Info info) {
		this.info = info;
	}
	public Chart getChart() {
		return chart;
	}
	public void setChart(Chart chart) {
		this.chart = chart;
	}
	public Quote getQuote() {
		return quote;
	}
	public void setQuote(Quote quote) {
		this.quote = quote;
	}
	public Meta getMeta() {
		return meta;
	}
	public void setMeta(Meta meta) {
		this.meta = meta;
	}
	public List<Dealts> getDealts() {
		return dealts;
	}
	public void setDealts(List<Dealts> dealts) {
		this.dealts = dealts;
	}
	public List<Volumes> getVolumes() {
		return volumes;
	}
	public void setVolumes(List<Volumes> volumes) {
		this.volumes = volumes;
	}
	
}

package com.example.fugle_realtime_java_sdk_core.dto.response.chart;

import java.util.List;

public class Chart {
	
	private List<Double> o;
	private List<Double> h;
	private List<Double> l;
	private List<Double> c;
	private List<Double> v;
	private List<Double> t;
	
	public List<Double> getO() {
		return o;
	}
	public void setO(List<Double> o) {
		this.o = o;
	}
	public List<Double> getH() {
		return h;
	}
	public void setH(List<Double> h) {
		this.h = h;
	}
	public List<Double> getL() {
		return l;
	}
	public void setL(List<Double> l) {
		this.l = l;
	}
	public List<Double> getC() {
		return c;
	}
	public void setC(List<Double> c) {
		this.c = c;
	}
	public List<Double> getV() {
		return v;
	}
	public void setV(List<Double> v) {
		this.v = v;
	}
	public List<Double> getT() {
		return t;
	}
	public void setT(List<Double> t) {
		this.t = t;
	}
}

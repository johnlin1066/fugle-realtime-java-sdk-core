package com.example.fugle_realtime_java_sdk_core.intraday.response;

public class OpHaltStatus {
	
	private boolean isHalted;
	private double time;
	
	public boolean isHalted() {
		return isHalted;
	}
	public void setHalted(boolean isHalted) {
		this.isHalted = isHalted;
	}
	public double getTime() {
		return time;
	}
	public void setTime(double time) {
		this.time = time;
	}

}

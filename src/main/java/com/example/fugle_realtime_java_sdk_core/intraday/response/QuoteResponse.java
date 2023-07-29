package com.example.fugle_realtime_java_sdk_core.intraday.response;

import java.util.List;

public class QuoteResponse {
	
	private String date;
	private String type;
	private String exchange;
	private String market;
	private String symbol;
	private String name;
	private double referencePrice;
	private double previousClose;
	private double openPrice;
	private String openTime;
	private double highPrice;
	private double highTime;
	private double lowPrice;
	private double lowTime;
	private double closePrice;
	private String closeTime;
	private double lastPrice;
	private double lastSize;
	private double avgPrice;
	private double change;
	private double changePercent;
	private double amplitude;
	private List<Bids> bids;
	private List<Asks> asks;
	private Total total;
	private LastTrade lastTrade;
	private LastTrial lastTrial;
	private OpHaltStatus opHaltStatus;
	private boolean isLimitDownPrice;
	private boolean isLimitUpPrice;
	private boolean isLimitDownBid;
	private boolean isLimitUpBid;
	private boolean isLimitDownAsk;
	private boolean isLimitUpAsk;
	private boolean isLimitDownHalt;
	private boolean isLimitUpHalt;
	private boolean isTrial;
	private boolean isDelayedOpen;
	private boolean isDelayedClose;
	private boolean isContinuous;
	private boolean isOpen;
	private boolean isClose;
	private double lastUpdated;
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
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getReferencePrice() {
		return referencePrice;
	}
	public void setReferencePrice(double referencePrice) {
		this.referencePrice = referencePrice;
	}
	public double getPreviousClose() {
		return previousClose;
	}
	public void setPreviousClose(double previousClose) {
		this.previousClose = previousClose;
	}
	public double getOpenPrice() {
		return openPrice;
	}
	public void setOpenPrice(double openPrice) {
		this.openPrice = openPrice;
	}
	public String getOpenTime() {
		return openTime;
	}
	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}
	public double getHighPrice() {
		return highPrice;
	}
	public void setHighPrice(double highPrice) {
		this.highPrice = highPrice;
	}
	public double getHighTime() {
		return highTime;
	}
	public void setHighTime(double highTime) {
		this.highTime = highTime;
	}
	public double getLowPrice() {
		return lowPrice;
	}
	public void setLowPrice(double lowPrice) {
		this.lowPrice = lowPrice;
	}
	public double getLowTime() {
		return lowTime;
	}
	public void setLowTime(double lowTime) {
		this.lowTime = lowTime;
	}
	public double getClosePrice() {
		return closePrice;
	}
	public void setClosePrice(double closePrice) {
		this.closePrice = closePrice;
	}
	public String getCloseTime() {
		return closeTime;
	}
	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
	}
	public double getLastPrice() {
		return lastPrice;
	}
	public void setLastPrice(double lastPrice) {
		this.lastPrice = lastPrice;
	}
	public double getLastSize() {
		return lastSize;
	}
	public void setLastSize(double lastSize) {
		this.lastSize = lastSize;
	}
	public double getAvgPrice() {
		return avgPrice;
	}
	public void setAvgPrice(double avgPrice) {
		this.avgPrice = avgPrice;
	}
	public double getChange() {
		return change;
	}
	public void setChange(double change) {
		this.change = change;
	}
	public double getChangePercent() {
		return changePercent;
	}
	public void setChangePercent(double changePercent) {
		this.changePercent = changePercent;
	}
	public double getAmplitude() {
		return amplitude;
	}
	public void setAmplitude(double amplitude) {
		this.amplitude = amplitude;
	}
	public List<Bids> getBids() {
		return bids;
	}
	public void setBids(List<Bids> bids) {
		this.bids = bids;
	}
	public List<Asks> getAsks() {
		return asks;
	}
	public void setAsks(List<Asks> asks) {
		this.asks = asks;
	}
	public Total getTotal() {
		return total;
	}
	public void setTotal(Total total) {
		this.total = total;
	}
	public LastTrade getLastTrade() {
		return lastTrade;
	}
	public void setLastTrade(LastTrade lastTrade) {
		this.lastTrade = lastTrade;
	}
	public LastTrial getLastTrial() {
		return lastTrial;
	}
	public void setLastTrial(LastTrial lastTrial) {
		this.lastTrial = lastTrial;
	}
	public OpHaltStatus getOpHaltStatus() {
		return opHaltStatus;
	}
	public void setOpHaltStatus(OpHaltStatus opHaltStatus) {
		this.opHaltStatus = opHaltStatus;
	}
	public boolean isLimitDownPrice() {
		return isLimitDownPrice;
	}
	public void setLimitDownPrice(boolean isLimitDownPrice) {
		this.isLimitDownPrice = isLimitDownPrice;
	}
	public boolean isLimitUpPrice() {
		return isLimitUpPrice;
	}
	public void setLimitUpPrice(boolean isLimitUpPrice) {
		this.isLimitUpPrice = isLimitUpPrice;
	}
	public boolean isLimitDownBid() {
		return isLimitDownBid;
	}
	public void setLimitDownBid(boolean isLimitDownBid) {
		this.isLimitDownBid = isLimitDownBid;
	}
	public boolean isLimitUpBid() {
		return isLimitUpBid;
	}
	public void setLimitUpBid(boolean isLimitUpBid) {
		this.isLimitUpBid = isLimitUpBid;
	}
	public boolean isLimitDownAsk() {
		return isLimitDownAsk;
	}
	public void setLimitDownAsk(boolean isLimitDownAsk) {
		this.isLimitDownAsk = isLimitDownAsk;
	}
	public boolean isLimitUpAsk() {
		return isLimitUpAsk;
	}
	public void setLimitUpAsk(boolean isLimitUpAsk) {
		this.isLimitUpAsk = isLimitUpAsk;
	}
	public boolean isLimitDownHalt() {
		return isLimitDownHalt;
	}
	public void setLimitDownHalt(boolean isLimitDownHalt) {
		this.isLimitDownHalt = isLimitDownHalt;
	}
	public boolean isLimitUpHalt() {
		return isLimitUpHalt;
	}
	public void setLimitUpHalt(boolean isLimitUpHalt) {
		this.isLimitUpHalt = isLimitUpHalt;
	}
	public boolean isTrial() {
		return isTrial;
	}
	public void setTrial(boolean isTrial) {
		this.isTrial = isTrial;
	}
	public boolean isDelayedOpen() {
		return isDelayedOpen;
	}
	public void setDelayedOpen(boolean isDelayedOpen) {
		this.isDelayedOpen = isDelayedOpen;
	}
	public boolean isDelayedClose() {
		return isDelayedClose;
	}
	public void setDelayedClose(boolean isDelayedClose) {
		this.isDelayedClose = isDelayedClose;
	}
	public boolean isContinuous() {
		return isContinuous;
	}
	public void setContinuous(boolean isContinuous) {
		this.isContinuous = isContinuous;
	}
	public boolean isOpen() {
		return isOpen;
	}
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	public boolean isClose() {
		return isClose;
	}
	public void setClose(boolean isClose) {
		this.isClose = isClose;
	}
	public double getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(double lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
}

package com.example.fugle_realtime_java_sdk_core.dto.response.quote;

public class Quote {
	
	private Boolean isCurbing;
	private Boolean isCurbingFall;
	private Boolean isCurbingRise;
	private Boolean isTrial;
	private Boolean isOpenDelayed;
	private Boolean isCloseDelayed;
	private Boolean isHalting;
	private Boolean isClosed;
	private Total total;
	private Trial trial;
	private Trade trade;
	private Order order;
	private PriceObject priceHigh;
	private PriceObject priceLow;
	private PriceObject priceOpen;
	private PriceObject priceAvg;
	private Double change;
	private Double changePercent;
	private Double amplitude;
	private Double priceLimit;
	
	public Boolean getIsCurbing() {
		return isCurbing;
	}
	public void setIsCurbing(Boolean isCurbing) {
		this.isCurbing = isCurbing;
	}
	public Boolean getIsCurbingFall() {
		return isCurbingFall;
	}
	public void setIsCurbingFall(Boolean isCurbingFall) {
		this.isCurbingFall = isCurbingFall;
	}
	public Boolean getIsCurbingRise() {
		return isCurbingRise;
	}
	public void setIsCurbingRise(Boolean isCurbingRise) {
		this.isCurbingRise = isCurbingRise;
	}
	public Boolean getIsTrial() {
		return isTrial;
	}
	public void setIsTrial(Boolean isTrial) {
		this.isTrial = isTrial;
	}
	public Boolean getIsOpenDelayed() {
		return isOpenDelayed;
	}
	public void setIsOpenDelayed(Boolean isOpenDelayed) {
		this.isOpenDelayed = isOpenDelayed;
	}
	public Boolean getIsCloseDelayed() {
		return isCloseDelayed;
	}
	public void setIsCloseDelayed(Boolean isCloseDelayed) {
		this.isCloseDelayed = isCloseDelayed;
	}
	public Boolean getIsHalting() {
		return isHalting;
	}
	public void setIsHalting(Boolean isHalting) {
		this.isHalting = isHalting;
	}
	public Boolean getIsClosed() {
		return isClosed;
	}
	public void setIsClosed(Boolean isClosed) {
		this.isClosed = isClosed;
	}
	public Total getTotal() {
		return total;
	}
	public void setTotal(Total total) {
		this.total = total;
	}
	public Trial getTrial() {
		return trial;
	}
	public void setTrial(Trial trial) {
		this.trial = trial;
	}
	public Trade getTrade() {
		return trade;
	}
	public void setTrade(Trade trade) {
		this.trade = trade;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public PriceObject getPriceHigh() {
		return priceHigh;
	}
	public void setPriceHigh(PriceObject priceHigh) {
		this.priceHigh = priceHigh;
	}
	public PriceObject getPriceLow() {
		return priceLow;
	}
	public void setPriceLow(PriceObject priceLow) {
		this.priceLow = priceLow;
	}
	public PriceObject getPriceOpen() {
		return priceOpen;
	}
	public void setPriceOpen(PriceObject priceOpen) {
		this.priceOpen = priceOpen;
	}
	public PriceObject getPriceAvg() {
		return priceAvg;
	}
	public void setPriceAvg(PriceObject priceAvg) {
		this.priceAvg = priceAvg;
	}
	public Double getChange() {
		return change;
	}
	public void setChange(Double change) {
		this.change = change;
	}
	public Double getChangePercent() {
		return changePercent;
	}
	public void setChangePercent(Double changePercent) {
		this.changePercent = changePercent;
	}
	public Double getAmplitude() {
		return amplitude;
	}
	public void setAmplitude(Double amplitude) {
		this.amplitude = amplitude;
	}
	public Double getPriceLimit() {
		return priceLimit;
	}
	public void setPriceLimit(Double priceLimit) {
		this.priceLimit = priceLimit;
	}
}

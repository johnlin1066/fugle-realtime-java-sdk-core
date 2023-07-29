package com.example.fugle_realtime_java_sdk_core.intraday.response;

public class TickerResponse {
	
	private String date;
	private String type;
	private String exchange;
	private String market;
	private String symbol;
	private String name;
	private String nameEn;
	private String industry;
	private String securityType;
	private double referencePrice;
	private double limitUpPrice;
	private double limitDownPrice;
	private boolean canDayTrade;
	private boolean canBuyDayTrade;
	private boolean canBelowFlatMarginShortSell;
	private boolean canBelowFlatSBLShortSell;
	private boolean isAttention;
	private boolean isDisposition;
	private boolean isUnusuallyRecommended;
	private boolean isSpecificAbnormally;
	private double matchingInterval;
	private String securityStatus;
	private double boardLot;
	private String tradingCurrency;
	private double exercisePrice;
	private double exercisedVolume;
	private double cancelledVolume;
	private double remainingVolume;
	private double exerciseRatio;
	private double knockInPrice;
	private double knockOutPrice;
	private String maturityDate;
	private double previousClose;
	private String openTime;
	private String closeTime;
	
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
	public String getNameEn() {
		return nameEn;
	}
	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public String getSecurityType() {
		return securityType;
	}
	public void setSecurityType(String securityType) {
		this.securityType = securityType;
	}
	public double getReferencePrice() {
		return referencePrice;
	}
	public void setReferencePrice(double referencePrice) {
		this.referencePrice = referencePrice;
	}
	public double getLimitUpPrice() {
		return limitUpPrice;
	}
	public void setLimitUpPrice(double limitUpPrice) {
		this.limitUpPrice = limitUpPrice;
	}
	public double getLimitDownPrice() {
		return limitDownPrice;
	}
	public void setLimitDownPrice(double limitDownPrice) {
		this.limitDownPrice = limitDownPrice;
	}
	public boolean isCanDayTrade() {
		return canDayTrade;
	}
	public void setCanDayTrade(boolean canDayTrade) {
		this.canDayTrade = canDayTrade;
	}
	public boolean isCanBuyDayTrade() {
		return canBuyDayTrade;
	}
	public void setCanBuyDayTrade(boolean canBuyDayTrade) {
		this.canBuyDayTrade = canBuyDayTrade;
	}
	public boolean isCanBelowFlatMarginShortSell() {
		return canBelowFlatMarginShortSell;
	}
	public void setCanBelowFlatMarginShortSell(boolean canBelowFlatMarginShortSell) {
		this.canBelowFlatMarginShortSell = canBelowFlatMarginShortSell;
	}
	public boolean isCanBelowFlatSBLShortSell() {
		return canBelowFlatSBLShortSell;
	}
	public void setCanBelowFlatSBLShortSell(boolean canBelowFlatSBLShortSell) {
		this.canBelowFlatSBLShortSell = canBelowFlatSBLShortSell;
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
	public boolean isUnusuallyRecommended() {
		return isUnusuallyRecommended;
	}
	public void setUnusuallyRecommended(boolean isUnusuallyRecommended) {
		this.isUnusuallyRecommended = isUnusuallyRecommended;
	}
	public boolean isSpecificAbnormally() {
		return isSpecificAbnormally;
	}
	public void setSpecificAbnormally(boolean isSpecificAbnormally) {
		this.isSpecificAbnormally = isSpecificAbnormally;
	}
	public double getMatchingInterval() {
		return matchingInterval;
	}
	public void setMatchingInterval(double matchingInterval) {
		this.matchingInterval = matchingInterval;
	}
	public String getSecurityStatus() {
		return securityStatus;
	}
	public void setSecurityStatus(String securityStatus) {
		this.securityStatus = securityStatus;
	}
	public double getBoardLot() {
		return boardLot;
	}
	public void setBoardLot(double boardLot) {
		this.boardLot = boardLot;
	}
	public String getTradingCurrency() {
		return tradingCurrency;
	}
	public void setTradingCurrency(String tradingCurrency) {
		this.tradingCurrency = tradingCurrency;
	}
	public double getExercisePrice() {
		return exercisePrice;
	}
	public void setExercisePrice(double exercisePrice) {
		this.exercisePrice = exercisePrice;
	}
	public double getExercisedVolume() {
		return exercisedVolume;
	}
	public void setExercisedVolume(double exercisedVolume) {
		this.exercisedVolume = exercisedVolume;
	}
	public double getCancelledVolume() {
		return cancelledVolume;
	}
	public void setCancelledVolume(double cancelledVolume) {
		this.cancelledVolume = cancelledVolume;
	}
	public double getRemainingVolume() {
		return remainingVolume;
	}
	public void setRemainingVolume(double remainingVolume) {
		this.remainingVolume = remainingVolume;
	}
	public double getExerciseRatio() {
		return exerciseRatio;
	}
	public void setExerciseRatio(double exerciseRatio) {
		this.exerciseRatio = exerciseRatio;
	}
	public double getKnockInPrice() {
		return knockInPrice;
	}
	public void setKnockInPrice(double knockInPrice) {
		this.knockInPrice = knockInPrice;
	}
	public double getKnockOutPrice() {
		return knockOutPrice;
	}
	public void setKnockOutPrice(double knockOutPrice) {
		this.knockOutPrice = knockOutPrice;
	}
	public String getMaturityDate() {
		return maturityDate;
	}
	public void setMaturityDate(String maturityDate) {
		this.maturityDate = maturityDate;
	}
	public double getPreviousClose() {
		return previousClose;
	}
	public void setPreviousClose(double previousClose) {
		this.previousClose = previousClose;
	}
	public String getOpenTime() {
		return openTime;
	}
	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}
	public String getCloseTime() {
		return closeTime;
	}
	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
	}
}

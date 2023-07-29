# Fugle Realtime Java SDK

Fugle Realtime Java SDK 是為了在Java方便地使用[富果](https://www.fugle.tw)提供的 [Fugle Realtime API](https://developer.fugle.tw/) 而成。

**此SDK需自行實作HttpTool(發出GET請求與包裝回傳對象成ResponseObject)，也可自行實作HttpTool，快速使用範例請參照 [fugle-realtime-java-sdk-example-springboot-resttemplate](https://github.com/johnlin1066/fugle-realtime-java-sdk-example-springboot-resttemplate)。**

行情API金鑰申請 - [https://developer.fugle.tw/docs/key/](https://developer.fugle.tw/docs/key/)。

## Install
```
mvn install
```

## Import
```
<dependency>
	<groupId>com.example</groupId>
	<artifactId>fugle-realtime-java-sdk-core</artifactId>
	<version>1.0.0</version>
</dependency>
```

## Implement HttpTool (責任為發出GET請求與包裝回傳對象成ResponseObject)
```
public interface HttpTool {
	
	public TickersResponse getForTickersResponse(String url);
	public TickerResponse getForTickerResponse(String url);
	public QuoteResponse getForQuoteResponse(String url);
	public CandlesResponse getForCandlesResponse(String url);
	public TradesResponse getForTradesResponse(String url);
	public VolumesResponse getForVolumesResponse(String url);
	
	public QuotesResponse getForQuotesResponse(String url);
	public MoversResponse getForMoversResponse(String url);
	public ActivesResponse getForActivesResponse(String url);
	
	public HistoricalCandlesResponse getForHistoricalCandlesResponse(String url);
	public StatsResponse getForStatsResponse(String url);

}
```

## Implement Constant
```
public class Constant {
	
	protected String fugleApiUrl;
	protected String xApiKey;

	...
}
```

## New Instance
```
HttpTool httpTool = HttpToolImp();
Constant Constant = ConstantImp();
IntradayInteractors intradayInteractors = new IntradayInteractorsImp(httpTool, constant);
SnapshotInteractors snapshotInteractorsnew = new SnapshotInteractorsImp(httpTool, constant);
HistoricalInteractors  historicalInteractors = new HistoricalInteractorsImp(httpTool, constant);
```

## Usage
日內行情(Intraday)
```
IntradayRequest intradayRequest = new IntradayRequestBuilder().setType("EQUITY")
				.setExchange("TWSE").setMarket("TSE").setIndustry("24").setNormal(true).build();
TickersResponse tickersResponse = intradayInteractors.tickers(intradayRequest);

...
```
行情快照(Snapshot)
```
SnapshotRequest snapshotRequest = new SnapshotRequestBuilder().setMarket("TSE").build();
QuotesResponse quotesResponse = snapshotInteractors.quotes(snapshotRequest);

...
```
歷史行情(Historical)
```
HistoricalRequest historicalRequest = new HistoricalRequestBuilder().setSymbol("2330")
				.setFields("open,high,low,close,volume").build();
HistoricalCandlesResponse historicalCandlesResponse = historicalInteractors.historicalCandles(historicalRequest);

...
```

如需更多範例請參考請 [fugle-realtime-java-sdk-example-springboot-resttemplate](https://github.com/johnlin1066/fugle-realtime-java-sdk-example-springboot-resttemplate)的FugleRealtimeExample。
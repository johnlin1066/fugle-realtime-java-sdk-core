# Fugle Realtime Java SDK

Fugle Realtime Java SDK 是為了在Java方便地使用[富果](https://www.fugle.tw)提供的 [Fugle Realtime API](https://developer.fugle.tw/) 而成。

**此SDK需自行實作HttpTool，也可自行實作HttpTool，快速使用範例請參照 [fugle-realtime-java-sdk-example-springboot-resttemplate](https://github.com/johnlin1066/fugle-realtime-java-sdk-example-springboot-resttemplate)。**

P.S.HttpTool的責任為發出GET請求與包裝回傳對象成ResponseObject

## Install
```
mvn install
```

## Import
```
<dependency>
	<groupId>com.example</groupId>
	<artifactId>fugle-realtime-java-sdk-core</artifactId>
	<version>0.0.1</version>
</dependency>
```

## Implement HttpTool (責任為發出GET請求與包裝回傳對象成ResponseObject)
```
public interface HttpTool {
	
	public ResponseObject getForObject(String url);

}
```

## New Instance
```
HttpTool httpTool = HttpToolImp();
FugleRealtime fugleRealtime = new FugleRealtimeImp(httpTool);
```

## Usage
```
RequestObject requestObject = new RequestObjectBuilder().setSymbolId(SymbolId).setApiToken(ApiToken).build();
ResponseObject responseObject = fugleRealtime.chart(requestObject);

RequestObject requestObject = new RequestObjectBuilder().setSymbolId(SymbolId).setApiToken(ApiToken).build();
ResponseObject responseObject = fugleRealtime.quote(requestObject);

RequestObject requestObject = new RequestObjectBuilder().setSymbolId(SymbolId).setApiToken(ApiToken).build();
ResponseObject responseObject = fugleRealtime.meta(requestObject);

RequestObject requestObject = new RequestObjectBuilder().setSymbolId(SymbolId).setApiToken(ApiToken).build();
ResponseObject responseObject = fugleRealtime.dealts(requestObject);

RequestObject requestObject = new RequestObjectBuilder().setSymbolId(SymbolId).setApiToken(ApiToken).build();
ResponseObject responseObject = fugleRealtime.volumes(requestObject);	
```
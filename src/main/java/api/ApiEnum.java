package api;


public enum ApiEnum {
    GOODLE_GET("http://google.com","GET",false,null),
    AWS_GET("https://wqdy9aha38.execute-api.us-east-2.amazonaws.com/prod","GET",true,"greetings"),
    AWS_POST("https://wqdy9aha38.execute-api.us-east-2.amazonaws.com/prod","POST",true,"greetings");


    public String url;
    public String method;
    boolean isActive;
    String expected;

    ApiEnum(String testUrl, String testMethod,boolean isActive,String expected){
        this.url=testUrl;
        this.method=testMethod;
        this.isActive = isActive;
        this.expected= expected;
    }


}

package api;


public enum ApiEnum {
    GOODLE_GET("Google_Get","http://google.com","GET"),
    AWS_POST("Aws_Get","https://wqdy9aha38.execute-api.us-east-2.amazonaws.com/prod","GET");

    public String title;
    public String url;
    public String method;
    ApiEnum( String testTitle, String testUrl, String testMethod) {
        title=testTitle;
        url=testUrl;
        method=testMethod;
    }


}

package rockpaper;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;

public class Connector {
    private static String getParamsString(Map<String, String> params)
            throws UnsupportedEncodingException {
        StringBuilder result = new StringBuilder();

        for (Map.Entry<String, String> entry : params.entrySet()) {
            result.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
            result.append("=");
            result.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
            result.append("&");
        }

        String resultString = result.toString();
        return resultString.length() > 0
                ? resultString.substring(0, resultString.length() - 1)
                : resultString;
    }
    static String firstResponse = null;
    public static boolean valiadate(String request, String method, String response){
        boolean result = true;
        if (firstResponse==null){
            firstResponse = response;

            Log.show("method: "+method);
            Log.show("url: " + request);
            Log.show("response: "+response);

        } else {
            result = firstResponse.equalsIgnoreCase(response);
        }
        return result;
    }
    public static Response callAPI(String strUrl, String method, Map<String,String> parameters, Map<String,String> headers){
        Response response = new Response();
        try {
            URL url = new URL ( strUrl!=null?strUrl:"http://google.com");
            String output = "";
            HttpURLConnection con = (HttpURLConnection) url.openConnection();

            con.setRequestMethod("GET");
            if (method!=null && "POST".equalsIgnoreCase(method.trim())){
                con.setRequestMethod("POST");
            }

            con.setRequestProperty("Content-Type", "application/json");

            con.setConnectTimeout(5000);
            con.setReadTimeout(5000);

            if (headers!=null){

            }

            long conLength = 0;
            if (parameters!=null) {
                con.setDoOutput(true);
                output = getParamsString(parameters);
                DataOutputStream out = new DataOutputStream(con.getOutputStream());
                out.writeBytes(output);
                out.flush();
                out.close();
                conLength = output.length();
            }
            con.setRequestProperty("ContentLength",conLength+"");

            int status = con.getResponseCode();

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();

            con.disconnect();

            Log.show(strUrl + " " + output );
            Log.show(method);
            Log.show(content.toString());

            Log.log(""+status);
            Log.log(content.toString());
        } catch (Exception e){
            e.printStackTrace();
        }
        return response;
    }
}

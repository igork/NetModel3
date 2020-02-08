package rockpaper;

import java.util.Date;

public class Client {



    public static void main(String[] arg){
        long steps=100;

        Date dt0 = new Date();
        System.out.println("rockpaper.Client starts..." + dt0);

        for(int i=0;i<steps;i++){
            Connector.callAPI(null,"POST" +
                    "",null,null);
        }

        Date dt99 = new Date();
        long t = Math.abs(dt0.getTime() - dt99.getTime());
        System.out.println("rockpaper.Client ends... " + t);

        System.out.println("Medium step : " + ((float)t/steps));
    }
}

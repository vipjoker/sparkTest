package sample;


import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/**
 * Created by oleh on 27.05.16.
 */
public class KpiClient {

    private final int READ_TIMEOUT = 10000;
    private final int CONNECT_TIMEOUT = 15000;
    private String mBaseUrl;
    public KpiClient(String baseUrl){
        mBaseUrl = baseUrl;
    }

    public void get(String endPoint){
        request(mBaseUrl + endPoint, RequestMethod.GET ,null);
    }

    public void get(String enpoint, Map<String,String> params){

        GetParams encodedParams = new GetParams(params);
        String url = mBaseUrl+enpoint +encodedParams.format();
        request(url, RequestMethod.GET,null);
    }

    public void post(String endPoint){
        request(mBaseUrl + endPoint,RequestMethod.POST,null);
    }




    private void request(String _url , RequestMethod method , Parameters params){

        BufferedWriter writer = null;
        OutputStream os = null;
        try {

            URL url = new URL(_url);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setReadTimeout(READ_TIMEOUT);
            conn.setConnectTimeout(CONNECT_TIMEOUT);
            conn.setRequestMethod(method.toString());
            conn.setDoInput(true);
            conn.setDoOutput(true);

//            os = conn.getOutputStream();
            if(params != null) {

                writer = new BufferedWriter(
                        new OutputStreamWriter(os, "UTF-8"));

                writer.write(params.format());
                writer.flush();
                writer.close();
            }
  //          os.close();
            conn.connect();
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            try {
                if(writer!= null)writer.close();
                if(os != null)os.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
}

}
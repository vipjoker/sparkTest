package sample;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

/**
 * Created by oleh on 27.05.16.
 */
public class GetParams implements Parameters {
    private StringBuilder mBuilder;

    public GetParams(Map<String, String> params) {

        mBuilder = new StringBuilder("?");
        boolean first = true;
        try {
            for (String key : params.keySet()) {
                if (first) first = false;
                else mBuilder.append("&");

                mBuilder.append(URLEncoder.encode(key, "UTF-8"));
                mBuilder.append("=");
                mBuilder.append(URLEncoder.encode(params.get(key), "UTF-8"));
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }


    @Override
    public String format() {
        if (mBuilder != null) return mBuilder.toString();
        else return null;
    }
}

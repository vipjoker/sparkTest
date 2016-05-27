package sample;

import java.util.Map;

/**
 * Created by oleh on 27.05.16.
 */
public interface RequestHandler <V extends Validable>{

    Answer process (V value, Map<String,String> urlParams,boolean shouldReturnHtml);
}

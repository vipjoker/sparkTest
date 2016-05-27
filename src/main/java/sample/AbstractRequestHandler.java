package sample;

import spark.Request;
import spark.Response;
import spark.Route;

import java.util.Map;

/**
 * Created by oleh on 27.05.16.
 */
public class AbstractRequestHandler<V extends Validable> implements RequestHandler<V>, Route {

    private Class<V> valueClass;

    protected Model model;

    @Override
    public Answer process(V value, Map<String, String> urlParams, boolean shouldReturnHtml) {
        return null;
    }

    @Override
    public Object handle(Request request, Response response) throws Exception {
        return null;
    }
}

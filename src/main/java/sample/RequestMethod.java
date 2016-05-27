package sample;

/**
 * Created by oleh on 27.05.16.
 */
public enum RequestMethod {
    GET("GET"),
    POST("POST"),
    PUT("PUT"),
    DELETE("DELETE");

    private final String method;

    private RequestMethod(final String _method){
        this.method = _method;
    }

    @Override
    public String toString() {
        return method;
    }
}



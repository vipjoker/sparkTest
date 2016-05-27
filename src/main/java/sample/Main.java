package sample;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.UUID;

import static java.net.HttpURLConnection.HTTP_BAD_REQUEST;
import static spark.Spark.*;

/**
 * Created by oleh on 26.05.16.
 */
public class Main {
    public static void main(String[] args) {
        runServer();
    }

    public static void runServer(){

        get("/hello" ,(request, response) -> "Hello world");

        post("/hello",(req,resp)-> "Hello from post");

        put("/hello",((request, response) -> "Hello from put"));

        delete("/hello",(req,resp)-> "Hello from delete");
    }
}

package sample;

import static spark.Spark.*;

/**
 * Created by oleh on 26.05.16.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello oleh");

        get("/hello" ,(request, response) -> {


            return "Hello world";
        });

        post("/hello",(req,resp)-> "Hello from post");

        put("/hello",((request, response) -> "Hello from put"));

        delete("/hello",(req,resp)-> "Hello from delete");
    }
}

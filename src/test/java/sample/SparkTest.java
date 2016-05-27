package sample;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import spark.utils.SparkUtils;
import spark.webserver.SparkServerFactory;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by oleh on 27.05.16.
 */
public class SparkTest {
    private static KpiClient mClient;
    @BeforeClass
    public static void init(){
        Main.runServer();
        mClient = new KpiClient("http://localhost:4567");
    }

    @Test
    public void checkTest(){
        mClient.get("/hello");
        //mClient.post("/hello");



    }


}

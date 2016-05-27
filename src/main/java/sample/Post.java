package sample;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by oleh on 27.05.16.
 */
public class Post {

    private UUID post_uuid;
    private String title;
    private String content;
    private Date publishing_date;
    private List<String> categories;
}
//https://github.com/sparktutorials/BlogService_SparkExample/blob/unit_tests/src/main/java/me/tomassetti/model/Post.java
//        https://sparktutorials.github.io/2015/07/30/spark-testing-unit.html

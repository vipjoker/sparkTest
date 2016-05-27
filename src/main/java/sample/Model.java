package sample;

import java.util.List;
import java.util.UUID;

/**
 * Created by oleh on 27.05.16.
 */
public interface Model {

    UUID createPost(String title, String content, List<String> categories);
    UUID createComment(UUID post, String author,String content);
    List<Post> getAllPosts();

    List<Comment> getAllCommentsOn(UUID post);
    boolean existPost(UUID post);
}

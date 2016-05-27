package sample;

/**
 * Created by oleh on 27.05.16.
 */
public class Answer {

    private int code;
    private String body;

    public Answer(int code, String body) {
        this.code = code;
        this.body = body;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "code=" + code +
                ", body='" + body + '\'' +
                '}';
    }
}

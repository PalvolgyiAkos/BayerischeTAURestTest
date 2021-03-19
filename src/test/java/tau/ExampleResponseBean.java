package tau;

import java.time.LocalDateTime;

public class ExampleResponseBean {

    static class Attributes {
        private String title;

        private String body;
        private int readerCount;

        public String getTitle() {
            return title;
        }

        public String getBody() {
            return body;
        }

        public int getReaderCount() {
            return readerCount;
        }
    }

    private String type;
    private int id;
    private Attributes attributes;

    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public Attributes getAttributes() {
        return attributes;
    }
}

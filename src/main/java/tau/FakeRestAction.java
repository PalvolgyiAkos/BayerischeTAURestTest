package tau;

public class FakeRestAction {


    public static String exampleResponse() {

        return "{\n" +
                "  \"type\": \"articles\",\n" +
                "  \"id\": \"101\",\n" +
                "  \"attributes\": {\n" +
                "    \"title\": \"There is a JSON title!\",\n" +
                "    \"body\": \"The shortest article. Ever.\",\n" +
                "    \"readerCount\": \"321\"\n" +
                "  }\n" +
                "}";
    }

    public static String errorResponse() {

        return "{\n" +
                "  \"errors\": [\n" +
                "    {\n" +
                "      \"status\": \"422\",\n" +
                "      \"title\":  \"Invalid Attribute\",\n" +
                "      \"detail\": \"First name must contain at least three characters.\"\n" +
                "    }\n" +
                "  ]\n" +
                "}";
    }
}

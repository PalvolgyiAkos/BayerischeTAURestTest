package tau;

import com.google.gson.Gson;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TauTestToImplement1 {

    private static final String EXPECTED_TYPE = "articles";
    private static final String EXPECTED_TITLE = "There is a JSON title!";
    private static final String EXPECTED_BODY = "The shortest article. Ever.";
    private static final int EXPECTED_MINIMUM_READERCOUNT = 300;
    private static final int EXPECTED_MAXIMUM_READERCOUNT = 400;

    @Test
    public void exampleTest() {
        //FIXME: Implement test, that uses the FakeRestAction.exampleResponse() method, and implement meaningful assertions,
        // based on the constant fields, and the implemented example.

        final String apiResponse = FakeRestAction.exampleResponse();
        final ExampleResponseBean exampleResponseBean = new Gson().fromJson(apiResponse, ExampleResponseBean.class);

        Assert.assertEquals(exampleResponseBean.getType(), EXPECTED_TYPE,
                "Example response Type was not equal to expected one. Expected: " + EXPECTED_TYPE + "returned: " + exampleResponseBean.getType());
        
        Assert.assertEquals(exampleResponseBean.getAttributes().getTitle(), EXPECTED_TITLE,
                "Example response Title was not equal to expected one. Expected: " + EXPECTED_TITLE +
                        "returned: " + exampleResponseBean.getAttributes().getTitle());
        
        Assert.assertEquals(exampleResponseBean.getAttributes().getBody(), EXPECTED_BODY,
                "Example response Body was not equal to expected one. Expected: " + EXPECTED_BODY +
                        "returned" + exampleResponseBean.getAttributes().getBody());
        
        Assert.assertTrue(exampleResponseBean.getAttributes().getReaderCount() > EXPECTED_MINIMUM_READERCOUNT,
                "Example response ReaderCount was not bigger to expected one. Expected: " + EXPECTED_MINIMUM_READERCOUNT +
                        "returned: " + exampleResponseBean.getAttributes().getReaderCount());
        
        Assert.assertTrue(exampleResponseBean.getAttributes().getReaderCount() < EXPECTED_MAXIMUM_READERCOUNT,
                "Example response ReaderCount was not smaller to expected one. Expected: " + EXPECTED_MAXIMUM_READERCOUNT +
                        "returned: " + exampleResponseBean.getAttributes().getReaderCount());
    }

}

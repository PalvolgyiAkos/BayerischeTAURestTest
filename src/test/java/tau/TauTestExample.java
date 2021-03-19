package tau;

import com.google.gson.Gson;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TauTestExample {

    public static final int EXPECTED_EXAMPLE_ID = 101;

    @Test
    public void exampleTest() {
        final String apiResponse = FakeRestAction.exampleResponse();
        final ExampleResponseBean exampleResponseBean = new Gson().fromJson(apiResponse, ExampleResponseBean.class);

        Assert.assertEquals(exampleResponseBean.getId(), EXPECTED_EXAMPLE_ID, "Example response ID was not equal to expected one. Expected: "
                + EXPECTED_EXAMPLE_ID + " returned: " + exampleResponseBean.getId());
    }

}

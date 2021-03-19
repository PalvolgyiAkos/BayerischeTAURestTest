package tau;

import com.google.gson.Gson;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class TauTestToImplement2 {

    private final static int[] EXPECTED_ERROR_CODES = {400, 401, 403, 404};

    @Test
    public void exampleTest() {
        //FIXME: Implement test, that uses the FakeRestAction.errorResponse() method.
        //FIXME: Implement ErrorResponseBean as the parsing result of the call.
        //FIXME: Check if the results contain expected error codes, fail if there is one, that it not in EXPECTED_ERROR_CODES constant.

        //HINT: Parse response into an array in a form like:
        // final ErrorResponseBean[] errorResponseBean = new Gson().fromJson(apiResponse, ErrorResponseBean[].class);
        final String apiResponse = FakeRestAction.errorResponse();
        final ErrorResponseBean errorResponseBean = new Gson().fromJson(apiResponse, ErrorResponseBean.class);

        if (Arrays.stream(EXPECTED_ERROR_CODES).noneMatch(i -> errorResponseBean.getErrors()[0].getStatus() == i)) {
            Assert.fail("Error response Status was not found in EXPECTED_ERROR_CODES array.");
        }

    }

}

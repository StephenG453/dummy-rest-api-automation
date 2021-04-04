import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestNGSimpleTest {

    @Test
    public void testGetMethodHappyPath() {
        final int EXPECTED_STATUS_CODE = 200;
        final String EXPECTED_EMPLOYEE_NAME = "Bradley Greer";

        Response response = RestAssured.get("http://dummy.restapiexample.com/api/v1/employee/19");

        Assert.assertEquals(response.jsonPath().get("data.employee_name"), EXPECTED_EMPLOYEE_NAME);
        Assert.assertEquals(response.statusCode(), EXPECTED_STATUS_CODE);
    }
}

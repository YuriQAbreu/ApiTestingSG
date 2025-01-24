import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ApiTests extends BaseTest {

    @Test
    public void testGetPost() {
        Response response = RestAssured.get("/posts/1");
        Assert.assertEquals(response.getStatusCode(), 200);

        String title = response.jsonPath().getString("title");
        Assert.assertNotNull(title, "Title should not be null or empty");
        Assert.assertFalse(title.isEmpty(), "Title should not be empty");

        int userId = response.jsonPath().getInt("userId");
        Assert.assertTrue(userId > 0, "User ID should be a positive number");
    }

    @Test
    public void testGetUser() {
        Response response = RestAssured.get("/users/1");
        Assert.assertEquals(response.getStatusCode(), 200);

        String email = response.jsonPath().getString("email");
        Assert.assertTrue(email.matches("^[\\w.%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$"), "Email should be valid");

        String city = response.jsonPath().getString("address.city");
        Assert.assertNotNull(city, "City should not be null");
    }
}
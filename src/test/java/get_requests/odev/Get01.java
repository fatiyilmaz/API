package get_requests.odev;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.replaceFiltersWith;

public class Get01 {

         /*
        Given
            https://reqres.in/api/users/3
        When
            User sends a GET Request to the url
        Then
            HTTP Status Code should be 200
        And
            Content Type should be JSON
        And
            Status Line should be HTTP/1.1 200 OK
     */


    @Test
    public void test01() {

        String url = "https://reqres.in/api/users/3";
        Response response = given().when().get(url);
        response.prettyPrint();

        response.then().statusCode(200).contentType("application/JSON").statusLine("HTTP/1.1 200 OK");





    }
}

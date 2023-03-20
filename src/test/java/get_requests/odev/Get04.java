package get_requests.odev;

import base_urls.HerOkuAppBaseUrl;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;

public class Get04 extends HerOkuAppBaseUrl {

    /*
        Given
            https://restful-booker.herokuapp.com/booking?firstname=Almedin&lastname=Alikadic
        When
            User sends get request to the URL
        Then
            Status code is 200
          And
              Among the data there should be someone whose firstname is "Almedin" and lastname is "Alikadic"

     */

    @Test
    public void get04() {

        //Set the URL
        spec.pathParam("first","booking").queryParams("firstname","Almedin","lastname","Alikadic");


        Response response = given().spec(spec).get("/{first}");
        response.prettyPrint();

        //Do assertion
        assertEquals(200,response.statusCode());
        assertFalse(response.asString().contains("bookingid"));


    }
}

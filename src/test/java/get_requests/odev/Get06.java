package get_requests.odev;

import base_urls.GoRestBaseUrl;
import io.restassured.response.Response;
import org.junit.Test;
import test_data.GoRestTestData;


import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class Get06 extends GoRestBaseUrl {

    /*
        Given
            https://gorest.co.in/public/v1/users/128529
        When
            User send GET Request to the URL
        Then
            Status Code should be 200
        And
            Response body should be like

{
    "meta": null,
    "data": {
        "id": 128529,
        "name": "Anamika Joshi",
        "email": "anamika_joshi@corkery-ritchie.info",
        "gender": "male",
        "status": "active"
    }
}
     */

    @Test
    public void get06() {
        spec.pathParams("first","users","second",128529);

        GoRestTestData goRestTestData = new GoRestTestData();
        Map<String,String> dataMap = goRestTestData.dataMapMethod("Anamika Joshi","anamika_joshi@corkery-ritchie.info","male","active");
        Map<String,Object> expectedData = goRestTestData.expectedDataMapMethod("null",dataMap);
        System.out.println("expectedData = " + expectedData);


        Response response = given().spec(spec).get("/{first}/{second}");
        response.prettyPrint();


        //Do Assertion
        assertEquals(200,response.statusCode());




    }
}

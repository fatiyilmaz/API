package get_requests.odev;

import base_urls.RegresinBaseUrl;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Test;
import org.testng.asserts.SoftAssert;

import static io.restassured.RestAssured.given;

public class Get05 extends RegresinBaseUrl {

    /*
        Given
          https://reqres.in/api/unknown/3
        When
            User send a GET request to the URL
        Then
            HTTP Status Code should be 200
        And
            Response content type is “application/json; charset=utf-8”
        And
            Response body should be like;(Soft Assertion)
        {
        "data": {
            "id": 3,
            "name": "true red",
            "year": 2002,
            "color": "#BF1932",
            "pantone_value": "19-1664"
        },
        "support": {
            "url": "https://reqres.in/#support-heading",
            "text": "To keep ReqRes free, contributions towards server costs are appreciated!"
        }
}
      */

    @Test
    public void get05() {
        spec.pathParams("first","unknown","second",3);


        Response response = given().spec(spec).get("/{first}/{second}");
        response.prettyPrint();


        //Do assertion

        response.then().statusCode(200).contentType(ContentType.JSON);

        JsonPath jsonPath = response.jsonPath();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(jsonPath.getString("data.name"),"true red","dogru degil");
        softAssert.assertEquals(jsonPath.getInt("data.year"),2002,"dogru degil");
        softAssert.assertEquals(jsonPath.getString("data.color"),"#BF1932","dogru degil");
        softAssert.assertEquals(jsonPath.getString("data.pantone_value"),"19-1664","dogru degil");
        softAssert.assertEquals(jsonPath.getString("support.url"),"https://reqres.in/#support-heading","dogru degil");
        softAssert.assertEquals(jsonPath.getString("support.text"),"To keep ReqRes free, contributions towards server costs are appreciated!","dogru degil");

        softAssert.assertAll();





    }
}

package get_requests;

import base_urls.HerOkuAppBaseUrl;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertTrue;

public class Get05 extends HerOkuAppBaseUrl {

         /*
        Given
            https://restful-booker.herokuapp.com/booking
        When
            User sends a GET request to the URL
        Then
            Status code is 200
	  	And
	  		Among the data there should be someone whose firstname is "Sally" and last name is "Brown"
            (Data içerisinde firstname değeri "Sally", lastname değeri "Brown" olan biri olmalı)
     */

    //https://restful-booker.herokuapp.com/booking?firstname=Sally&lastname=Brown

    @Test
    public void get05(){

        //Set the URL
        spec.//icerisinde sadece base url var.
                pathParam("first","booking").//path param bir tane var => booking, onu koyuyoruz.
                queryParams("firstname","Sally",//query params'a ise firstname=Sally&lastname=Brown, olan iki parametreyi koyuyoruz.
                        "lastname","Brown");



        //Set the expected data



        //Send the request and get the response
        Response response = given().spec(spec).when().get("/{first}");//spec icerisinde path parametre ve query parametre var.
        response.prettyPrint();




        //Do Assertion
        response.then().statusCode(200);//Status code is 200

        //	  		Among the data there should be someone whose firstname is "Sally" and last name is "Brown"
        //            (Data içerisinde firstname değeri "Sally", lastname değeri "Brown" olan biri olmalı)

        assertTrue(response.asString().contains("bookingid"));//boyle biri varsa bookingid gelecektir yoksa gelmeyecektir.




    }

}

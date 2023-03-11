package get_requests;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class RequestResponse {

    /*
        1) Postman manuel API testi icin kullanilir.
        2) API omotasyonu icin Rest-Assured Library kullanicaz.
        3) Otomasyon kodlarinin yazimi icin su adimlari izliyoruz;
            a)Gereksinimleri anlama
            b)Test Case'i yazma
                -Test Case'i yazmak icin "Gherkin Language" kullaniyoruz.
                  x)Given: On kosullar --> Endpoint, body
                  y)When: Islemler --> Get, Put, Delete,...
                  z)Then: Donusler --> Assert
                  t)And: Coklu islemlerin art arda yazilacagi yerlerde kullanilir.
            c)Test kodunu yazarken su adimlari izleriz;
                  i)Set the URL
                 ii)Set the expected data -> beklenen datayi olusturma. Gonderdigim data ile aldigim datayi karsilastirma.
                iii)Send the request and get the response
                 iv)Do assertion
     */

    public static void main(String[] args) {
        String url = "https://restful-booker.herokuapp.com/booking/55";
        //Get request nasil yapilir:
        Response response = given().when().get(url);

        response.prettyPrint();//prettyPrint() methodu response datayi yazdirir.

        //Status Code nasil yazdirilir:
        System.out.println("Status Code: " + response.statusCode());

        //Content Type nasil yazdirilir:
        System.out.println("Content Type: " + response.contentType());

        //Status Line nasil yazdirilir:
        System.out.println("Status Line: " + response.getStatusLine());//Basari kodu

        //Header nasil yazdirilir:
        System.out.println("Header: " + response.header("Connection"));
        System.out.println("Header: " + response.header("Server"));

        //Headers nasil yazdirilir:
        System.out.println("Headers: " + response.headers());

        //Time nasil yazdirilir:
        System.out.println("Time: " + response.getTime());
    }   

}

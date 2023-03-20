package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class HerOkuAppBaseUrl {

    protected RequestSpecification spec;//protectec koymak; extend yapilmadan ulasilcak, kismi encapsualtion

    @Before//Her test methodundan once calisir.
    public void setUp(){
        spec = new RequestSpecBuilder().setContentType(ContentType.JSON).setBaseUri("https://restful-booker.herokuapp.com").build();

        //En guzeli her api icin , url icin bir class olusturmak.
    }
}

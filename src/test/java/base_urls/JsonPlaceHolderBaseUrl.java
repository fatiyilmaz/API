package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class JsonPlaceHolderBaseUrl {

    protected RequestSpecification spec;//protectec koymak; extend yapilmadan ulasilcak, kismi encapsualtion

    @Before
    public void setUp(){
        spec = new RequestSpecBuilder().setAccept(ContentType.JSON).setBaseUri("https://jsonplaceholder.typicode.com").build();
    }
}

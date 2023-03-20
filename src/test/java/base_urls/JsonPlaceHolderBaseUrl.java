package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class JsonPlaceHolderBaseUrl {

    protected RequestSpecification spec;//protectec koymak; extend yapilmadan ulasilcak, kismi encapsualtion

    @Before//Her test methodundan once calisir. Tekrarlari ben burada yapiyorum.
    public void setUp(){
        spec = new RequestSpecBuilder().setContentType(ContentType.JSON).setAccept(ContentType.JSON).setBaseUri("https://jsonplaceholder.typicode.com").build();

        //setacceptcontenttype type karsiya gonderdigimizin kabul edildigi
        //setcontenttype bizim icerigimiz


    }
}

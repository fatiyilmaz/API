package test_data;

import java.util.HashMap;
import java.util.Map;

public class JsonPlaceHolderTestData {

    public Map<String,Object> expectedDataMethod(Integer userId,String title, Boolean complated){

        Map<String,Object> expectedData = new HashMap<>();

        expectedData.put("userId",userId);
        expectedData.put("title",title);
        expectedData.put("complated",complated);

        return expectedData;
    }

    /*
        Map<String,Object> expectedData = new HashMap<>();
        expectedData.put("userId",21);
        expectedData.put("title","Wash the dishes");
        expectedData.put("completed",false);
     */
}

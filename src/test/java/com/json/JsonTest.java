package com.json;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.ypw.springboothello.json.DefaultResults;
import org.junit.jupiter.api.Test;

import static com.alibaba.fastjson.serializer.SerializerFeature.IgnoreNonFieldGetter;

public class JsonTest {
    @Test
    void jsonTest() throws JsonProcessingException {
        DefaultResults results = new DefaultResults();
        results.setCode("6666");
        String s = JSONObject.toJSONString(results,IgnoreNonFieldGetter);
        System.out.println(s);

        /*ObjectMapper objectMapper = new ObjectMapper();
        String s1 = objectMapper.writeValueAsString(results);
        System.out.println(s1);*/

    }
}

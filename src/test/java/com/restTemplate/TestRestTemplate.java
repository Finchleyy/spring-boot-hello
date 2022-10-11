package com.restTemplate;

import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

public class TestRestTemplate {
    @Test
    public void test1() {
        String url = "http://localhost:10010/accounts/create";
        RestTemplate restTemplate = new RestTemplate();
        // 此处不能换成 HashMap
        MultiValueMap<String, Object> params = new LinkedMultiValueMap<>();
        params.add("id", "100001");
        params.add("name", "杜甫");
        params.add("age", "100001");
        params.add("pwd", "&*()#$%^");
        params.add("param", "111111111111111");
        // 通过 HttpHeaders 设置Form方式提交
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        HttpEntity<MultiValueMap<String, Object>> httpEntity = new HttpEntity<>(params, headers);
        String account = restTemplate.postForObject(url, httpEntity, String.class);
        System.out.println(account);

    }
}

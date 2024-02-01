package com.uccwal.naratracerserver.controller;


import com.uccwal.naratracerserver.entity.FieldKeyword;
import com.uccwal.naratracerserver.entity.TracerRequest;
import com.uccwal.naratracerserver.repository.FieldKeywordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Controller
public class MainController {



    @GetMapping("/main")
    public String main(){

        return "/page/main.html";
    }

    @GetMapping("/main2")
    public String main2(){

        return "/page/main2.html";
    }

    @GetMapping("/postSample")
    public String postSample(){

        return "/page/postSample.html";
    }

    @GetMapping("/keyword")
    public String keyword() {
        return "/page/keyword.html";
    }


    private final String getTracerDataUrl = "http://localhost:8000/tracerData";

    private final String externalApiUrl = "http://localhost:8000/searchTracerData";

    @GetMapping("/getTracerData")
    @ResponseBody
    public ResponseEntity<String> getTracerData() {
        // RestTemplate을 생성합니다.
        RestTemplate restTemplate = new RestTemplate();

        // 외부 API를 호출하고 응답을 문자열로 받습니다.
        ResponseEntity<String> response = restTemplate.getForEntity(getTracerDataUrl, String.class);
        String responseBody = response.getBody();

        // 받은 데이터를 JSON 형식으로 그대로 반환합니다.
        return ResponseEntity.ok(responseBody);
    }



    @PostMapping("/postTracerData")
    public ResponseEntity<String> postTracerData(@RequestBody TracerRequest tracerRequest) {
        // tracerRequest 객체에 POST 요청의 JSON 데이터가 자동으로 매핑됩니다.

        // 여기서는 받은 데이터를 가지고 외부 API에 요청을 보내고, 그 결과를 응답합니다.
        String externalApiResponse = callExternalApi(tracerRequest);

        // 받은 데이터를 그대로 JSON 형태로 응답합니다.
        return ResponseEntity.ok(externalApiResponse);
    }

    private String callExternalApi(TracerRequest tracerRequest) {
        // RestTemplate을 생성합니다.
        RestTemplate restTemplate = new RestTemplate();

        // 외부 API에 POST 요청을 보내고 응답을 문자열로 받습니다.
        ResponseEntity<String> response = restTemplate.postForEntity(externalApiUrl, tracerRequest, String.class);
        return response.getBody();
    }
}

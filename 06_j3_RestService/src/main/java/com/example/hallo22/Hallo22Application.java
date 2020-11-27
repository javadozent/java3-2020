package com.example.hallo22;

import com.example.hallo22.model.Message;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Hallo22Application {


    static Logger log = LogManager.getLogger();
    private static final String GET_URL = "http://localhost:8080/messages?id=2";
    private static final String POST_URL = "http://localhost:8080/messages/new-message";

    public static void main(String[] args) {

        log.debug("App start...");
        SpringApplication.run(Hallo22Application.class, args);





        /*
        Eigentlich als/für JUnitTest!
         */
        RestTemplate restTemplate = new RestTemplate();

        System.out.println(restTemplate.getForObject(GET_URL, String.class));
        ResponseEntity<String> re = restTemplate.postForEntity(POST_URL, new Message(4, "Hallo Post"), String.class);
        // System.out.println(re);
        System.out.println(re.getStatusCode());
        System.out.println(re.getBody());

    }


}

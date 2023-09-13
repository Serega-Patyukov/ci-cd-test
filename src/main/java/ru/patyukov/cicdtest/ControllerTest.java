package ru.patyukov.cicdtest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

@Slf4j
@RestController
@RequestMapping("/test")
public class ControllerTest {

    @GetMapping("/status")
    public @ResponseBody String status() {

        RestTemplate template = new RestTemplate();

        for (int i = 0; i < 2000; i++) {
            new Thread(() -> template.exchange("http://localhost:27015/" + new Random().nextInt(), HttpMethod.GET, null, String.class)).start();
//            new Thread(() -> template.exchange("http://localhost:27015/" + new Random().nextInt(), HttpMethod.POST, null, String.class)).start();
        }

//        ResponseEntity<String> response = template.exchange("http://localhost:8080/", HttpMethod.POST, null, String.class);

        return "*** Deploy OK ***";
    }

    @GetMapping("/get")
    public @ResponseBody String get() {
        return "*** Привет Андрейка!!! Не открывай непонятные ссылки !!! А если от меня пришла не понятная ссылка, то лучше уточни у меня что за ссылка !!! метод get";
    }

    @GetMapping("/set")
    public @ResponseBody String set() {
        return "*** Привет Андрейка!!! Не открывай непонятные ссылки !!! А если от меня пришла не понятная ссылка, то лучше уточни у меня что за ссылка !!! метод set";
    }
}

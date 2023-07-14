package ru.patyukov.cicdtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/andreika")
public class ControllerTest {

    @GetMapping("/get")
    public @ResponseBody String test() {
        try {
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        };
        return "*** Привет Андрейка!!! Не открывай непонятные ссылки !!! А если от меня пришла не понятная ссылка, то лучше уточни у меня что за ссылка !!! метод get";
    }

    @GetMapping("/set")
    public @ResponseBody String home() {
        return "*** Привет Андрейка!!! Не открывай непонятные ссылки !!! А если от меня пришла не понятная ссылка, то лучше уточни у меня что за ссылка !!! метод set";
    }
}

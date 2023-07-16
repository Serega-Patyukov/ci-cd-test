package ru.patyukov.cicdtest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/test")
public class ControllerTest {

    @GetMapping("/status")
    public @ResponseBody String status() {
        return "*** Deploy OK";
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

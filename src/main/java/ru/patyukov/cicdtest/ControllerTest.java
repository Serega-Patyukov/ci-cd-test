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
        return "Привет Андрейка!!! Не открывай непонятные ссылки !!! Метод get";
    }

    @GetMapping("/set")
    public @ResponseBody String home() {
        return "Привет Андрейка!!! Не открывай непонятные ссылки !!! Метод set";
    }
}

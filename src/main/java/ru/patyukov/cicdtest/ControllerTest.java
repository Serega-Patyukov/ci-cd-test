package ru.patyukov.cicdtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class ControllerTest {

    @GetMapping("/get")
    public @ResponseBody String test() {
        return "errors";
    }

    @GetMapping("/home")
    public @ResponseBody String home() {
        return "home 0";
    }
}

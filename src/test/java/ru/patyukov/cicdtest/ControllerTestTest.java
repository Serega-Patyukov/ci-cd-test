package ru.patyukov.cicdtest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class ControllerTestTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void test() throws Exception {
        this.mockMvc.perform(get("/andreika/get"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Привет Андрейка!!! Не открывай непонятные ссылки !!! А если от меня пришла не понятная ссылка, то лучше уточни у меня что за ссылка !!! метод get")));
    }
}
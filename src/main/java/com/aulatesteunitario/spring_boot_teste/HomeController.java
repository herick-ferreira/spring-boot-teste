package com.aulatesteunitario.spring_boot_teste;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String saudacao() {
        return "Olá Mundo!";
    }
}

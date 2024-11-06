package com.example.skyprohomeworkjavawebsite.start;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class StartPageController {
    @GetMapping
    public String startPage() {
        return """
                <p>Здарствуйте вы находитесь в калькуляторе, введите запрос localhost:8080calculator/ + </p>
                <p>plus?num1=число&num2=число Для сложения</p>
                <p>minus?num1=число&num2=число Для вычетания</p>
                <p>multiply?num1=число&num2=число Для умножения</p>
                <p>devide?num1=число&num2=число Для деления</p>""";
    }
}

package com.example.skyprohomeworkjavawebsite.controller;

import com.example.skyprohomeworkjavawebsite.service.CalculatorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/calculator")
public class CalculatorController {
    // Init Controller Service
    private final CalculatorService calculatorService;

    public CalculatorController(final CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    // Get requests
    @GetMapping(path = "/")
    public String description() {
        return """
                <p>Здарствуйте вы находитесь в калькуляторе, введите запрос localhost:8080calculator/ + </p>
                <p>plus?num1=число&num2=число Для сложения</p>
                <p>minus?num1=число&num2=число Для вычетания</p>
                <p>multiply?num1=число&num2=число Для умножения</p>
                <p>devide?num1=число&num2=число Для деления</p>""";
    }

    @GetMapping(path="/plus")
    public Integer plus(@RequestParam(value = "num1", required = false) Integer num1,
                       @RequestParam(value = "num2", required = false)  Integer num2) {
        return calculatorService.plus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public Integer minus(@RequestParam(value = "num1", required = false) Integer num1,
                        @RequestParam(value = "num2", required = false)  Integer num2) {
        return calculatorService.minus(num1, num2);
    }

    @GetMapping(path ="/multiply")
    public Integer multiply(@RequestParam(value = "num1", required = false) Integer num1,
                           @RequestParam(value = "num2", required = false) Integer num2) {
        return calculatorService.multiply(num1, num2);
    }

    @GetMapping(path = "/devide")
    public Integer devide(@RequestParam(value = "num1", required = false) Integer num1,
                         @RequestParam(value = "num2", required = false)  Integer num2) {
        return calculatorService.divide(num1, num2);
    }
}

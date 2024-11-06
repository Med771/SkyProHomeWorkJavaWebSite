package com.example.skyprohomeworkjavawebsite.calculator;

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
    public String plus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.plus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.minus(num1, num2);
    }

    @GetMapping(path ="/multiply")
    public String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.multiply(num1, num2);
    }

    @GetMapping(path = "/devide")
    public String devide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.divide(num1, num2);
    }
}

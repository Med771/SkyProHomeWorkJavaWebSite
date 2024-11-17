package com.example.skyprohomeworkjavawebsite.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String plus(int a, int b) {
        try {
            return String.valueOf(a + b);
        }
        catch (Exception e) {
            return "Error: " + e;
        }
    }

    public String minus(int a, int b) {
        try {
            return String.valueOf(a - b);
        }
        catch (Exception e) {
            return "Error: " + e;
        }
    }

    public String multiply(int a, int b) {
        try {
            return String.valueOf(a * b);
        }
        catch (Exception e) {
            return "Error: " + e;
        }
    }

    public String divide(int a, int b) {
        try {
            return String.valueOf(a / b);
        }
        catch (Exception e) {
            return "Error: " + e;
        }
    }
}

package com.example.skyprohomeworkjavawebsite.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public Integer plus(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new NullPointerException("a or b is null");
        }

        return a + b;
    }

    public Integer minus(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new NullPointerException("a or b is null");
        }

        return a - b;
    }

    public Integer multiply(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new NullPointerException("a or b is null");
        }

        return a * b;
    }

    public Integer divide(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new NullPointerException("a or b is null");
        }

        if (b == 0) {
            throw new IllegalArgumentException("Divide by zero");
        }

        return a / b;
    }
}

package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@Controller
public class CalculatorController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/add")
    public String add(@RequestParam double num1, @RequestParam long num2, Model model) {
        double result = num1 + num2;
        model.addAttribute("result", result);
        return "result";
    }

    @GetMapping("/subtract")
    public String subtract(@RequestParam double num1, @RequestParam double num2, Model model) {
        double result = num1 - num2;
        model.addAttribute("result", result);
        return "result";
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam double num1, @RequestParam double num2, Model model) {
        double result = num1 * num2;
        model.addAttribute("result", result);
        return "result";
    }

    @GetMapping("/divide")
    public String divide(@RequestParam double num1, @RequestParam double num2, Model model) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        double result = num1 / num2;
        model.addAttribute("result", result);
        return "result";
    }
}

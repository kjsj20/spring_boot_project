package com.jskim.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("/")
    public String hello(Model model) {
        model.addAttribute("data", "spring");
        return "hello";
    }

    @GetMapping("hello/json")
    @ResponseBody
    public Hello HelloworldJson() {
        Hello hello = new Hello();
        hello.message = "helloworld";
        hello.status = "성공";
        System.out.println("hello = " + hello);
        return hello;
    }

    private class Hello {
        private String message;
        private String status;

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }
}

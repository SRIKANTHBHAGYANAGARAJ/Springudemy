package com.web.srikanth.springweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index"; // This should resolve to WEB-INF/views/index.jsp
    }
}
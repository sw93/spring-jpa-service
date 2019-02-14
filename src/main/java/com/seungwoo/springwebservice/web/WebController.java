package com.seungwoo.springwebservice.web;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@AllArgsConstructor
public class WebController {

    @GetMapping("/")
    //@RequestMapping(value = "/", method = RequestMethod.GET)
    public String main() {
        return "main";
    }
}

package org.smilex.jsonicviewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class JsonParserController {
    @GetMapping
    public String index() {
        return "index";
    }

}

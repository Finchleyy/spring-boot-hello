package com.ypw.springboothello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemplateController {
    @RequestMapping(value = "/accounts/create", method = RequestMethod.POST)
    public String create(@RequestParam Long id,
                         @RequestParam String name,
                         @RequestParam Integer age,
                         @RequestParam String pwd) {
        return id + name + age + pwd;
    }

}

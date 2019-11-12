package com.test;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        CalendarQuickstart c = new CalendarQuickstart();
        try {
            c.get_events();    
        } catch (Exception e) {
            System.out.println("Exception: "+e.getMessage());
        }
        return "";
    }

}
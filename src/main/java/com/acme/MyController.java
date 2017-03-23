package com.acme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
    private BusinessLogic myBusinessLogic;

    @RequestMapping(value = "/dostuff")
    public MyThing getMyThing() {
        return myBusinessLogic.getMyThing();
    }
}

package com.acme;

import org.springframework.stereotype.Service;

@Service
public class BusinessLogic {
    public MyThing getMyThing() {
        return new MyThing(1, "Hello, World!");
    }
}

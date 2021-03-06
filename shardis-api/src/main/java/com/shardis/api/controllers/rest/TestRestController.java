package com.shardis.api.controllers.rest;


import com.shardis.dto.commons.ValueObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by Tomasz Kucharzyk
 */

@RestController
@RequestMapping("/")
public class TestRestController {

    @RequestMapping("/title")
    public ValueObject getTitle() {
        return new ValueObject("API SERVER IS ALIVE");
    }

    @RequestMapping("/user")
    public Principal user(Principal user) {
        return user;
    }

}

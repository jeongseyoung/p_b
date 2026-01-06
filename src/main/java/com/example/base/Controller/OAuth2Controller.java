package com.example.base.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class OAuth2Controller {
    
    @GetMapping("/oauth2/redirect")
    public String redirect() {
        return new String("음?");
    }
    

}

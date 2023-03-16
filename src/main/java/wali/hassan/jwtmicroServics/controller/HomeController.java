package wali.hassan.jwtmicroServics.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class HomeController {
    @GetMapping("/")
    public  String Home(Principal principal)
    {
        return "Hi"+ " "  +  principal.getName();
    }


}

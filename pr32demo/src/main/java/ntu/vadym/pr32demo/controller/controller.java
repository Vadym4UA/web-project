package ntu.vadym.pr32demo.controller; 


import ntu.vadym.pr32demo.service.MyService; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller { 

    @Autowired
    private MyService greetingService; 

    @GetMapping("/")
    public String hello() {
        return greetingService.getGreeting(); 
    }
}


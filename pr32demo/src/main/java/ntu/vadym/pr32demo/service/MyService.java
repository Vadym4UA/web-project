package ntu.vadym.pr32demo.service;

import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class MyService {

    public String getGreeting() {
        String name = "Вадим";
        String surname = "Павлюченко";  
        String currentTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        return String.format("Привіт, %s %s! Час відповіді: %s", surname, name, currentTime);
    }
}


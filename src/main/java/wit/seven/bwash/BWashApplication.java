package wit.seven.bwash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
public class BWashApplication {

    /*@PostConstruct
    public void init() {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
    }*/
    public static void main(String[] args) {
        SpringApplication.run(BWashApplication.class, args);
    }
}

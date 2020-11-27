import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home() {
        return "Spring Boot App Running compiled testing locally";
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Salam from java file");
        //SpringApplication.run(Example.class, args);
    }

}

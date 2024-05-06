erpackage com.techshard.graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        System.out.println("Starting Food Delivery Service- server side application");
        SpringApplication.run(Application.class, args);
    }
}

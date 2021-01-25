package technicalblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import technicalblog.controller.HomeController;

@SpringBootApplication
public class TechnicalBlogApplication {

    public static void main(String [] args){
        SpringApplication.run(TechnicalBlogApplication.class, args);
    }

}

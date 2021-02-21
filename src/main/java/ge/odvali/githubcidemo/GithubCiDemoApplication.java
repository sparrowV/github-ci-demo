package ge.odvali.githubcidemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCiDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GithubCiDemoApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }


}

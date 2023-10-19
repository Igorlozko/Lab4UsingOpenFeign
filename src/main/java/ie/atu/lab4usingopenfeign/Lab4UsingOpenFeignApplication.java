package ie.atu.lab4usingopenfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Lab4UsingOpenFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab4UsingOpenFeignApplication.class, args);
    }

}

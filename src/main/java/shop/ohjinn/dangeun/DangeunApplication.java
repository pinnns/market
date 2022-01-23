package shop.ohjinn.dangeun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class DangeunApplication {

    public static void main(String[] args) {
        SpringApplication.run(DangeunApplication.class, args);
    }

}

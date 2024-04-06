package lk.ijse.spring;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author : Kavithma Thushal
 * @project : SpringBoot-POS
 **/
@SpringBootApplication
public class WebAppInitializer {

    public static void main(String[] args) {
        SpringApplication.run(WebAppInitializer.class);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
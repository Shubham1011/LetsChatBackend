package com.shubham.letschatbackend;

import com.pusher.rest.Pusher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class LetschatbackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(LetschatbackendApplication.class, args);

    }

    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.shubham.letschatbackend")).build();
    }

    @Bean
    public Pusher pusher(){
        Pusher pusher = new Pusher("1136793", "f9079a0d6790d52fcce8", "2de101efb0c90558adca");
        pusher.setCluster("ap2");
        pusher.setEncrypted(true);

        return pusher;
    }


}

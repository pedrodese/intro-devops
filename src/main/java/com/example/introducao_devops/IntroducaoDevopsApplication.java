package com.example.introducao_devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class IntroducaoDevopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntroducaoDevopsApplication.class, args);
	}

    @GetMapping("hello/")
    public String helloWorld(){
        return "Hello World";
    }

}

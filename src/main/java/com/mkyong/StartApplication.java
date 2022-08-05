package com.mkyong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StartApplication {

    @GetMapping("/")
    @ResponseBody()
    public ResponseEntity<String> index(final Model model) {
      //  model.addAttribute("title", "Docker + Spring Boot");
       // model.addAttribute("msg", "Welcome to the docker container!");
        return ResponseEntity.ok("test");
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

}

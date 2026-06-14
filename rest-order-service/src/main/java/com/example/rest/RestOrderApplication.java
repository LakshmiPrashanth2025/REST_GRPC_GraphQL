package com.example.rest;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class RestOrderApplication {
 public static void main(String[] a){SpringApplication.run(RestOrderApplication.class,a);}
 @GetMapping("/orders/{id}") public String order(@PathVariable String id){
  return "REST Order Response: "+id;
 }
}

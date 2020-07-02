package com.ckbs.csp.sb.web;

import com.ckbs.csp.sb.web.dto.HelloResponseDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// JSON을 반환하는 컨트롤러...
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "index";
    }

    @GetMapping("/hello/dto2")
    public HelloResponseDto helloDto2(
            @RequestParam("name") String name,
            @RequestParam("amount") int amount){

        System.out.println("hello/dto : "+name+", "+ amount);

        return new HelloResponseDto(name, amount);
    }

    @GetMapping("/hello/dto")
    public String helloDto(
            @RequestParam("name") String name,
            @RequestParam("amount") int amount){

        System.out.println("hello/dto : "+name+", "+ amount);

        //return new HelloResponseDto(name, amount);
        HelloResponseDto helloDto = new HelloResponseDto(name, amount);
        String n = helloDto.getName();
        String a  = String.valueOf(helloDto.getAmount());
        String str = "test: "+n+a;

        return str;

    }



}

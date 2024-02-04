package com.example.rest.api.controller;

import com.example.rest.api.model.BookQueryParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api")
public class RestApiController {
    private String message;

    @GetMapping(path = "/hello")
    public String hello(){
        var html = "<html> <body> <h1> Hello Spring Boot </h1> </body> </html>";
        return html;
    }

    @GetMapping(path = "/echo/{message}/age/{age}/is-man/{isMan}")
    public String echo(
            @PathVariable(name = "message") String msg,
            @PathVariable("age") int age,
            @PathVariable("isMan") boolean isMan
    ){
        System.out.println("echo message : "+msg);
        System.out.println("echo age : "+age);
        System.out.println("echo isMan : "+isMan);

        // TODO 대문자로 변환해서 RETURN

        // String 타입의 변수 외에 다른 타입 받아오기

        // boolean, integer

        return msg.toUpperCase();
    }

    @GetMapping(path = "/book")
    public void queryParam(
            @RequestParam("category") String category,
            @RequestParam("issuedYear") String issuedYear,
            @RequestParam(name = "issued-month") String issuedMonth,
            @RequestParam(name = "issued_day") String issuedDay
    ){
        System.out.println(category);
        System.out.println(issuedYear);
        System.out.println(issuedMonth);
        System.out.println(issuedDay);
    }

    @GetMapping(path = "/book2")
    public void queryParamDto(
            BookQueryParam bookQueryParam
    ){
        System.out.println(bookQueryParam);
    }

    // TODO Parameter 2가지 받습니다. int 형태로 받아서 두 수 의 덧셈, 곱셈
    // TODO String 타입 boolean 타입도 받아보기

    @DeleteMapping(path = {
            "/user/{username}/delete",
            "/user/{username}/del"
        }
    )
    public void delete(
            @PathVariable("username") String userName
    ){
      log.info("user-name : {}", userName);
    }

}

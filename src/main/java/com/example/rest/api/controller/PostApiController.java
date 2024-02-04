package com.example.rest.api.controller;

import com.example.rest.api.model.BookRequest;
import com.example.rest.api.model.UserRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PostApiController {

    @PostMapping("/post")
    public String post(
            @RequestBody BookRequest bookRequest
    ){
     System.out.println(bookRequest);
     return bookRequest.toString();
    }

    /**
     * json 형태
     * {
     * "name" : "Spring Boot",
     * "number" : "100",
     * "category" : "JAVA"
     * }
     *
     * @return
     */

    @PostMapping("/user")
    public UserRequest User(
            @RequestBody
            UserRequest userRequest
    ){
        System.out.println(userRequest);

        return userRequest;
    }
}

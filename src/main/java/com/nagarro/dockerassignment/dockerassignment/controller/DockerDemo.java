package com.nagarro.dockerassignment.dockerassignment.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/docker")
public class DockerDemo {


    @GetMapping("/api")
    public ResponseEntity<String> getData() {

        String p="This is Docker assignment during bench training.";

        return new ResponseEntity<String>(p, HttpStatus.OK);
    }


}

package com.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CopilotControllerTest {

    @GetMapping
    public ResponseEntity<String> testCopilot() {

        return new ResponseEntity<>("copilot test is working.... ", HttpStatus.OK);
    }
    @GetMapping("/ec2")
    public ResponseEntity<String> deployec2() {
        return new ResponseEntity<>("Deployed Spring Boot Web app on EC2..",HttpStatus.OK);
    }
 
    @GetMapping("/pipeline")
    public ResponseEntity<String> deployec2CI_CD_pipeline() {

        return new ResponseEntity<>("Welcome to CI/CD pipeline deployment!Great Work",HttpStatus.OK);
    }

 } 

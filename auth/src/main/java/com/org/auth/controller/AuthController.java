package com.org.auth.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/auth")
public class AuthController {
    Logger logger = LoggerFactory.getLogger(AuthController.class);

    @PostMapping("/logon")
    @CrossOrigin
    public ResponseEntity<String> logon() {
        logger.info("---Entering logon---");
        return ResponseEntity.ok().body("Hello world，你好世界");
    }

    @GetMapping("/test")
    public String test() {
        logger.info("---entering test---");
        return "hello world, 你好世界";
    }
}

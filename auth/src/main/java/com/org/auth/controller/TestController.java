package com.org.auth.controller;

import com.org.auth.dao.UserDao;
import com.org.auth.service.UserService;
import com.org.auth.utils.Result;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.PathParam;
import java.util.Set;

@RestController
@RequestMapping(value = "/user")
public class TestController {
    private UserService userService;

    public TestController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/get")
    public ResponseEntity<Set<UserDao>> users(@PathVariable Integer id, HttpServletRequest request,
                                       HttpServletResponse response) {
        Set<UserDao> users = userService.getUsers();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<UserDao> user(@PathVariable Integer id, HttpServletRequest request,
                                       HttpServletResponse response) {
        UserDao user = userService.getUser(id);
        return ResponseEntity.ok(user);
    }

    @PutMapping("/add")
    public ResponseEntity<String> add(@RequestBody String jsonData, HttpServletRequest request,
                                      HttpServletResponse response) {
        return ResponseEntity.ok("");
    }

    @PostMapping("/update")
    public ResponseEntity<String> update(@RequestBody String jsonData, HttpServletRequest request,
                                         HttpServletResponse response) {
        return ResponseEntity.ok("");
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> delete(@RequestBody String jsonData, HttpServletRequest request,
                                         HttpServletResponse response) {
        return ResponseEntity.ok("");
    }
}

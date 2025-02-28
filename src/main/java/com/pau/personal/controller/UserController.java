//package com.pau.personal.controller;
//
//import com.pau.personal.model.dto.UserRegisterRequest;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.provisioning.UserDetailsManager;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/users")
//public class UserController {
//
//    @Autowired
//    private BCryptPasswordEncoder passwordEncoder;
//
//    @Autowired
//    private UserDetailsManager userDetailsManager;
//
//    @PostMapping("/register/")
//    public String register(@RequestBody UserRegisterRequest user) {
//        if (userDetailsManager.userExists(user.getUsername())) {
//            System.out.println(user.getUsername()+" "+user.getPassword());
//            return "ERROR: l'usuari ja existeix";
//        }
//
//        userDetailsManager.createUser(User.builder()
//                .username(user.getUsername())
//                .password(passwordEncoder.encode(user.getPassword()))
//                .roles("USER")
//                .build());
//
//        return "OK";
//    }
//}

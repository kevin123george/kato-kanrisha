package com.hatake.katokanrisha.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    @GetMapping("/test")
    public ResponseEntity testCart(){
        return ResponseEntity.ok("all looks goof");
    }

}

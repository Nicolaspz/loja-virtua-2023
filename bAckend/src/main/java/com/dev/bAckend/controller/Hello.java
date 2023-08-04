package com.dev.bAckend.controller;

import java.sql.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;

@RestController
@RequestMapping("/api")
public class Hello {
  @GetMapping("/")
  public String hello(){
    return "olla mundo Spring ";
  }
  
}

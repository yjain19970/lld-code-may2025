package com.scaler.bms2025.bmsmay2025.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

  @RequestMapping("/ping")
  public String ping() {
    return "pong";
  }
}

package com.avikdigidev.spring.microservice.controller;


import com.avikdigidev.spring.microservice.dto.request.PingRequest;
import com.avikdigidev.spring.microservice.dto.response.PingResponse;
import com.avikdigidev.spring.microservice.service.PingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PingController {


    @Autowired
    PingService pingService;

    @GetMapping("/ping/{input}")
    public String ping(@PathVariable(value = "input") String input) {
        return pingService.getPing(input);
    }

    @PostMapping("/ping/")
    public PingResponse addPing(@RequestBody PingRequest pingRequest) {
        System.out.println("inside controller");
        return pingService.getPingResponse(pingRequest);

    }


}

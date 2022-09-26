package com.avikdigidev.spring.microservice.service;

import com.avikdigidev.spring.microservice.dto.request.PingRequest;
import com.avikdigidev.spring.microservice.dto.response.PingResponse;
import org.springframework.stereotype.Component;

@Component
public class PingServiceImpl implements PingService{
    public String getPing(String input) {
        return "Hello " + input;
    }

    public PingResponse getPingResponse(PingRequest pingRequest) {
        System.out.println("inside service before setting response");
        PingResponse pingResponse = new PingResponse();
        pingResponse.setName(pingRequest.getName());
        pingResponse.setAge(pingRequest.getAge());
        pingResponse.setVoteAge(pingRequest.getAge() >= 18 ? "Eligible to vote" : "Ineligible to vote");
        System.out.println("inside service after setting response");
        return pingResponse;
    }
}

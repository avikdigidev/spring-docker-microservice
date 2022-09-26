package com.avikdigidev.spring.microservice.service;

import com.avikdigidev.spring.microservice.dto.request.PingRequest;
import com.avikdigidev.spring.microservice.dto.response.PingResponse;
import org.springframework.stereotype.Service;

@Service
public interface PingService {
    String getPing(String input);

    PingResponse getPingResponse(PingRequest pingRequest);
}

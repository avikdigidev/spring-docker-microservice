package com.avikdigidev.spring.microservice.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PingRequest implements Serializable {
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Age")
    private int age;
}

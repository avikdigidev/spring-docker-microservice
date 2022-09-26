package com.avikdigidev.spring.microservice.service;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * PingServiceImpl Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Sep 27, 2022</pre>
 */
public class PingServiceImplTest {

    @InjectMocks
    private PingServiceImpl pingService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this); // without this you will get NPE

    }

    /**
     * Method: getPing(String input)
     */
    @Test
    public void testGetPing() throws Exception {
        String name = "akash";
        String expectedOutput = "Hello akash";
        String ping = pingService.getPing(name);
        assertThat(expectedOutput).isEqualTo(ping);

    }

    /**
     * Method: getPingResponse(PingRequest pingRequest)
     */
    @Test
    public void testGetPingResponse() throws Exception {
//TODO: Test goes here... 
    }


} 

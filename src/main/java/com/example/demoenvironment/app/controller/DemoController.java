package com.example.demoenvironment.app.controller;

import com.example.demoenvironment.app.service.DockerEnvironmentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/demos")
@AllArgsConstructor
public class DemoController {
    private final DockerEnvironmentService dockerEnvironmentService;

    @GetMapping(value = "/hostIp")
    public String getHostIp() {
        return dockerEnvironmentService.getEnvHostIp();
    }
}

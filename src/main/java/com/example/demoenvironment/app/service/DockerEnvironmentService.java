package com.example.demoenvironment.app.service;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Getter
@Service
@Slf4j
public class DockerEnvironmentService {
//    @Value("${ENV_HOST_IP}")
    @Value("${env.host.ip}")
    private String envHostIp;

    static {
        log.info("env.host.ip");
    }
}

package com.dxp.springsession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 600, redisNamespace = "dxp")
public class SpringSessionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSessionApplication.class, args);
    }
}

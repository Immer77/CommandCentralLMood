package com.luminamood.commandcontrol;


import com.luminamood.frameworks.RedisService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommandControlApplication {
    private final RedisService redisService;

    public CommandControlApplication() {
        this.redisService = new RedisService("localhost", 6379);
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

}

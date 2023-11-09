package com.luminamood.commandcontrol;


import com.luminamood.domain.entities.Pattern;
import com.luminamood.frameworks.RedisService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class CommandControlApplication {
    private final RedisService redisService;

    public CommandControlApplication() {
        this.redisService = new RedisService("localhost", 6379);
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/bling")
    public String blingAnother(@RequestParam(value = "pattern", defaultValue = "calming") String patternId) {
        return redisService.getValue(patternId);
    }

    @PostMapping("/bling")
    public void bling(@RequestBody Pattern pattern) {
        redisService.setValue(pattern.getPatternId(), pattern.getPatternName());
    }

    public static void main(String[] args) {
        SpringApplication.run(CommandControlApplication.class, args);
    }

}

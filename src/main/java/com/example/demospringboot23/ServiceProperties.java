package com.example.demospringboot23;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding
@ConfigurationProperties(prefix = "service")
public class ServiceProperties {

    private String message;

    public ServiceProperties(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

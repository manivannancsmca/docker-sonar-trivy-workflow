package com.docker_sonar_trivy_workflow.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public String sayHello() {
        // Intentionally leaving an unused local variable so SonarQube flags a warning
        String unusedVariable = "I am a code smell"; 
        
        return "Hello, Code Analysis is Working!";
    }
}

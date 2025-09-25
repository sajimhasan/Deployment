package com.example.DeploymentProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class health {
    @GetMapping("/health")
    public String healthnotmain(){
        return " this is okay";
    }
}

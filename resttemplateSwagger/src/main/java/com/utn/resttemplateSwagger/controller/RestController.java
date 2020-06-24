package com.utn.resttemplateSwagger.controller;

import com.utn.resttemplateSwagger.model.User;
import com.utn.resttemplateSwagger.service.IntegrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/parcial")
public class RestController {

    @Autowired
    IntegrationService integrationService;

    @GetMapping("/")
    public User getUser() {
        return integrationService.getUser();
    }
}

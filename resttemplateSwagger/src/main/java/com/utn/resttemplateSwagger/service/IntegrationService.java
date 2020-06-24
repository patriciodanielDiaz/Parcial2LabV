package com.utn.resttemplateSwagger.service;

import com.utn.resttemplateSwagger.model.User;
import com.utn.resttemplateSwagger.service.integration.IntegrationComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IntegrationService {

    @Autowired
    IntegrationComponent integrationComponent;

    public User getUser() {
        return integrationComponent.getUserFromApi();
    }
}
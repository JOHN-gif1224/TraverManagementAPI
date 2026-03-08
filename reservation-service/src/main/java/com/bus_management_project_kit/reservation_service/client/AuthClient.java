package com.bus_management_project_kit.reservation_service.client;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AuthClient {

    private final RestTemplate restTemplate = new RestTemplate();

    public boolean utilisateurExiste(Long utilisateurId) {
        String url = "http://localhost:8081/api/utilisateurs/existe/" + utilisateurId;
        Boolean reponse = restTemplate.getForObject(url, Boolean.class);
        return Boolean.TRUE.equals(reponse);
    }
}
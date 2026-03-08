package com.bus_management_project_kit.notification_service.controller;

import com.bus_management_project_kit.notification_service.model.Notification;
import com.bus_management_project_kit.notification_service.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notifications")
@RequiredArgsConstructor
public class NotificationController {

    private final NotificationService notificationService;

    @PostMapping
    public Notification envoyer(@RequestBody Notification notification) {
        return notificationService.envoyerNotification(notification);
    }

    @GetMapping("/utilisateur/{utilisateurId}")
    public List<Notification> getHistorique(@PathVariable String utilisateurId) {
        return notificationService.recupererHistoriqueParUtilisateur(utilisateurId);
    }
}
package com.bus_management_project_kit.notification_service.service;

import com.bus_management_project_kit.notification_service.model.Notification;
import com.bus_management_project_kit.notification_service.repository.NotificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor // Génère le constructeur pour l'injection de dépendances [cite: 104]
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public Notification envoyerNotification(Notification notification) {
        // Logique simulée : ici on pourrait appeler une API de SMS ou d'Email
        notification.setStastatutNotification("ENVOYÉ");
        return notificationRepository.save(notification);
    }

    public List<Notification> recupererHistoriqueParUtilisateur(String utilisateurId) {
        // Logique pour voir les notifs d'un user spécifique
        return notificationRepository.findAll().stream()
                .filter(n -> n.getUtilisateurId().equals(utilisateurId))
                .toList();
    }
}
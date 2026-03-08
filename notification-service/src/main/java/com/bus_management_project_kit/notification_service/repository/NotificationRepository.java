package com.bus_management_project_kit.notification_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bus_management_project_kit.notification_service.model.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long>{

}

#!/bin/bash

# Démarre tous les microservices en parallèle

SERVICES=("auth-service" "notification-service" "paiement-service" "reservation-service")

for SERVICE in "${SERVICES[@]}"
do
    echo "Démarrage de $SERVICE..."
    (cd "$SERVICE" && mvn spring-boot:run) &
done

echo "Tous les microservices sont en cours d'exécution."
wait

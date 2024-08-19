# Hôtel

## Système de gestion de réservation de chambres d'hôtel

### Description

Développez une application pour gérer la réservation de chambres dans un hôtel. Les utilisateurs peuvent :
- Voir les chambres disponibles
- Réserver une chambre
- Annuler une réservation

### Classes principales

- **Chambre** : Représente une chambre avec des attributs comme le numéro de chambre, le type de chambre (simple, double, suite), et son statut (disponible ou réservée).
- **Reservation** : Gère les réservations avec des attributs comme la date de réservation, le nom du client, et la chambre réservée.
- **Hotel** : Gère la collection de chambres et de réservations.

### Fonctionnalités

- Afficher les chambres disponibles.
- Réserver une chambre.
- Annuler une réservation.
- Sauvegarder et charger les réservations et chambres dans un fichier.

### Technologies Java

- **Utilisation de classes** pour encapsuler les données (`Chambre`, `Reservation`, `Hotel`).
- **Utilisation de collections (`ArrayList`)** pour gérer les chambres et les réservations.
- **Lecture et écriture dans des fichiers** pour sauvegarder l'état de l'hôtel.

### Collaboration Git

- Un membre peut créer et gérer la classe `Chambre`, avec la gestion du statut de disponibilité.
- Un autre peut s'occuper de la classe `Reservation` et des opérations liées aux réservations.
- Le troisième membre peut gérer la classe `Hotel`, ainsi que l'interface utilisateur et la persistance des données.

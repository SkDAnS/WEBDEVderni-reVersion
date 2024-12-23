 -- Création de la base de données
CREATE DATABASE TicketManagement;
USE TicketManagement;

-- Table des utilisateurs
CREATE TABLE Utilisateur (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(100) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL,
    mot_de_passe VARCHAR(255) NOT NULL,
    derniere_connexion DATETIME,
    actif BOOLEAN DEFAULT TRUE,
    role ENUM('utilisateur', 'intervenant') NOT NULL
);

-- Table des postes informatiques
CREATE TABLE PosteInformatique (
    id INT AUTO_INCREMENT PRIMARY KEY,
    utilisateur_id INT,
    etat ENUM('en fonction', 'en maintenance', 'en commande') NOT NULL,
    configuration TEXT NOT NULL,
    FOREIGN KEY (utilisateur_id) REFERENCES Utilisateur(id)
);

-- Table des tickets
CREATE TABLE Ticket (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titre VARCHAR(255) NOT NULL,
    description TEXT NOT NULL,
    date_creation DATETIME DEFAULT CURRENT_TIMESTAMP,
    date_mise_a_jour DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    impact ENUM('Bloquant', 'Majeur', 'Mineur') NOT NULL,
    etat ENUM('Ouvert', 'En cours', 'Résolu', 'Fermé', 'Annulé') NOT NULL,
    utilisateur_createur_id INT NOT NULL,
    poste_id INT,
    type_demande VARCHAR(100) NOT NULL,
    FOREIGN KEY (utilisateur_createur_id) REFERENCES Utilisateur(id),
    FOREIGN KEY (poste_id) REFERENCES PosteInformatique(id)
);
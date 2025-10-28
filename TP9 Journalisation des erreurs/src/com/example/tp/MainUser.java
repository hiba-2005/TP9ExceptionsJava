package com.example.tp;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Programme de test : crée plusieurs User et enregistre les erreurs dans un fichier.
 */
public class MainUser {
    public static void main(String[] args) {
        User[] users = {
            new User("Alice", 30),
            new User("", 25),
            new User("Bob", 16)
        };

        for (User u : users) {
            try {
                u.validate();
                System.out.println("Utilisateur validé : " + u);
            } catch (InvalidUserException e) {
                // Écriture de l’erreur dans error.log au lieu de System.err
                try (FileWriter fw = new FileWriter("error.log", true)) {
                    fw.write("Erreur : " + e.getMessage() + System.lineSeparator());
                } catch (IOException io) {
                    System.err.println("Impossible d’écrire dans error.log : " + io.getMessage());
                }
            }
        }
        System.out.println("Validation terminée. Consultez error.log pour les erreurs.");
    }
}

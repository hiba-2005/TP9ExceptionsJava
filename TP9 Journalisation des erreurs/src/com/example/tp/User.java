package com.example.tp;

/**
 * Représente un utilisateur avec nom et âge, et se valide.
 */
public class User {
    private String nom;
    private int age;

    public User(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public void validate() throws InvalidUserException {
        if (nom == null || nom.trim().isEmpty()) {
            throw new InvalidUserException("Nom d'utilisateur invalide");
        }
        if (age < 18) {
            throw new InvalidUserException("Utilisateur mineur (âge=" + age + ")");
        }
    }

    @Override
    public String toString() {
        return String.format("User[nom=%s, age=%d]", nom, age);
    }
}

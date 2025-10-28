package com.example.tp;

/**
 * Exception levée lors de la validation d'un utilisateur invalide.
 */
public class InvalidUserException extends Exception {
    public InvalidUserException(String message) {
        super(message);
    }
}

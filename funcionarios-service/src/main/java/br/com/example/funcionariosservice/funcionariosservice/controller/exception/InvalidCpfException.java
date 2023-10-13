package br.com.example.funcionariosservice.funcionariosservice.controller.exception;

public class InvalidCpfException extends RuntimeException {

    public InvalidCpfException(String message) {
        super(message);
    }
}

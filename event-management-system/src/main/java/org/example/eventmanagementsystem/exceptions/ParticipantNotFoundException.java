package org.example.eventmanagementsystem.exceptions;

public class ParticipantNotFoundException extends RuntimeException{
    public ParticipantNotFoundException(String message){
        super(message);
    }
}

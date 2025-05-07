package Interfaces;

import AbstractClasses.Participant;

public interface Mediator {
    void registerParticipant(Participant participant);
    void sendMessage(String message, Participant sender);
}
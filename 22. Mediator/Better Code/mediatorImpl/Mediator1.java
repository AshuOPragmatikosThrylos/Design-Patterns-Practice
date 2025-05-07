package mediatorImpl;

import Interfaces.Mediator;
import AbstractClasses.Participant;

import java.util.ArrayList;
import java.util.List;

public class Mediator1 implements Mediator {
    private List<Participant> participants = new ArrayList<>();

    @Override
    public void registerParticipant(Participant participant) {
        participants.add(participant);
        participant.setMediator(this); // because participant must be aware of the mediator to send message through the latter
    }

    @Override
    public void sendMessage(String message, Participant sender) {
        for (Participant participant : participants) {
            if (participant != sender) {
                participant.receiveMessage(message);
            }
        }
    }
}
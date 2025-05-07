package componentImpl;

import AbstractClasses.Participant;

public class ParticipantA extends Participant {
    @Override
    public void sendMessage(String message) {
        System.out.println(mediator.getClass().getSimpleName()+" --> ParticipantA sends: " + message);
        mediator.sendMessage(message, this); // participant sending message through the mediator
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(mediator.getClass().getSimpleName()+" --> ParticipantA receives: " + message);
    }
}
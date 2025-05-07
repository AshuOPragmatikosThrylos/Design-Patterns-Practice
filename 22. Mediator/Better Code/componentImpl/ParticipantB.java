package componentImpl;

import AbstractClasses.Participant;

public class ParticipantB extends Participant {
    @Override
    public void sendMessage(String message) {
        System.out.println(mediator.getClass().getSimpleName()+" --> ParticipantB sends: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(mediator.getClass().getSimpleName()+" --> ParticipantB receives: " + message);
    }
}

package componentImpl;

import AbstractClasses.Participant;

public class ParticipantC extends Participant {
    @Override
    public void sendMessage(String message) {
        System.out.println(mediator.getClass().getSimpleName()+" --> ParticipantC sends: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(mediator.getClass().getSimpleName()+" --> ParticipantC receives: " + message);
    }
}

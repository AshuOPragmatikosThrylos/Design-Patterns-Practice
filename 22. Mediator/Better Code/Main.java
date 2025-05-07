import mediatorImpl.Mediator1;
import componentImpl.ParticipantA;
import componentImpl.ParticipantB;
import componentImpl.ParticipantC;
import AbstractClasses.Participant;
import Interfaces.Mediator;

public class Main {
    public static void main(String[] args) {
        Mediator mediator1 = new Mediator1();

        Participant participantA = new ParticipantA();
        Participant participantB = new ParticipantB();
        Participant participantC = new ParticipantC();

        // participants register themselves with that mediator through which they want to communicate
        mediator1.registerParticipant(participantA);
        mediator1.registerParticipant(participantB);
        mediator1.registerParticipant(participantC);

        // all participants registered with the same mediator (except the sender) receive the message
        participantA.sendMessage("Hello from A");
        participantB.sendMessage("Hello from B");
    }
}

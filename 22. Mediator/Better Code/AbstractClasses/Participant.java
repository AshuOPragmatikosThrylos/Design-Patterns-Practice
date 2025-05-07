package AbstractClasses;

import Interfaces.Mediator;

public abstract class Participant {
    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void sendMessage(String message);

    public abstract void receiveMessage(String message);
}

// Why use setMediator() instead of passing the mediator in the constructor ?

// 1) Decoupled Initialization: Participants can be instantiated without needing an immediate mediator, making them easier to reuse or test independently
// 2) Circular Dependencies: Avoids circular dependencies during object creation
//     - Participants Reference the Mediator: If a participant is created with a Mediator passed in its constructor, the Mediator must already exist
//     - Mediator References Participants: Mediators need references to participants, meaning participants must be created before the Mediator is fully initialized

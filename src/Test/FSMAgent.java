package Test;

import jade.core.Agent;
import jade.core.behaviours.Behaviour;

public class FSMAgent extends Agent {
    @Override
    protected void setup() {
        super.setup();
        this.addBehaviour(new MyMFSBehaviour(this));
    }

}


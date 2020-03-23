package Test;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

/**
 * @author MiaoJiaxin
 */
public class CommunicationAgent extends Agent {
    @Override
    protected void setup() {
        super.setup();
        Behaviour loop = new CyclicBehaviour() {
            @Override
            public void action() {
                ACLMessage msg = receive();
                if(msg != null){
                    System.out.println("received msg :" + msg.getContent());
                }
            }
        };
        this.addBehaviour(loop);

    }
}

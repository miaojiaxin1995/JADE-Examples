package Test;

import jade.core.AID;
import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;

/**
 * @program: JADE-Examples
 * @description:
 * @author: Miao Jiaxin
 * @create: 2020-03-23 10:38
 **/

public class SendBehaviour extends Behaviour {
    FirstAgent sendAgent = null;


    @Override
    public void action() {
        ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
        msg.addReceiver(new AID("miao", AID.ISLOCALNAME));
        msg.setLanguage("English");
        msg.setContent("hello miao!");
        sendAgent.send(msg);
    }

    @Override
    public boolean done() {
        return true;
    }

    public SendBehaviour(FirstAgent a) {
        sendAgent = a;
    }
}

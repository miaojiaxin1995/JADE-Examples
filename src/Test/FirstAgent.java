package Test;

import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import jade.core.behaviours.SequentialBehaviour;
import jade.core.behaviours.SimpleBehaviour;
import jade.core.behaviours.WakerBehaviour;

/**
 * @author MiaoJiaxin
 */
public class FirstAgent extends Agent {

    private OneShotBehaviour oneShotBehaviour = new MyOneShotBehaviour();
    private SequentialBehaviour sequentialBehaviour = new SequentialBehaviour();

    @Override
    protected void setup() {

        this.addBehaviour(new SendBehaviour(this));

/*
        System.out.println("Hello World !");
        addBehaviour(oneShotBehaviour);
        sequentialBehaviour.addSubBehaviour(new OneShotBehaviour() {
            @Override
            public void action() {
                System.out.println("First Behaviour...");
            }
        });
        sequentialBehaviour.addSubBehaviour(new WakerBehaviour(this,3000) {
            @Override
            protected void onWake() {
                System.out.println("3000ms later...");
                System.out.println("Second Behaviour...");
            }
        });
        sequentialBehaviour.addSubBehaviour(new SimpleBehaviour() {
            @Override
            public void action() {
                System.out.println("Third Behaviour...");
            }

            @Override
            public boolean done() {
                return true;
            }
        });
        addBehaviour(sequentialBehaviour);
        addBehaviour(new MyMFSBehaviour(this));
*/
    }

}

package Test;

import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.FSMBehaviour;
import jade.core.behaviours.OneShotBehaviour;


public class MyMFSBehaviour extends FSMBehaviour {
    public MyMFSBehaviour(Agent a) {
        super(a);
        this.registerFirstState(new OperationXBehaviour(), "X");
        this.registerLastState(new OperationYBehaviour(), "Y");
        this.registerState(new OperationZBehaviour(), "Z");
        registerTransition("X", "Y", 1);
        registerTransition("X", "Z", 0);
        registerDefaultTransition("Z", "X", new String[]{"X", "Z"});
        this.scheduleFirst();
    }

    class OperationXBehaviour extends OneShotBehaviour {
        private int numX;

        @Override
        public void action() {
            numX = (int) (Math.random() * 100 + 1);
            System.out.println("X:产生随机数" + numX);
        }

        @Override
        public int onEnd() {
            return (numX % 2 == 0 ? 0 : 1);
        }
    }

    class OperationYBehaviour extends OneShotBehaviour {
        @Override
        public void action() {
            System.out.println("Y:状态转换中止");
        }
    }

    class OperationZBehaviour extends OneShotBehaviour {
        @Override
        public void action() {
            System.out.println("Z:Z->X");
        }
    }

}

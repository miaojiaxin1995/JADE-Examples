package Test;

import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;
import jade.wrapper.StaleProxyException;

import java.util.ConcurrentModificationException;

/**
 * @program: JADE-Examples
 * @description: java application to start agents
 * @author: Miao Jiaxin
 * @create: 2019-12-27 11:51
 **/

public class Test {
    public static void main(String[] args) throws StaleProxyException {
        AgentController ac = startAgent("0.0.0.0","1099","M");
        ac.start();
    }

    public static AgentController startAgent(String host, String port, String name) {

        Runtime rt = Runtime.instance();

        Profile p = new ProfileImpl();
        p.setParameter(Profile.MAIN_HOST, host);
        p.setParameter(Profile.MAIN_PORT, port);
        ContainerController cc = rt.createAgentContainer(p);
        if(cc!=null) {
            try {
                AgentController ac = cc.createNewAgent(name,"Test.FirstAgent",null);
                ac.start();
                return ac;
            } catch (StaleProxyException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}



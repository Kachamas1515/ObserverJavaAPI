/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerjavaapi;

import java.util.Observer;

/**
 *
 * @author amam
 */
public class ObserverJavaAPI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Observer obj1 = new Senior();
        Observer obj2 = new Marketing();
        HeadQuater obj = new HeadQuater();
        obj.addObserver(obj1);
        obj.addObserver(obj2);
        obj.setSomeData(6);
        obj.setSomeData(7);
    }

}

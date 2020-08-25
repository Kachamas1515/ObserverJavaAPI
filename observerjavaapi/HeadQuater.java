/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerjavaapi;

import java.util.ArrayList;
import java.util.Observable;

/**
 *
 * @author amam
 */
public class HeadQuater extends Observable {

    private int someData;

    public void setSomeData(int aData) {
        someData = aData;
        setChanged();
        notifyObservers();
    }

    public int getSomeData() {
        return someData;
    }
}

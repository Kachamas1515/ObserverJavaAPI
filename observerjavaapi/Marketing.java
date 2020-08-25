/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerjavaapi;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author amam
 */
public class Marketing implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(
                "(marketing) headquater is updated to "
                + ((HeadQuater) o).getSomeData());
    }
}

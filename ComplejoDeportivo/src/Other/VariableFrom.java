/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Other;

import java.awt.Frame;

/**
 *
 * @author DAVID
 */
public class VariableFrom {

    private Object clase = null;

    /**
     * @return the clase
     */
    public Object getClase() {
        return clase;
    }

    /**
     * @param clase the clase to set
     */
    public void setClase(Object clase) {
        this.clase = clase;
    }

    public void setClase(Frame d) {

        d.setVisible(true);

    }

}

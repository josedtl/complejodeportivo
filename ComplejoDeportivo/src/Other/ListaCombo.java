/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Other;

/**
 *
 * @author DAVID
 */
public class ListaCombo {

    private Enum d = null;
    private String Value = "";

    /**
     * @return the d
     */
    
       public ListaCombo() {

    }
    public ListaCombo(Enum d, String Value) {
        this.d = d;
        this.Value = Value;
    }

    public Enum getD() {
        return d;
    }

    /**
     * @param d the d to set
     */
    public void setD(Enum d) {
        this.d = d;
    }

    /**
     * @return the Value
     */
    public String getValue() {
        return Value;
    }

    /**
     * @param Value the Value to set
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public String toString() {
        return Value;
    }
}

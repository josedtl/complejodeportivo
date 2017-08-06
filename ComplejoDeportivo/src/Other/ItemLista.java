/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Other;

import java.util.*;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author DAVID
 */
public class ItemLista {

    DefaultComboBoxModel value = new DefaultComboBoxModel();

    ArrayList<DefaultComboBoxModel> ListaCbo = new ArrayList<DefaultComboBoxModel>();

    public DefaultComboBoxModel listafiltro() {

        value.addElement(new ListaCombo(Enumerado.f.Seleccionar, "Seleccionar"));
        value.addElement(new ListaCombo(Enumerado.f.Todo, "Todo"));
        value.addElement(new ListaCombo(Enumerado.f.PorNombre, "PorNombre"));
        value.addElement(new ListaCombo(Enumerado.f.Primero10, "Primero 10"));
        value.addElement(new ListaCombo(Enumerado.f.Primero50, "Primero 50"));
        value.addElement(new ListaCombo(Enumerado.f.Primero100, "Primero 100"));
        return value;
    }

}

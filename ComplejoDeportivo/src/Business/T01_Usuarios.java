/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import DataLayer.T01_UsuariosBD;
import Entity.T01_UsuariosEntity;
import java.util.ArrayList;

/**
 *
 * @author DAVID
 */
public class T01_Usuarios {

    T01_UsuariosBD BD = new T01_UsuariosBD();

    private void Validation(T01_UsuariosEntity entity) throws Exception {

//        if (entity.getContraseña() == null) {
//            throw new Exception("Valor Null Contraseña");
//        }
//
//        if (entity.getIdUsuario() == null) {
//            throw new Exception("Valor Null IdUsuario");
//        }
//        if (entity.getUsuario() == null) {
//            throw new Exception("Valor Null Usuario");
//        }
    }

    public Boolean Save(T01_UsuariosEntity entity) {

        try {
            Validation(entity);
        } catch (Exception e) {
            throw new UnsupportedOperationException(e.getMessage());
        }
        return BD.Save(entity);
    }

    public ArrayList<T01_UsuariosEntity> Get_C_Usuarios() {

        return BD.Get_T01_Usuarios();
    }

    public Boolean Delete(Integer entity) {

        return BD.Delete(entity);
    }

}

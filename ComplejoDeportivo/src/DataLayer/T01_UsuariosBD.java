package DataLayer;

import Entity.T01_UsuariosEntity;
import Framework.injector;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author DAVID
 */
public class T01_UsuariosBD {

    injector Inj = new injector();

    public Boolean Save(T01_UsuariosEntity entity) {
        Boolean State = null;
        try {

            if (entity.getUsuarioId() == 0) {
                Inj.Sp("sp_T01_Usuarios_Insert");
                Inj.Pmt_Integer("UsuarioId", entity.getUsuarioId(), true);
            } else {
                Inj.Sp("sp_T01_Usuarios_Update");
                Inj.Pmt_Integer("UsuarioId", entity.getUsuarioId(), false);
            }
        
            Inj.Pmt_String("Nombres", entity.getNombres(), false);
            Inj.Pmt_String("ApellidoPaterno", entity.getApellidoPaterno(), false);
            Inj.Pmt_String("ApellidoMaterno", entity.getApellidoMaterno(), false);
            Inj.Pmt_String("NroDocumento", entity.getNroDocumento(), false);
            Inj.Pmt_String("Telefono", entity.getTelefono(), false);
            Inj.Pmt_String("Correo", entity.getCorreo(), false);
            Inj.Pmt_Integer("TipoCargoId", entity.getTipoCargoId(), false);
            Inj.Pmt_String("FechaNacimiento", entity.getFechaNacimiento(), false);
            Inj.Pmt_String("Usuario", entity.getUsuario(), false);
            Inj.Pmt_String("Clave", entity.getClave(), false);
            Inj.Pmt_String("UsuarioRegistro", entity.getUsuarioRegistro(), false);
            Inj.Pmt_String("FechaRegistro", entity.getFechaRegistro(), false);
            Inj.Pmt_Boolean("Estado", entity.getEstado(), false);

            State = Inj.RunInsert() > 0;

        } catch (Exception ex) {
            throw new UnsupportedOperationException("Datalater :" + ex);
        }
        return State;
    }

    public ArrayList<T01_UsuariosEntity> Get_T01_Usuarios() {

        ArrayList<T01_UsuariosEntity> DatoMemoria = new ArrayList<>();
        T01_UsuariosEntity en;
        try {

            Inj.Sp("sp_T01_Usuarios_Select");
            ResultSet rs = Inj.RunSelect();
            while (rs.next()) {

                en = new T01_UsuariosEntity();
                en.setUsuarioId(rs.getInt("UsuarioId"));
                en.setNombres(rs.getString("Nombres"));
                en.setApellidoPaterno(rs.getString("ApellidoPaterno"));
                en.setApellidoMaterno(rs.getString("ApellidoMaterno"));
                en.setNroDocumento(rs.getString("NroDocumento"));
                en.setTelefono(rs.getString("Telefono"));
                en.setCorreo(rs.getString("Correo"));
                en.setTipoCargoId(rs.getInt("TipoCargoId"));
                en.setFechaNacimiento(rs.getString("FechaNacimiento"));
                en.setUsuario(rs.getString("Usuario"));
                en.setClave(rs.getString("Clave"));
                en.setUsuarioRegistro(rs.getString("UsuarioRegistro"));
                en.setFechaRegistro(rs.getString("FechaRegistro"));
                en.setEstado(rs.getBoolean("Estado"));
                DatoMemoria.add(en);

            }

        } catch (SQLException e) {
            throw new UnsupportedOperationException("Datalater :" + e);
        }
        return DatoMemoria;
    }

    public ArrayList<T01_UsuariosEntity> Get_T01_Usuario(int UsuarioId) {

        ArrayList<T01_UsuariosEntity> DatoMemoria = new ArrayList<>();
        T01_UsuariosEntity en;

        try {

            Inj.Sp("sp_T01_Usuarios_Select_PK");

            Inj.Pmt_Integer("UsuarioId", UsuarioId, false);
            ResultSet rs = Inj.RunSelect();
            while (rs.next()) {

                en = new T01_UsuariosEntity();
                en.setUsuarioId(rs.getInt("UsuarioId"));
                en.setNombres(rs.getString("Nombres"));
                en.setApellidoPaterno(rs.getString("ApellidoPaterno"));
                en.setApellidoMaterno(rs.getString("ApellidoMaterno"));
                en.setNroDocumento(rs.getString("NroDocumento"));
                en.setTelefono(rs.getString("Telefono"));
                en.setCorreo(rs.getString("Correo"));
                en.setTipoCargoId(rs.getInt("TipoCargoId"));
                en.setFechaNacimiento(rs.getString("FechaNacimiento"));
                en.setUsuario(rs.getString("Usuario"));
                en.setClave(rs.getString("Clave"));
                en.setUsuarioRegistro(rs.getString("UsuarioRegistro"));
                en.setFechaRegistro(rs.getString("FechaRegistro"));
                en.setEstado(rs.getBoolean("Estado"));
                DatoMemoria.add(en);

            }

        } catch (SQLException e) {
            throw new UnsupportedOperationException("Datalater :" + e);
        }
        return DatoMemoria;
    }

    public ArrayList<T01_UsuariosEntity> Get_T01_Usuarios_Nombres(String Nombres) {

        ArrayList<T01_UsuariosEntity> DatoMemoria = new ArrayList<>();
        T01_UsuariosEntity en;
        try {

            Inj.Sp("sp_T01_Usuarios_Select_Nombres");

            Inj.Pmt_String("Nombres", Nombres, false);
            ResultSet rs = Inj.RunSelect();
            while (rs.next()) {

                en = new T01_UsuariosEntity();
                en.setUsuarioId(rs.getInt("UsuarioId"));
                en.setNombres(rs.getString("Nombres"));
                en.setApellidoPaterno(rs.getString("ApellidoPaterno"));
                en.setApellidoMaterno(rs.getString("ApellidoMaterno"));
                en.setNroDocumento(rs.getString("NroDocumento"));
                en.setTelefono(rs.getString("Telefono"));
                en.setCorreo(rs.getString("Correo"));
                en.setTipoCargoId(rs.getInt("TipoCargoId"));
                en.setFechaNacimiento(rs.getString("FechaNacimiento"));
                en.setUsuario(rs.getString("Usuario"));
                en.setClave(rs.getString("Clave"));
                en.setUsuarioRegistro(rs.getString("UsuarioRegistro"));
                en.setFechaRegistro(rs.getString("FechaRegistro"));
                en.setEstado(rs.getBoolean("Estado"));
                DatoMemoria.add(en);

            }

        } catch (SQLException e) {
            throw new UnsupportedOperationException("Datalater :" + e);
        }
        return DatoMemoria;
    }

    public Boolean Delete(Integer entity) {
        Boolean State = null;
        Inj.Sp("sp_T01_Usuarios_Delete");
        Inj.Pmt_Integer("UsuarioId", entity, false);
        State = Inj.RunDelete() > 0;
        return State;

    }

}

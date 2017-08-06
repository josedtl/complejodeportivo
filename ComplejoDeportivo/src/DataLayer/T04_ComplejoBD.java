

	package DataLayer;	
	import Entity.T04_ComplejoEntity;	
	import Framework.injector;	
	import java.sql.ResultSet;	
	import java.sql.SQLException;	
	import java.util.ArrayList;	
		
	/**	
	 *	
	 * @author DAVID	
	 */	
	public class T04_ComplejoBD {	
		
	    injector Inj = new injector();	
		
	    public Boolean Save(T04_ComplejoEntity entity) {	
	        Boolean State = null;	
	        try {	
		
	            if (entity.getComplejoId() == 0) {	
	                Inj.Sp("sp_T04_Complejo_Insert");	
	                Inj.Pmt_Integer("ComplejoId", entity.getComplejoId(), true);	
	            } else {	
	                Inj.Sp("sp_T04_Complejo_Update");	
	                Inj.Pmt_Integer("ComplejoId", entity.getComplejoId(), false);	
	            }	
		
	            Inj.Pmt_Integer("DistritoId", entity.getDistritoId(), false);	
	            Inj.Pmt_String("NombreComplejo", entity.getNombreComplejo(), false);	
	            Inj.Pmt_String("Direccion", entity.getDireccion(), false);	
	            Inj.Pmt_String("TelefonoFijo", entity.getTelefonoFijo(), false);	
	            Inj.Pmt_String("UsuarioRegistro", entity.getUsuarioRegistro(), false);	
	            Inj.Pmt_String("FechaRegistro", entity.getFechaRegistro(), false);	
	            Inj.Pmt_Boolean("Estado", entity.getEstado(), false);	
		
	            State = Inj.RunInsert() > 0;	
		
	        } catch (Exception ex) {	
	            throw new UnsupportedOperationException("Datalater :" + ex);	
	        }	
	        return State;	
	    }	
		
	    public ArrayList<T04_ComplejoEntity> Get_T04_Complejos() {	
		
	        ArrayList<T04_ComplejoEntity> DatoMemoria = new ArrayList<>();	
	        T04_ComplejoEntity en;	
	        try {	
		
	            Inj.Sp("sp_T04_Complejo_Select");	
	            ResultSet rs = Inj.RunSelect();	
	            while (rs.next()) {	
		
	                en = new T04_ComplejoEntity();	
	                en.setComplejoId(rs.getInt("ComplejoId"));	
	                en.setDistritoId(rs.getInt("DistritoId"));	
	                en.setNombreComplejo(rs.getString("NombreComplejo"));	
	                en.setDireccion(rs.getString("Direccion"));	
	                en.setTelefonoFijo(rs.getString("TelefonoFijo"));	
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
		
	    public ArrayList<T04_ComplejoEntity> Get_T04_Complejo(int ComplejoId) {	
		
	        ArrayList<T04_ComplejoEntity> DatoMemoria = new ArrayList<>();	
	        T04_ComplejoEntity en;	
	        	
	        try {	
		
	            Inj.Sp("sp_T04_Complejo_Select_PK");	
		
	            Inj.Pmt_Integer("ComplejoId", ComplejoId, false);	
	            ResultSet rs = Inj.RunSelect();	
	            while (rs.next()) {	
		
	                en = new T04_ComplejoEntity();	
	                en.setComplejoId(rs.getInt("ComplejoId"));	
	                en.setDistritoId(rs.getInt("DistritoId"));	
	                en.setNombreComplejo(rs.getString("NombreComplejo"));	
	                en.setDireccion(rs.getString("Direccion"));	
	                en.setTelefonoFijo(rs.getString("TelefonoFijo"));	
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
		
	     public ArrayList<T04_ComplejoEntity> Get_T04_Complejo_DistritoId(String DistritoId) {	
		
	        ArrayList<T04_ComplejoEntity> DatoMemoria = new ArrayList<>();	
	        T04_ComplejoEntity en;	
	        try {	
		
	            Inj.Sp("sp_T04_Complejo_Select_DistritoId");	
		
	            Inj.Pmt_String("DistritoId", DistritoId, false);	
	            ResultSet rs = Inj.RunSelect();	
	            while (rs.next()) {	
		
	                en = new T04_ComplejoEntity();	
	                en.setComplejoId(rs.getInt("ComplejoId"));	
	                en.setDistritoId(rs.getInt("DistritoId"));	
	                en.setNombreComplejo(rs.getString("NombreComplejo"));	
	                en.setDireccion(rs.getString("Direccion"));	
	                en.setTelefonoFijo(rs.getString("TelefonoFijo"));	
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
	        Inj.Sp("sp_T04_Complejo_Delete");	
	        Inj.Pmt_Integer("ComplejoId", entity, false);	
	        State = Inj.RunDelete() > 0;	
	        return State;	
		
	    }	
		
	}	

package DataLayer;	
	import Entity.T06_ComplejoDetalleUsuarioEntity;	
	import Framework.injector;	
	import java.sql.ResultSet;	
	import java.sql.SQLException;	
	import java.util.ArrayList;	
		
	/**	
	 *	
	 * @author DAVID	
	 */	
	public class T06_ComplejoDetalleUsuarioBD {	
		
	    injector Inj = new injector();	
		
	    public Boolean Save(T06_ComplejoDetalleUsuarioEntity entity) {	
	        Boolean State = null;	
	        try {	
		
	            if (entity.getComplejoDetalleUsuarioId() == 0) {	
	                Inj.Sp("sp_T06_ComplejoDetalleUsuario_Insert");	
	                Inj.Pmt_Integer("ComplejoDetalleUsuarioId", entity.getComplejoDetalleUsuarioId(), true);	
	            } else {	
	                Inj.Sp("sp_T06_ComplejoDetalleUsuario_Update");	
	                Inj.Pmt_Integer("ComplejoDetalleUsuarioId", entity.getComplejoDetalleUsuarioId(), false);	
	            }	
	         
	            Inj.Pmt_Integer("ComplejoId", entity.getComplejoId(), false);	
	            Inj.Pmt_Integer("UsuarioId", entity.getUsuarioId(), false);	
	            Inj.Pmt_String("UsuarioRegistro", entity.getUsuarioRegistro(), false);	
	            Inj.Pmt_String("FechaRegistro", entity.getFechaRegistro(), false);	
	            Inj.Pmt_Boolean("Estado", entity.getEstado(), false);	
		
	            State = Inj.RunInsert() > 0;	
		
	        } catch (Exception ex) {	
	            throw new UnsupportedOperationException("Datalater :" + ex);	
	        }	
	        return State;	
	    }	
		
	    public ArrayList<T06_ComplejoDetalleUsuarioEntity> Get_T06_ComplejoDetalleUsuarios() {	
		
	        ArrayList<T06_ComplejoDetalleUsuarioEntity> DatoMemoria = new ArrayList<>();	
	        T06_ComplejoDetalleUsuarioEntity en;	
	        try {	
		
	            Inj.Sp("sp_T06_ComplejoDetalleUsuario_Select");	
	            ResultSet rs = Inj.RunSelect();	
	            while (rs.next()) {	
		
	                en = new T06_ComplejoDetalleUsuarioEntity();	
	                en.setComplejoDetalleUsuarioId(rs.getInt("ComplejoDetalleUsuarioId"));	
	                en.setComplejoId(rs.getInt("ComplejoId"));	
	                en.setUsuarioId(rs.getInt("UsuarioId"));	
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
		
	    public ArrayList<T06_ComplejoDetalleUsuarioEntity> Get_T06_ComplejoDetalleUsuario(int ComplejoDetalleUsuarioId) {	
		
	        ArrayList<T06_ComplejoDetalleUsuarioEntity> DatoMemoria = new ArrayList<>();	
	        T06_ComplejoDetalleUsuarioEntity en;	
	        	
	        try {	
		
	            Inj.Sp("sp_T06_ComplejoDetalleUsuario_Select_PK");	
		
	            Inj.Pmt_Integer("ComplejoDetalleUsuarioId", ComplejoDetalleUsuarioId, false);	
	            ResultSet rs = Inj.RunSelect();	
	            while (rs.next()) {	
		
	                en = new T06_ComplejoDetalleUsuarioEntity();	
	                en.setComplejoDetalleUsuarioId(rs.getInt("ComplejoDetalleUsuarioId"));	
	                en.setComplejoId(rs.getInt("ComplejoId"));	
	                en.setUsuarioId(rs.getInt("UsuarioId"));	
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
		
	     public ArrayList<T06_ComplejoDetalleUsuarioEntity> Get_T06_ComplejoDetalleUsuario_ComplejoId(String ComplejoId) {	
		
	        ArrayList<T06_ComplejoDetalleUsuarioEntity> DatoMemoria = new ArrayList<>();	
	        T06_ComplejoDetalleUsuarioEntity en;	
	        try {	
		
	            Inj.Sp("sp_T06_ComplejoDetalleUsuario_Select_ComplejoId");	
		
	            Inj.Pmt_String("ComplejoId", ComplejoId, false);	
	            ResultSet rs = Inj.RunSelect();	
	            while (rs.next()) {	
		
	                en = new T06_ComplejoDetalleUsuarioEntity();	
	                en.setComplejoDetalleUsuarioId(rs.getInt("ComplejoDetalleUsuarioId"));	
	                en.setComplejoId(rs.getInt("ComplejoId"));	
	                en.setUsuarioId(rs.getInt("UsuarioId"));	
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
	        Inj.Sp("sp_T06_ComplejoDetalleUsuario_Delete");	
	        Inj.Pmt_Integer("ComplejoDetalleUsuarioId", entity, false);	
	        State = Inj.RunDelete() > 0;	
	        return State;	
		
	    }	
		
	}	

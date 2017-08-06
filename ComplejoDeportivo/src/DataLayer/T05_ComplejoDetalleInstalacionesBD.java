
	package DataLayer;	
	import Entity.T05_ComplejoDetalleInstalacionesEntity;	
	import Framework.injector;	
	import java.sql.ResultSet;	
	import java.sql.SQLException;	
	import java.util.ArrayList;	
		
	/**	
	 *	
	 * @author DAVID	
	 */	
	public class T05_ComplejoDetalleInstalacionesBD {	
		
	    injector Inj = new injector();	
		
	    public Boolean Save(T05_ComplejoDetalleInstalacionesEntity entity) {	
	        Boolean State = null;	
	        try {	
		
	            if (entity.getComplejoDetalleInstalacionesId() == 0) {	
	                Inj.Sp("sp_T05_ComplejoDetalleInstalaciones_Insert");	
	                Inj.Pmt_Integer("ComplejoDetalleInstalacionesId", entity.getComplejoDetalleInstalacionesId(), true);	
	            } else {	
	                Inj.Sp("sp_T05_ComplejoDetalleInstalaciones_Update");	
	                Inj.Pmt_Integer("ComplejoDetalleInstalacionesId", entity.getComplejoDetalleInstalacionesId(), false);	
	            }	
	            Inj.Pmt_Integer("ComplejoId", entity.getComplejoId(), false);	
	            Inj.Pmt_String("Descripcion", entity.getDescripcion(), false);	
	            Inj.Pmt_String("UsuarioRegistro", entity.getUsuarioRegistro(), false);	
	            Inj.Pmt_String("FechaRegistro", entity.getFechaRegistro(), false);	
	            Inj.Pmt_Boolean("Estado", entity.getEstado(), false);	
		
	            State = Inj.RunInsert() > 0;	
		
	        } catch (Exception ex) {	
	            throw new UnsupportedOperationException("Datalater :" + ex);	
	        }	
	        return State;	
	    }	
		
	    public ArrayList<T05_ComplejoDetalleInstalacionesEntity> Get_T05_ComplejoDetalleInstalacioness() {	
		
	        ArrayList<T05_ComplejoDetalleInstalacionesEntity> DatoMemoria = new ArrayList<>();	
	        T05_ComplejoDetalleInstalacionesEntity en;	
	        try {	
		
	            Inj.Sp("sp_T05_ComplejoDetalleInstalaciones_Select");	
	            ResultSet rs = Inj.RunSelect();	
	            while (rs.next()) {	
		
	                en = new T05_ComplejoDetalleInstalacionesEntity();	
	                en.setComplejoDetalleInstalacionesId(rs.getInt("ComplejoDetalleInstalacionesId"));	
	                en.setComplejoId(rs.getInt("ComplejoId"));	
	                en.setDescripcion(rs.getString("Descripcion"));	
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
		
	    public ArrayList<T05_ComplejoDetalleInstalacionesEntity> Get_T05_ComplejoDetalleInstalaciones(int ComplejoDetalleInstalacionesId) {	
		
	        ArrayList<T05_ComplejoDetalleInstalacionesEntity> DatoMemoria = new ArrayList<>();	
	        T05_ComplejoDetalleInstalacionesEntity en;	
	        	
	        try {	
		
	            Inj.Sp("sp_T05_ComplejoDetalleInstalaciones_Select_PK");	
		
	            Inj.Pmt_Integer("ComplejoDetalleInstalacionesId", ComplejoDetalleInstalacionesId, false);	
	            ResultSet rs = Inj.RunSelect();	
	            while (rs.next()) {	
		
	                en = new T05_ComplejoDetalleInstalacionesEntity();	
	                en.setComplejoDetalleInstalacionesId(rs.getInt("ComplejoDetalleInstalacionesId"));	
	                en.setComplejoId(rs.getInt("ComplejoId"));	
	                en.setDescripcion(rs.getString("Descripcion"));	
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
		
	     public ArrayList<T05_ComplejoDetalleInstalacionesEntity> Get_T05_ComplejoDetalleInstalaciones_ComplejoId(String ComplejoId) {	
		
	        ArrayList<T05_ComplejoDetalleInstalacionesEntity> DatoMemoria = new ArrayList<>();	
	        T05_ComplejoDetalleInstalacionesEntity en;	
	        try {	
		
	            Inj.Sp("sp_T05_ComplejoDetalleInstalaciones_Select_ComplejoId");	
		
	            Inj.Pmt_String("ComplejoId", ComplejoId, false);	
	            ResultSet rs = Inj.RunSelect();	
	            while (rs.next()) {	
		
	                en = new T05_ComplejoDetalleInstalacionesEntity();	
	                en.setComplejoDetalleInstalacionesId(rs.getInt("ComplejoDetalleInstalacionesId"));	
	                en.setComplejoId(rs.getInt("ComplejoId"));	
	                en.setDescripcion(rs.getString("Descripcion"));	
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
	        Inj.Sp("sp_T05_ComplejoDetalleInstalaciones_Delete");	
	        Inj.Pmt_Integer("ComplejoDetalleInstalacionesId", entity, false);	
	        State = Inj.RunDelete() > 0;	
	        return State;	
		
	    }	
		
	}	

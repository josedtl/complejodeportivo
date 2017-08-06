

	package DataLayer;	
	import Entity.T02_TipoCargoEntity;	
	import Framework.injector;	
	import java.sql.ResultSet;	
	import java.sql.SQLException;	
	import java.util.ArrayList;	
		
	/**	
	 *	
	 * @author DAVID	
	 */	
	public class T02_TipoCargoBD {	
		
	    injector Inj = new injector();	
		
	    public Boolean Save(T02_TipoCargoEntity entity) {	
	        Boolean State = null;	
	        try {	
		
	            if (entity.getTipoCargoId() == 0) {	
	                Inj.Sp("sp_T02_TipoCargo_Insert");	
	                Inj.Pmt_Integer("TipoCargoId", entity.getTipoCargoId(), true);	
	            } else {	
	                Inj.Sp("sp_T02_TipoCargo_Update");	
	                Inj.Pmt_Integer("TipoCargoId", entity.getTipoCargoId(), false);	
	            }	
	            Inj.Pmt_String("NombreTipoCargo", entity.getNombreTipoCargo(), false);	
	            Inj.Pmt_String("UsuarioRegistro", entity.getUsuarioRegistro(), false);	
	            Inj.Pmt_String("FechaRegistro", entity.getFechaRegistro(), false);	
	            Inj.Pmt_Boolean("Estado", entity.getEstado(), false);	
		
	            State = Inj.RunInsert() > 0;	
		
	        } catch (Exception ex) {	
	            throw new UnsupportedOperationException("Datalater :" + ex);	
	        }	
	        return State;	
	    }	
		
	    public ArrayList<T02_TipoCargoEntity> Get_T02_TipoCargos() {	
		
	        ArrayList<T02_TipoCargoEntity> DatoMemoria = new ArrayList<>();	
	        T02_TipoCargoEntity en;	
	        try {	
		
	            Inj.Sp("sp_T02_TipoCargo_Select");	
	            ResultSet rs = Inj.RunSelect();	
	            while (rs.next()) {	
		
	                en = new T02_TipoCargoEntity();	
	                en.setTipoCargoId(rs.getInt("TipoCargoId"));	
	                en.setNombreTipoCargo(rs.getString("NombreTipoCargo"));	
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
		
	    public ArrayList<T02_TipoCargoEntity> Get_T02_TipoCargo(int TipoCargoId) {	
		
	        ArrayList<T02_TipoCargoEntity> DatoMemoria = new ArrayList<>();	
	        T02_TipoCargoEntity en;	
	        	
	        try {	
		
	            Inj.Sp("sp_T02_TipoCargo_Select_PK");	
		
	            Inj.Pmt_Integer("TipoCargoId", TipoCargoId, false);	
	            ResultSet rs = Inj.RunSelect();	
	            while (rs.next()) {	
		
	                en = new T02_TipoCargoEntity();	
	                en.setTipoCargoId(rs.getInt("TipoCargoId"));	
	                en.setNombreTipoCargo(rs.getString("NombreTipoCargo"));	
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
		
	     public ArrayList<T02_TipoCargoEntity> Get_T02_TipoCargo_NombreTipoCargo(String NombreTipoCargo) {	
		
	        ArrayList<T02_TipoCargoEntity> DatoMemoria = new ArrayList<>();	
	        T02_TipoCargoEntity en;	
	        try {	
		
	            Inj.Sp("sp_T02_TipoCargo_Select_NombreTipoCargo");	
		
	            Inj.Pmt_String("NombreTipoCargo", NombreTipoCargo, false);	
	            ResultSet rs = Inj.RunSelect();	
	            while (rs.next()) {	
		
	                en = new T02_TipoCargoEntity();	
	                en.setTipoCargoId(rs.getInt("TipoCargoId"));	
	                en.setNombreTipoCargo(rs.getString("NombreTipoCargo"));	
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
	        Inj.Sp("sp_T02_TipoCargo_Delete");	
	        Inj.Pmt_Integer("TipoCargoId", entity, false);	
	        State = Inj.RunDelete() > 0;	
	        return State;	
		
	    }	
		
	}	

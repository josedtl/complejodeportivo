package DataLayer;	
	import Entity.T03_DistritoEntity;	
	import Framework.injector;	
	import java.sql.ResultSet;	
	import java.sql.SQLException;	
	import java.util.ArrayList;	
		
	/**	
	 *	
	 * @author DAVID	
	 */	
	public class T03_DistritoBD {	
		
	    injector Inj = new injector();	
		
	    public Boolean Save(T03_DistritoEntity entity) {	
	        Boolean State = null;	
	        try {	
		
	            if (entity.getDistritoId() == 0) {	
	                Inj.Sp("sp_T03_Distrito_Insert");	
	                Inj.Pmt_Integer("DistritoId", entity.getDistritoId(), true);	
	            } else {	
	                Inj.Sp("sp_T03_Distrito_Update");	
	                Inj.Pmt_Integer("DistritoId", entity.getDistritoId(), false);	
	            }	
	         
	            Inj.Pmt_String("NombreDistrito", entity.getNombreDistrito(), false);	
	            Inj.Pmt_String("FechaRegistro", entity.getFechaRegistro(), false);	
	            Inj.Pmt_Boolean("Estado", entity.getEstado(), false);	
		
	            State = Inj.RunInsert() > 0;	
		
	        } catch (Exception ex) {	
	            throw new UnsupportedOperationException("Datalater :" + ex);	
	        }	
	        return State;	
	    }	
		
	    public ArrayList<T03_DistritoEntity> Get_T03_Distritos() {	
		
	        ArrayList<T03_DistritoEntity> DatoMemoria = new ArrayList<>();	
	        T03_DistritoEntity en;	
	        try {	
		
	            Inj.Sp("sp_T03_Distrito_Select");	
	            ResultSet rs = Inj.RunSelect();	
	            while (rs.next()) {	
		
	                en = new T03_DistritoEntity();	
	                en.setDistritoId(rs.getInt("DistritoId"));	
	                en.setNombreDistrito(rs.getString("NombreDistrito"));	
	                en.setFechaRegistro(rs.getString("FechaRegistro"));	
	                en.setEstado(rs.getBoolean("Estado"));	
	                DatoMemoria.add(en);	
		
	            }	
		
	        } catch (SQLException e) {	
	            throw new UnsupportedOperationException("Datalater :" + e);	
	        }	
	        return DatoMemoria;	
	    }	
		
	    public ArrayList<T03_DistritoEntity> Get_T03_Distrito(int DistritoId) {	
		
	        ArrayList<T03_DistritoEntity> DatoMemoria = new ArrayList<>();	
	        T03_DistritoEntity en;	
	        	
	        try {	
		
	            Inj.Sp("sp_T03_Distrito_Select_PK");	
		
	            Inj.Pmt_Integer("DistritoId", DistritoId, false);	
	            ResultSet rs = Inj.RunSelect();	
	            while (rs.next()) {	
		
	                en = new T03_DistritoEntity();	
	                en.setDistritoId(rs.getInt("DistritoId"));	
	                en.setNombreDistrito(rs.getString("NombreDistrito"));	
	                en.setFechaRegistro(rs.getString("FechaRegistro"));	
	                en.setEstado(rs.getBoolean("Estado"));	
	                DatoMemoria.add(en);	
		
	            }	
		
	        } catch (SQLException e) {	
	            throw new UnsupportedOperationException("Datalater :" + e);	
	        }	
	        return DatoMemoria;	
	    }	
		
	     public ArrayList<T03_DistritoEntity> Get_T03_Distrito_NombreDistrito(String NombreDistrito) {	
		
	        ArrayList<T03_DistritoEntity> DatoMemoria = new ArrayList<>();	
	        T03_DistritoEntity en;	
	        try {	
		
	            Inj.Sp("sp_T03_Distrito_Select_NombreDistrito");	
		
	            Inj.Pmt_String("NombreDistrito", NombreDistrito, false);	
	            ResultSet rs = Inj.RunSelect();	
	            while (rs.next()) {	
		
	                en = new T03_DistritoEntity();	
	                en.setDistritoId(rs.getInt("DistritoId"));	
	                en.setNombreDistrito(rs.getString("NombreDistrito"));	
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
	        Inj.Sp("sp_T03_Distrito_Delete");	
	        Inj.Pmt_Integer("DistritoId", entity, false);	
	        State = Inj.RunDelete() > 0;	
	        return State;	
		
	    }	
		
	}	

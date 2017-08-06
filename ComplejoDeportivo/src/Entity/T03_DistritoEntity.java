/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author DAVID
 */
public class T03_DistritoEntity {

    private Integer _DistritoId = 0;
    private String _NombreDistrito = "";
    private String _FechaRegistro = "";
    private Boolean _Estado = null;

    /**
     * @return the _DistritoId
     */
    public Integer getDistritoId() {
        return _DistritoId;
    }

    /**
     * @param _DistritoId the _DistritoId to set
     */
    public void setDistritoId(Integer _DistritoId) {
        this._DistritoId = _DistritoId;
    }

    /**
     * @return the _NombreDistrito
     */
    public String getNombreDistrito() {
        return _NombreDistrito;
    }

    /**
     * @param _NombreDistrito the _NombreDistrito to set
     */
    public void setNombreDistrito(String _NombreDistrito) {
        this._NombreDistrito = _NombreDistrito;
    }

    /**
     * @return the _FechaRegistro
     */
    public String getFechaRegistro() {
        return _FechaRegistro;
    }

    /**
     * @param _FechaRegistro the _FechaRegistro to set
     */
    public void setFechaRegistro(String _FechaRegistro) {
        this._FechaRegistro = _FechaRegistro;
    }

    /**
     * @return the _Estado
     */
    public Boolean getEstado() {
        return _Estado;
    }

    /**
     * @param _Estado the _Estado to set
     */
    public void setEstado(Boolean _Estado) {
        this._Estado = _Estado;
    }

}

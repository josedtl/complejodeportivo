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
public class T02_TipoCargoEntity {

    private Integer _TipoCargoId = 0;
    private String _NombreTipoCargo = "";
    private String _UsuarioRegistro = "";
    private String _FechaRegistro = "";
    private Boolean _Estado = null;

    /**
     * @return the _TipoCargoId
     */
    public Integer getTipoCargoId() {
        return _TipoCargoId;
    }

    /**
     * @param _TipoCargoId the _TipoCargoId to set
     */
    public void setTipoCargoId(Integer _TipoCargoId) {
        this._TipoCargoId = _TipoCargoId;
    }

    /**
     * @return the _NombreTipoCargo
     */
    public String getNombreTipoCargo() {
        return _NombreTipoCargo;
    }

    /**
     * @param _NombreTipoCargo the _NombreTipoCargo to set
     */
    public void setNombreTipoCargo(String _NombreTipoCargo) {
        this._NombreTipoCargo = _NombreTipoCargo;
    }

    /**
     * @return the _UsuarioRegistro
     */
    public String getUsuarioRegistro() {
        return _UsuarioRegistro;
    }

    /**
     * @param _UsuarioRegistro the _UsuarioRegistro to set
     */
    public void setUsuarioRegistro(String _UsuarioRegistro) {
        this._UsuarioRegistro = _UsuarioRegistro;
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

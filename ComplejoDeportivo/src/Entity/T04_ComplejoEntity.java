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
public class T04_ComplejoEntity {

    private Integer _ComplejoId = 0;
    private Integer _DistritoId = 0;
    private String _NombreComplejo = "";
    private String _Direccion = "";
    private String _TelefonoFijo = "";
    private String _UsuarioRegistro = "";
    private String _FechaRegistro = "";
    private Boolean _Estado = null;

    /**
     * @return the _ComplejoId
     */
    public Integer getComplejoId() {
        return _ComplejoId;
    }

    /**
     * @param _ComplejoId the _ComplejoId to set
     */
    public void setComplejoId(Integer _ComplejoId) {
        this._ComplejoId = _ComplejoId;
    }

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
     * @return the _NombreComplejo
     */
    public String getNombreComplejo() {
        return _NombreComplejo;
    }

    /**
     * @param _NombreComplejo the _NombreComplejo to set
     */
    public void setNombreComplejo(String _NombreComplejo) {
        this._NombreComplejo = _NombreComplejo;
    }

    /**
     * @return the _Direccion
     */
    public String getDireccion() {
        return _Direccion;
    }

    /**
     * @param _Direccion the _Direccion to set
     */
    public void setDireccion(String _Direccion) {
        this._Direccion = _Direccion;
    }

    /**
     * @return the _TelefonoFijo
     */
    public String getTelefonoFijo() {
        return _TelefonoFijo;
    }

    /**
     * @param _TelefonoFijo the _TelefonoFijo to set
     */
    public void setTelefonoFijo(String _TelefonoFijo) {
        this._TelefonoFijo = _TelefonoFijo;
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

}

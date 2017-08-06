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
public class T06_ComplejoDetalleUsuarioEntity {

    private Integer _ComplejoDetalleUsuarioId = 0;
    private Integer _ComplejoId = 0;
    private Integer _UsuarioId = 0;
    private String _UsuarioRegistro = "";
    private String _FechaRegistro = "";
    private Boolean _Estado = null;

    /**
     * @return the _ComplejoDetalleUsuarioId
     */
    public Integer getComplejoDetalleUsuarioId() {
        return _ComplejoDetalleUsuarioId;
    }

    /**
     * @param _ComplejoDetalleUsuarioId the _ComplejoDetalleUsuarioId to set
     */
    public void setComplejoDetalleUsuarioId(Integer _ComplejoDetalleUsuarioId) {
        this._ComplejoDetalleUsuarioId = _ComplejoDetalleUsuarioId;
    }

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
     * @return the _UsuarioId
     */
    public Integer getUsuarioId() {
        return _UsuarioId;
    }

    /**
     * @param _UsuarioId the _UsuarioId to set
     */
    public void setUsuarioId(Integer _UsuarioId) {
        this._UsuarioId = _UsuarioId;
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

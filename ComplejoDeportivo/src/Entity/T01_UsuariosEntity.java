package Entity;

import java.sql.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DAVID
 */
public class T01_UsuariosEntity {

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

    private Integer _UsuarioId = 0;
    private String _Nombres = "";
    private String _ApellidoPaterno = "";
    private String _ApellidoMaterno = "";
    private String _NroDocumento = "";
    private String _Telefono = "";
    private String _Correo = "";
    private Integer _TipoCargoId = 0;
    private String _FechaNacimiento = "";
    private String _Usuario = "";
    private String _Clave = "";
    private String  _UsuarioRegistro= "";
    private String _FechaRegistro = "";
    private Boolean _Estado = null;

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
     * @return the _Nombres
     */
    public String getNombres() {
        return _Nombres;
    }

    /**
     * @param _Nombres the _Nombres to set
     */
    public void setNombres(String _Nombres) {
        this._Nombres = _Nombres;
    }

    /**
     * @return the _ApellidoPaterno
     */
    public String getApellidoPaterno() {
        return _ApellidoPaterno;
    }

    /**
     * @param _ApellidoPaterno the _ApellidoPaterno to set
     */
    public void setApellidoPaterno(String _ApellidoPaterno) {
        this._ApellidoPaterno = _ApellidoPaterno;
    }

    /**
     * @return the _ApellidoMaterno
     */
    public String getApellidoMaterno() {
        return _ApellidoMaterno;
    }

    /**
     * @param _ApellidoMaterno the _ApellidoMaterno to set
     */
    public void setApellidoMaterno(String _ApellidoMaterno) {
        this._ApellidoMaterno = _ApellidoMaterno;
    }

    /**
     * @return the _NroDocumento
     */
    public String getNroDocumento() {
        return _NroDocumento;
    }

    /**
     * @param _NroDocumento the _NroDocumento to set
     */
    public void setNroDocumento(String _NroDocumento) {
        this._NroDocumento = _NroDocumento;
    }

    /**
     * @return the _Telefono
     */
    public String getTelefono() {
        return _Telefono;
    }

    /**
     * @param _Telefono the _Telefono to set
     */
    public void setTelefono(String _Telefono) {
        this._Telefono = _Telefono;
    }

    /**
     * @return the _Correo
     */
    public String getCorreo() {
        return _Correo;
    }

    /**
     * @param _Correo the _Correo to set
     */
    public void setCorreo(String _Correo) {
        this._Correo = _Correo;
    }

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
     * @return the _FechaNacimiento
     */
    public String getFechaNacimiento() {
        return _FechaNacimiento;
    }

    /**
     * @param _FechaNacimiento the _FechaNacimiento to set
     */
    public void setFechaNacimiento(String _FechaNacimiento) {
        this._FechaNacimiento = _FechaNacimiento;
    }

    /**
     * @return the _Usuario
     */
    public String getUsuario() {
        return _Usuario;
    }

    /**
     * @param _Usuario the _Usuario to set
     */
    public void setUsuario(String _Usuario) {
        this._Usuario = _Usuario;
    }

    /**
     * @return the _Clave
     */
    public String getClave() {
        return _Clave;
    }

    /**
     * @param _Clave the _Clave to set
     */
    public void setClave(String _Clave) {
        this._Clave = _Clave;
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

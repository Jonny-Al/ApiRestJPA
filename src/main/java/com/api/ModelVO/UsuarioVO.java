package com.api.ModelVO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class UsuarioVO {

    @JsonProperty ("id")
    private long usid;

    @NotEmpty (message = "Ingrese el nombre")
    @Pattern (regexp = "[A-Z a-z]*", message = "Nombres inválidos")
    @JsonProperty("nombres")
    private String usnombres;

    @JsonProperty("apellidos")
    @NotEmpty(message = "Ingrese los apellidos")
    @Pattern(regexp = "[A-Z a-z]*", message = "Apellidos inválidos")
    @NotEmpty(message = "Ingrese los apellidos")
    private String usapellidos;

    @JsonProperty("telefono")
    @Pattern(regexp = "[0-9]*", message = "Apellidos inválidos")
    private String ustelefono;

    @JsonProperty("correo")
    @Email(message = "El correo es inválido")
    private String uscorreo;

    @JsonProperty("correoalternativo")
    private String uscorreoalternativo;

    @JsonIgnore
    private String usclave;

    @JsonProperty("foto")
    private String usfoto;

    @JsonProperty("estado")
    private int usestado;

    @JsonIgnore
    private long rolid;

    @JsonIgnore
    private long arid;

    // --------

    @JsonProperty("Rol")
    private RolVO rol;

    public RolVO getRol() {
        return rol;
    }

    public void setRol(RolVO rol) {
        this.rol = rol;
    }

    @JsonProperty("Area")
    private AreaVO area;

    public AreaVO getArea() {
        return area;
    }

    public void setArea(AreaVO area) {
        this.area = area;
    }

    // --------


    public long getUsid() {
        return usid;
    }

    public void setUsid(long usid) {
        this.usid = usid;
    }

    public String getUsnombres() {
        return usnombres;
    }

    public void setUsnombres(String usnombres) {
        this.usnombres = usnombres;
    }

    public String getUsapellidos() {
        return usapellidos;
    }

    public void setUsapellidos(String usapellidos) {
        this.usapellidos = usapellidos;
    }

    public String getUstelefono() {
        return ustelefono;
    }

    public void setUstelefono(String ustelefono) {
        this.ustelefono = ustelefono;
    }

    public String getUscorreo() {
        return uscorreo;
    }

    public void setUscorreo(String uscorreo) {
        this.uscorreo = uscorreo;
    }

    public String getUscorreoalternativo() {
        return uscorreoalternativo;
    }

    public void setUscorreoalternativo(String uscorreoalternativo) {
        this.uscorreoalternativo = uscorreoalternativo;
    }

    @JsonIgnore
    public String getUsclave() {
        return usclave;
    }

    @JsonProperty("clave")
    public void setUsclave(String usclave) {
        this.usclave = usclave;
    }

    public String getUsfoto() {
        return usfoto;
    }

    public void setUsfoto(String usfoto) {
        this.usfoto = usfoto;
    }

    public int getUsestado() {
        return usestado;
    }

    public void setUsestado(int usestado) {
        this.usestado = usestado;
    }

    @JsonIgnore
    public long getRolid() {
        return rolid;
    }

    @JsonProperty("Idrol")
    public void setRolid(long rolid) {
        this.rolid = rolid;
    }

    @JsonIgnore
    public long getArid() {
        return arid;
    }

    @JsonProperty("IdArea")
    public void setArid(long arid) {
        this.arid = arid;
    }
}

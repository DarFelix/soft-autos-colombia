package com.iudigital.clase;

/**
 *
 * @author Darwin Felix
 */
public class Persona {

    private int id;
    private String tipoDoc;
    private String numeroDoc;
    private String nombres;
    private String apellidos;
    private String telefonoFijo;
    private String telefonoMovil;
    private String direccion;
    private String email;
    private String pass;
    private String idRol;

//    public Persona() {
//
//    }

//    public Persona(int id, String tipoDoc, String numeroDoc, String nombres, String apellidos, String telefonoFijo,
//            String telefonoMovil, String direccion, String email, String pass, String idRol) {
//
//        this.id = id;
//        this.tipoDoc = tipoDoc;
//        this.numeroDoc = numeroDoc;
//        this.nombres = nombres;
//        this.apellidos = apellidos;
//        this.telefonoFijo = telefonoFijo;
//        this.telefonoMovil = telefonoMovil;
//        this.direccion = direccion;
//        this.email = email;
//        this.pass = pass;
//        this.idRol = idRol;
//
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getNumeroDoc() {
        return numeroDoc;
    }

    public void setNumeroDoc(String numeroDoc) {
        this.numeroDoc = numeroDoc;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public String getTelefonoMovil() {
        return telefonoMovil;
    }

    public void setTelefonoMovil(String telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public String getIdRol() {
        return idRol;
    }

    public void setIdRol(String idRol) {
        this.idRol = idRol;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", tipoDoc=" + tipoDoc + ", numeroDoc=" + numeroDoc + ", nombres=" + nombres + ", apellidos=" + apellidos + ", telefonoFijo=" + telefonoFijo + ", telefonoMovil=" + telefonoMovil + ", direccion=" + direccion + ", email=" + email + ", pass=" + pass + ", idRol=" + idRol + '}';
    }

  
    
    

}

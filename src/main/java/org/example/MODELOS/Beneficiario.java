package org.example.MODELOS;

import java.time.LocalDate;

public class Beneficiario {

    private String nombre;
    private String apellido;
    private String identificacion;
    private String parentesco;
    private String direccion;
    private String telefono;
    private double porcentajeBeneficio;
    private LocalDate fechaNacimiento;
    private boolean esPrincipal;

    public Beneficiario() {
    }
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    public void setapellido(String apellido){
        this.apellido=apellido;
    }
    public void setidentificacion(String identificacion){
        this.identificacion=identificacion;
    }
    public void setparentesco(String parentesco){
        this.parentesco=parentesco;
    }
    public void setdireccion(String direccion){
        this.direccion=direccion;
    }
    public void settelefono(String telefono){
        this.telefono=telefono;
    }
    public void setporcentajeBeneficio(double porcentajeBeneficio){
        this.porcentajeBeneficio=porcentajeBeneficio;
    }
    public void setfechaNacimiento(LocalDate fechaNacimiento){
        this.fechaNacimiento=fechaNacimiento;
    }
    public void setesPrincipal(boolean esPrincipal){
        this.esPrincipal=esPrincipal;
    }

    public Beneficiario(String nombre, String apellido, String identificacion, String parentesco, String direccion, String telefono, double porcentajeBeneficio, LocalDate fechaNacimiento, boolean esPrincipal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.parentesco = parentesco;
        this.direccion = direccion;
        this.telefono = telefono;
        this.porcentajeBeneficio = porcentajeBeneficio;
        this.fechaNacimiento = fechaNacimiento;
        this.esPrincipal = esPrincipal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getPorcentajeBeneficio() {
        return porcentajeBeneficio;
    }

    public void setPorcentajeBeneficio(double porcentajeBeneficio) {
        this.porcentajeBeneficio = porcentajeBeneficio;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isEsPrincipal() {
        return esPrincipal;
    }

    public void setEsPrincipal(boolean esPrincipal) {
        this.esPrincipal = esPrincipal;
    }

    @Override
    public String toString() {
        return "Beneficiario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", parentesco='" + parentesco + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", porcentajeBeneficio=" + porcentajeBeneficio +
                ", fechaNacimiento=" + fechaNacimiento +
                ", esPrincipal=" + esPrincipal +
                '}';
    }
}

package org.example.MODELOS;

import java.time.LocalDate;

public class Aseguradora {

    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    private String tipoSeguros;
    private double montoMaximo;
    private double primaPromedio;
    private String paisOperacion;
    private LocalDate fechaFundacion;
    private String numeroPolizasActivas;

    public Aseguradora() {
    }
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    public void setdireccion(String direccion){
        this.direccion=direccion;
    }
    public void settelefono(String telefono){
        this.telefono=telefono;
    }
    public void setemail(String email){
        this.email=email;
    }
    public void settipoSeguros(String tipoSeguros){
        this.tipoSeguros=tipoSeguros;
    }
    public void setmontoMaximo(double montoMaximo){
        this.montoMaximo=montoMaximo;
    }
    public void setprimaPromedio(double primaPromedio){
        this.primaPromedio=primaPromedio;
    }
    public void setpaisOperacion(String paisOperacion){
        this.paisOperacion=paisOperacion;
    }
    public void setfechaFundacion(LocalDate fechaFundacion){
        this.fechaFundacion=fechaFundacion;
    }
    public void setnumeroPolizasActivas(String numeroPolizasActivas){
        this.numeroPolizasActivas=numeroPolizasActivas;
    }


    public Aseguradora(String nombre, String direccion, String telefono, String email, String tipoSeguros, double montoMaximo, double primaPromedio, String paisOperacion, LocalDate fechaFundacion, String numeroPolizasActivas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.tipoSeguros = tipoSeguros;
        this.montoMaximo = montoMaximo;
        this.primaPromedio = primaPromedio;
        this.paisOperacion = paisOperacion;
        this.fechaFundacion = fechaFundacion;
        this.numeroPolizasActivas = numeroPolizasActivas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipoSeguros() {
        return tipoSeguros;
    }

    public void setTipoSeguros(String tipoSeguros) {
        this.tipoSeguros = tipoSeguros;
    }

    public double getMontoMaximo() {
        return montoMaximo;
    }

    public void setMontoMaximo(double montoMaximo) {
        this.montoMaximo = montoMaximo;
    }

    public double getPrimaPromedio() {
        return primaPromedio;
    }

    public void setPrimaPromedio(double primaPromedio) {
        this.primaPromedio = primaPromedio;
    }

    public String getPaisOperacion() {
        return paisOperacion;
    }

    public void setPaisOperacion(String paisOperacion) {
        this.paisOperacion = paisOperacion;
    }

    public LocalDate getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(LocalDate fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public String getNumeroPolizasActivas() {
        return numeroPolizasActivas;
    }

    public void setNumeroPolizasActivas(String numeroPolizasActivas) {
        this.numeroPolizasActivas = numeroPolizasActivas;
    }

    @Override
    public String toString() {
        return "Aseguradora{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", tipoSeguros='" + tipoSeguros + '\'' +
                ", montoMaximo=" + montoMaximo +
                ", primaPromedio=" + primaPromedio +
                ", paisOperacion='" + paisOperacion + '\'' +
                ", fechaFundacion=" + fechaFundacion +
                ", numeroPolizasActivas='" + numeroPolizasActivas + '\'' +
                '}';
    }
}

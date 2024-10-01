package org.example.MODELOS;

import java.time.LocalDate;

public class Accidente {

        private LocalDate fecha;
        private String hora;
        private String ubicacion;
        private String tipoAccidente;
        private String clima;
        private Integer numeroVehiculosInvolucrados;
        private Integer numeroHeridos;
        private boolean huboFallecidos;
        private String causaProbable;
        private boolean autoridad;

    public Accidente() {
    }

    public Accidente(LocalDate fecha, String hora, String ubicacion, String tipoAccidente, String clima, Integer numeroVehiculosInvolucrados, Integer numeroHeridos, boolean huboFallecidos, String causaProbable, boolean autoridad) {
        this.fecha = fecha;
        this.hora = hora;
        this.ubicacion = ubicacion;
        this.tipoAccidente = tipoAccidente;
        this.clima = clima;
        this.numeroVehiculosInvolucrados = numeroVehiculosInvolucrados;
        this.numeroHeridos = numeroHeridos;
        this.huboFallecidos = huboFallecidos;
        this.causaProbable = causaProbable;
        this.autoridad = autoridad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTipoAccidente() {
        return tipoAccidente;
    }

    public void setTipoAccidente(String tipoAccidente) {
        this.tipoAccidente = tipoAccidente;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public Integer getNumeroVehiculosInvolucrados() {
        return numeroVehiculosInvolucrados;
    }

    public void setNumeroVehiculosInvolucrados(Integer numeroVehiculosInvolucrados) {
        this.numeroVehiculosInvolucrados = numeroVehiculosInvolucrados;
    }

    public Integer getNumeroHeridos() {
        return numeroHeridos;
    }

    public void setNumeroHeridos(Integer numeroHeridos) {
        this.numeroHeridos = numeroHeridos;
    }

    public boolean isHuboFallecidos() {
        return huboFallecidos;
    }

    public void setHuboFallecidos(boolean huboFallecidos) {
        this.huboFallecidos = huboFallecidos;
    }

    public String getCausaProbable() {
        return causaProbable;
    }

    public void setCausaProbable(String causaProbable) {
        this.causaProbable = causaProbable;
    }

    public boolean isAutoridad() {
        return autoridad;
    }

    public void setAutoridad(boolean autoridad) {
        this.autoridad = autoridad;
    }

    @Override
    public String toString() {
        return "Accidente{" +
                "fecha=" + fecha +
                ", hora='" + hora + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", tipoAccidente='" + tipoAccidente + '\'' +
                ", clima='" + clima + '\'' +
                ", numeroVehiculosInvolucrados=" + numeroVehiculosInvolucrados +
                ", numeroHeridos=" + numeroHeridos +
                ", huboFallecidos=" + huboFallecidos +
                ", causaProbable='" + causaProbable + '\'' +
                ", autoridad=" + autoridad +
                '}';
    }
}

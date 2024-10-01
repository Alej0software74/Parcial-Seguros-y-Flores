package org.example.MODELOS;

public class Vehiculo {

    private String marca;
    private String modelo;
    private Integer año;
    private String color;
    private String tipoCombustible;
    private Integer cilindrada;
    private Integer numeroPuertas;
    private boolean Automático;
    private double consumoCombustible;
    private double precio;
    private String numeroChasis;
    private String tipoVehiculo;
    private double capacidadMaletero;
    private boolean tieneGPS;
    private String estadoVehiculo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, Integer año, String color, String tipoCombustible, Integer cilindrada, Integer numeroPuertas, boolean automático, double consumoCombustible, double precio, String numeroChasis, String tipoVehiculo, double capacidadMaletero, boolean tieneGPS, String estadoVehiculo) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
        this.tipoCombustible = tipoCombustible;
        this.cilindrada = cilindrada;
        this.numeroPuertas = numeroPuertas;
        Automático = automático;
        this.consumoCombustible = consumoCombustible;
        this.precio = precio;
        this.numeroChasis = numeroChasis;
        this.tipoVehiculo = tipoVehiculo;
        this.capacidadMaletero = capacidadMaletero;
        this.tieneGPS = tieneGPS;
        this.estadoVehiculo = estadoVehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public Integer getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(Integer cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Integer getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(Integer numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public boolean isAutomático() {
        return Automático;
    }

    public void setAutomático(boolean automático) {
        Automático = automático;
    }

    public double getConsumoCombustible() {
        return consumoCombustible;
    }

    public void setConsumoCombustible(double consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNumeroChasis() {
        return numeroChasis;
    }

    public void setNumeroChasis(String numeroChasis) {
        this.numeroChasis = numeroChasis;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public double getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(double capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    public boolean isTieneGPS() {
        return tieneGPS;
    }

    public void setTieneGPS(boolean tieneGPS) {
        this.tieneGPS = tieneGPS;
    }

    public String getEstadoVehiculo() {
        return estadoVehiculo;
    }

    public void setEstadoVehiculo(String estadoVehiculo) {
        this.estadoVehiculo = estadoVehiculo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                ", color='" + color + '\'' +
                ", tipoCombustible='" + tipoCombustible + '\'' +
                ", cilindrada=" + cilindrada +
                ", numeroPuertas=" + numeroPuertas +
                ", Automático=" + Automático +
                ", consumoCombustible=" + consumoCombustible +
                ", precio=" + precio +
                ", numeroChasis='" + numeroChasis + '\'' +
                ", tipoVehiculo='" + tipoVehiculo + '\'' +
                ", capacidadMaletero=" + capacidadMaletero +
                ", tieneGPS=" + tieneGPS +
                ", estadoVehiculo='" + estadoVehiculo + '\'' +
                '}';
    }
}

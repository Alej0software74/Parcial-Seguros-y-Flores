package org.example.MODELOS;

public class Asegurado {

    private long id;
    private String nombres;
    private String apellidos;
    private String telefono;
    private Integer edad;
    private String documento;
    private String direccion;
    private String estadoCivil;
    private String telefonoRespaldo;
    private String email;
    private String hospitalAfiliado;
    private String licencia;
    private Integer añosExperiencia;
    private double salario;
    private String nombreRespaldo;
    //usar set para el vacio


    public Asegurado() {
    }

    public Asegurado(long id, String nombres, String apellidos, String telefono, Integer edad, String documento, String direccion, String estadoCivil, String telefonoRespaldo, String email, String hospitalAfiliado, String licencia, Integer añosExperiencia, double salario, String nombreRespaldo) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.edad = edad;
        this.documento = documento;
        this.direccion = direccion;
        this.estadoCivil = estadoCivil;
        this.telefonoRespaldo = telefonoRespaldo;
        this.email = email;
        this.hospitalAfiliado = hospitalAfiliado;
        this.licencia = licencia;
        this.añosExperiencia = añosExperiencia;
        this.salario = salario;
        this.nombreRespaldo = nombreRespaldo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getTelefonoRespaldo() {
        return telefonoRespaldo;
    }

    public void setTelefonoRespaldo(String telefonoRespaldo) {
        this.telefonoRespaldo = telefonoRespaldo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHospitalAfiliado() {
        return hospitalAfiliado;
    }

    public void setHospitalAfiliado(String hospitalAfiliado) {
        this.hospitalAfiliado = hospitalAfiliado;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public Integer getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(Integer añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNombreRespaldo() {
        return nombreRespaldo;
    }

    public void setNombreRespaldo(String nombreRespaldo) {
        this.nombreRespaldo = nombreRespaldo;
    }

    @Override
    public String toString() {
        return "Asegurado{" +
                "id=" + id +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefono='" + telefono + '\'' +
                ", edad=" + edad +
                ", documento='" + documento + '\'' +
                ", direccion='" + direccion + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", telefonoRespaldo='" + telefonoRespaldo + '\'' +
                ", email='" + email + '\'' +
                ", hospitalAfiliado='" + hospitalAfiliado + '\'' +
                ", licencia='" + licencia + '\'' +
                ", añosExperiencia=" + añosExperiencia +
                ", salario=" + salario +
                ", nombreRespaldo='" + nombreRespaldo + '\'' +
                '}';
    }
}

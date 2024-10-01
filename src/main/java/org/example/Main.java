package org.example;

import org.example.MODELOS.*;

public class Main {
    public static void main(String[] args) {

        Asegurado aseguradoUno = new Asegurado();
        Asegurado aseguradoDos = new Asegurado(1L,"Daniel Alejandro","Gomez Ramirez","3001278330",20,"1020104388","Tv 78 #67-14","Soltero","3001278333","dangomram74@gmail.com","Sura","vigente",2,13000000,"Claudia");
        System.out.println(aseguradoUno);
        System.out.println(aseguradoDos);

        Vehiculo vehiculoUno = new Vehiculo();
        Vehiculo vehiculoDos = new Vehiculo("Pulsar","2025",2024,"Azul","Corriente",200,0,false,40000,14000000,"12345","Moto",1,true,"Buen estado");
        System.out.println(vehiculoUno);
        System.out.println(vehiculoDos);

        Accidente accidenteUno = new Accidente();
        Accidente accidenteDos = new Accidente(null,"1:00","La 80","choque","soleado",2,2,false,"Se paso semaforo",true);
        System.out.println(accidenteUno);
        System.out.println(accidenteDos);

        Aseguradora aseguradoraUno = new Aseguradora();
        Aseguradora aseguradoraDos = new Aseguradora("Granseguro","Calle 80","3001278388","Gran asegurado@gmail.com","premiun",2000000,1000000,"Colombia",null,"1.000");
        System.out.println(aseguradoraUno);
        System.out.println(aseguradoraDos);

        Beneficiario beneficiarioUno = new Beneficiario();
        Beneficiario beneficiarioDos = new Beneficiario("Claudia","Ramirez","10201014377","Madre","Tv 78 #67-14","3001278303",100,null,true);
        System.out.println(beneficiarioUno);
        System.out.println(beneficiarioDos);
    }
}
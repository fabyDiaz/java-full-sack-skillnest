package com.clases;

public class Empleado {
    private static int nuevoId = 0;
    private int id;
    private String nombre;
    private double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.id = nuevoId++;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public double calcularSalarioTotal(){
        this.salarioBase*=160;
        return this.salarioBase;
    }

    public String mostrarInformacionDelEmpleado(){
        return "Id: "+ id + "\nNombre: "+ nombre + "\nSalarioBase: "+ salarioBase + "\n";
    }


    public static int getNuevoId() {
        return nuevoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}

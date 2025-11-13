package com.clases;

public class Director extends Gerente{

    private double acciones;

    public Director(String nombre, double salarioBase, double bono, double acciones) {
        super(nombre, salarioBase, bono);
        this.acciones = acciones;
    }

    @Override
    public double calcularSalarioTotal() {
        return super.calcularSalarioTotal() + this.acciones;
    }

    @Override
    public String mostrarInformacionDelEmpleado() {
        return super.mostrarInformacionDelEmpleado() + "Acciones "+ this.acciones + "\n";
    }

    public double getAcciones() {
        return acciones;
    }

    public void setAcciones(double acciones) {
        this.acciones = acciones;
    }
}

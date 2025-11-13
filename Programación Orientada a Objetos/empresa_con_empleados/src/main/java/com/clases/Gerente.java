package com.clases;

public class Gerente extends Empleado {

    private double bono;

    public Gerente(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }

    @Override
    public double calcularSalarioTotal() {
        return super.calcularSalarioTotal()+this.bono;
    }

    @Override
    public String mostrarInformacionDelEmpleado() {
        return super.mostrarInformacionDelEmpleado() + "Bono: " + this.bono +"\n";
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }
}

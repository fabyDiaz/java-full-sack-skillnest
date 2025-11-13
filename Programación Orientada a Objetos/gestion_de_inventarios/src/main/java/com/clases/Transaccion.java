package com.clases;

import com.interfaces.Auditable;

public class Transaccion implements Auditable {

    private static int incremento = 0;
    private int id;
    private String tipo;
    private double monto;

    public Transaccion(String tipo, double monto) {
        this.id = ++incremento;
        this.tipo = tipo;
        this.monto = monto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }


    @Override
    public void registraAccion(String accion) {
        System.out.println("Se realiza la accion: " + accion +" en Transacción");
    }

    @Override
    public String toString() {
        return "Transaccion{" +
                "id=" + id +
                ", tipo='" + tipo + '\'' +
                ", monto=" + monto +
                '}';
    }
}

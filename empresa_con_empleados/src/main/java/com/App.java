package com;

import com.clases.Director;
import com.clases.Empleado;
import com.clases.Gerente;
import java.util.ArrayList;
import java.util.Arrays;

public class App 
{
    public static void main( String[] args ) {
        Empleado empleado = new Empleado("Juan", 1000);
        Gerente gerente = new Gerente("Camila", 1200, 200);
        Director director = new Director("Felipe", 1200, 100, 20);

        System.out.println(empleado.mostrarInformacionDelEmpleado() + "Salario total: "+ empleado.calcularSalarioTotal());
        System.out.println(gerente.mostrarInformacionDelEmpleado() + "Salario total: "+ gerente.calcularSalarioTotal());
        System.out.println(director.mostrarInformacionDelEmpleado() + "Salario total: "+ director.calcularSalarioTotal());

        System.out.println("==========================");

        Empleado empleado2 = new Empleado("Sofía", 1000);
        Empleado gerente2 = new Gerente("Luis", 1200, 200);
        Empleado director2 = new Director("Macarena", 1200, 100, 20);

        ArrayList<Empleado> empleados = new ArrayList<>(Arrays.asList(empleado2,gerente2,director2));
        for(Empleado e : empleados){
            System.out.println(e.mostrarInformacionDelEmpleado()+ "Salario total: "+ e.calcularSalarioTotal());
        }
    }
}

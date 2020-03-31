/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio01;

/**
 *
 * @author samll
 */
public class EmpleadoPorHoras extends Empleados{
    public int horasTrabajadas;

    public EmpleadoPorHoras(int horasTrabajadas, String nombre, String direccion, String puesto, int telefono) {
        super(nombre, direccion, puesto, telefono);
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public String infoEmpleado() {
        String info="Horas Trabajadas: " + this.horasTrabajadas;
        return super.infoEmpleado() + info; 
    }

    @Override
    public String salario() {
        String msj="Tu salario es por horas y la hora de trabajo se paga a $5. Tu salario total es: $" + (this.horasTrabajadas*5)*20;
        return msj;
    }
    
    
    
}

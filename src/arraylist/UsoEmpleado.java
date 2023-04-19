package arraylist;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoEmpleado {

    public static void main(String[] args) {

        Empleado listaEmpleados[]=new Empleado[3];
        listaEmpleados[0]=new Empleado("Ana",45,2500);
        listaEmpleados[1]=new Empleado("Antonio",55,2000);
        listaEmpleados[2]=new Empleado("Maria",25,2600);

        for(Empleado e: listaEmpleados){

            System.out.println(e.dameDatos());

        }

    }


}
class Empleado {


    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }


    public String dameDatos() {//getter

        return "El empleado se llama " + nombre + ", tiene " + edad + " años y un salario de " + salario;

    }//getter


    private String nombre;
    private int edad;
    private double salario;

}
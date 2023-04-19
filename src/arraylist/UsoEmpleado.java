package arraylist;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;

public class UsoEmpleado {

    public static void main(String[] args) {

        /*Empleado listaEmpleados[]=new Empleado[3];
        listaEmpleados[0]=new Empleado("Ana",45,2500);
        listaEmpleados[1]=new Empleado("Antonio",55,2000);
        listaEmpleados[2]=new Empleado("Maria",25,2600);*/

        ArrayList<Empleado> listaEmpleados=new ArrayList<Empleado>();
        listaEmpleados.add(new Empleado("Ana",45,2500));
        listaEmpleados.add(new Empleado("Antonio",55,2000));
        listaEmpleados.add(new Empleado("Maria",25,2600));
        listaEmpleados.add(new Empleado("Jose",35,2200));
        listaEmpleados.add(new Empleado("Pedro",22,2200));


        //listaEmpleados.set(1,new Empleado("Olga",22,2200));
        //System.out.println(listaEmpleados.get(3).dameDatos());

        System.out.println(listaEmpleados.size());

//        for(Empleado e: listaEmpleados){
//
//            System.out.println(e.dameDatos());
//
//        }

        Iterator<Empleado> miIterador=listaEmpleados.iterator();

        while(miIterador.hasNext()){

            System.out.println(miIterador.next().dameDatos());

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
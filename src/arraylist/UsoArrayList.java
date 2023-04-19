package arraylist;

import java.io.File;

public class UsoArrayList {

    public static void main(String[] args) {

        ArrayList archivos=new ArrayList(5);

        archivos.add("Juan");
        archivos.add("María");
        archivos.add("Ana");
        archivos.add("Sandra");
        archivos.add(new File("gestionPedidos.accdb"));

        String nombrePersona=(String) archivos.get(4);



        System.out.println(nombrePersona);

    }

}

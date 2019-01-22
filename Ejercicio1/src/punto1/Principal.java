package punto1;

import java.util.ArrayList;

public class Principal {
    public static void main(String [] args){
        Aclass classA = new Aclass();
        Aclass classB = new Bclass();
        Aclass classC = new Cclass();
        Aclass classD = new Dclass();

        ArrayList<Aclass> clases = new ArrayList<>();
        clases.add(classA);
        clases.add(classB);
        clases.add(classC);
        clases.add(classD);

        for (Aclass cl: clases
             ) {
            System.out.println(cl.whoIm());
        }
    }
}

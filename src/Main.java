import java.util.ArrayList;
import java.util.Iterator;
/**
 * Created by kali on 10/10/16.
 */
public class Main {
    public static void main(String[] args) {
        //Declare assign the variable of type ArrayList<Integer>
        ArrayList<Integer> variable = Menu.reader();
        int suma = 0;
        double promedio = 0.00;

        //Loop trough the ArrayList with the for
        for (int i =0; i< variable.size(); i ++){
            suma += variable.get(i);
        }
        promedio = suma / variable.size();
        System.out.println("La suma es: " + suma + " y el promedio es: " + promedio + ".");
        suma = 0;
        promedio = 0.00;

        //Loop using for each
        for(Integer s: variable){
            suma += s;
        }
        promedio = suma / variable.size();
        System.out.println("La suma es: " + suma + " y el promedio es: " + promedio + ".");
        suma = 0;
        promedio = 0.00;

        //Loop using iterator
        Iterator it = variable.iterator();
        while(it.hasNext()){
            suma += (int) it.next();
        }
        promedio = suma / variable.size();
        System.out.println("La suma es: " + suma + " y el promedio es: " + promedio + ".");
    }
}

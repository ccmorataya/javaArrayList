import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by kali on 10/10/16.
 */
public class Menu {
    public static ArrayList<Integer> reader(){
        Scanner read;
        read = new Scanner(System.in);
        String number = "1";
        ArrayList<Integer> myArrayL;
        myArrayL = new ArrayList<>();

        while (Integer.parseInt(number) != 0){
            number = read.nextLine();
            myArrayL.add(Integer.parseInt(number));
        }
        return  myArrayL;
    }
}

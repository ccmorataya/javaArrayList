import java.util.Scanner;
/**
 * Created by kali on 10/10/16.
 */
public class Main {
    public static void main(String[] args) {
        Scanner read;
        read = new Scanner(System.in);
        String number = "1";

        while (Integer.parseInt(number) != 0){
            number = read.nextLine();
        }
        Menu.reader( Integer.parseInt(number));
    }
}

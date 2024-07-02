import java.util.Scanner;
import java.util.Calendar;

public class Entrada {
    public static void main(String[]args){
        Scanner entrada  = new Scanner (System.in);


        System.out.println("Digite sua idade: ");
        Calendar calendario = Calendar.getInstance();
        
        System.out.println("Voce nasceu em " + (calendario.get(Calendar.YEAR)- entrada.nextInt()) + "\n");

        entrada.close();
    }
}
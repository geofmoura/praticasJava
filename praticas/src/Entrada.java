import java.util.Scanner;
import java.util.Calendar;

public class Entrada {
    public static void main(String[]args){
        Scanner entrada  = new Scanner (System.in);


        System.out.println("Digite sua idade: ");
        Calendar calendario = Calendar.getInstance();
        
        System.out.println("Voce nasceu em " + (calendario.get(Calendar.YEAR)- entrada.nextInt()) + "\n");

        entrada.close();

        System.out.println("Ola, aqui esta as minhas primeiras praticas em Java");
        
        System.out.println("XXXXXX");
        System.out.println("X    X");
        System.out.println("X    X");
        System.out.println("X    X");
        System.out.println("XXXXXX");

    //estou com dificuldade para quebrar linhas, por enquanto

        System.out.println("      X");
        System.out.println("     XXX");
        System.out.println("    XXXXX");
        System.out.println("   XXXXXXX");
        System.out.println("  XXXXXXXXX");
        System.out.println(" XXXXXXXXXXX");
        System.out.println("      XX    ");
        
    }
}
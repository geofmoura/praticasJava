import java.util.Scanner;
import java.util.Calendar;

public class Entrada {
    public static void main(String[]args){
        Scanner entrada  = new Scanner (System.in);
        int idade;
        int ano_atual;
        int ano_nascimento;

        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();
        
        Calendar calendario = Calendar.getInstance();
        ano_atual=calendario.get(Calendar.YEAR);
        ano_nascimento=ano_atual - idade;

        System.out.println("Voce nasceu  em " + ano_nascimento + "\n");

        entrada.close();
    }
}
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
        
        System.out.println("Exibicao de tabela abaixo:");
        System.out.println("ALUNO(A)   NOTA");
        System.out.println("=======    ====");
        System.out.println("TEREZA     9.5");
        System.out.println("MARIO       8");
        System.out.println("LUCAS      5.6");
        System.out.println("GEOVANA    9.9");

        System.out.println("L");
        System.out.println("L");
        System.out.println("L");
        System.out.println("LLLLL");

         int idade=21;
         System.out.println("Minha idade e: "+ idade);

         float dinheiro=1.99f;
         float preco;
         System.out.println("So tenho R$"+ dinheiro +" na minha carteira");

        System.out.println("Quanto custa algo em uma loja de R$ 1,99? ");
             preco = entrada.nextFloat();
 
        System.out.println("Hã? " + preco + "?");

    }
}
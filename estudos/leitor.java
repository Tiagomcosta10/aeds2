package estudos;
import java.util.Scanner;
public class leitor {
    public static void main(String[] args) {
        
    
      Scanner leitor = new Scanner(System.in);

     System.out.println("Bem-vindo ao Edifício Java. Qual é o seu nome?"); 
     String nomeDigitado = leitor.nextLine();

      System.out.println("Olá, " + nomeDigitado + " qual sua idade?");

      int idade = leitor.nextInt();
      System.out.println("Acesso liberado para " + nomeDigitado + " de " + idade + " anos." ); 

      leitor.close();
}
}

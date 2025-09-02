package estudos;
import java.util.Scanner;

public class adivinhacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numeroSecreto = 55;

        System.out.println("bem vindo ao jogo da imaginação, tente adivinhar o número secreto");
int palpite = leitor.nextInt();

        while (numeroSecreto != palpite){

          
         System.out.println("errado, tente novamente");
            
         palpite = leitor.nextInt();


        }

        System.out.println("parabéns você acertou");

        

        leitor.close();
    }
    
}

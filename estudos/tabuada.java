package estudos;
import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número para ver a tabuada:");

        int numero = leitor.nextInt();

        for(int i = 1; i <= 10; i ++ ){
            int resultado = i * numero;
                System.out.println(i +" vezes " + numero + " é igual a " + resultado);
        }
        leitor.close();
        
    }

    
}

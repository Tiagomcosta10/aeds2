
import java.util.Scanner;

public class espelho {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Laço principal para processar múltiplas linhas de entrada.
        while (sc.hasNext()) {
            int inicio = sc.nextInt();
            int fim = sc.nextInt();

            //Constrói a primeira parte da sequência em ordem crescente
            String sequencia = "";
            for (int i = inicio; i <= fim; i++) {
                sequencia = sequencia + i;
            }

            //Constrói a segunda parte, que é o espelho da primeira.
            String espelho = "";
            for (int i = sequencia.length() - 1; i >= 0; i--) {
                espelho = espelho + sequencia.charAt(i);
            }

            // 3. Imprime o resultado final.
            System.out.println(sequencia + espelho);
        }

        sc.close();
    }
}
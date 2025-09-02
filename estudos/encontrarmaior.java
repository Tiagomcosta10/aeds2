package estudos;

import java.util.Scanner;

public class encontrarmaior {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] numeros = new int[5];


        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número da posição " + i + ": ");
            numeros[i] = leitor.nextInt();
        }


        
       
        int maiorNumero = numeros[0];
        double soma = 0;

        // Loop para achar o maior e somar
        for (int i = 0; i < numeros.length; i++) {
           
            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            }
    
            soma = soma + numeros[i];
        }

        double media = soma / numeros.length;

        System.out.println("O maior número é: " + maiorNumero);
        System.out.println("A soma é: " + soma);
        System.out.println("A média é: " + media);

        leitor.close();
    }
}

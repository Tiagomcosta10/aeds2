package estudos;
/*Desafio: Lista de Compras

Vamos usar isso na prática. Crie um programa que:

Cria um array de double com 4 posições para guardar os preços de 4 produtos.

Usa um Scanner e um loop for para pedir ao usuário que digite o preço de cada um dos 4 produtos e os armazena no array.

Usa um segundo loop for para percorrer o array, somar todos os preços e guardar o resultado em uma variável total.

No final, imprime o valor total da compra.

Dica: Você vai precisar de uma variável double total = 0; antes do segundo loop para ir acumulando a soma. Dentro do loop, você fará algo como total = total + precos[i];.*/
import java.util.Scanner;


public class listadecompras {
    public static void main(String[] args) {
       

        // Cria o Scanner (forçando o uso de '.' para decimais) e o array
        Scanner leitor = new Scanner(System.in);
        double[] precos = new double[4];
double total = 0;
        System.out.println("--- Lista de Compras ---");
        System.out.println("Por favor, digite o preço dos 4 produtos.");

        
        for (int i = 0; i < precos.length; i++) {
            // Pede o preço para o usuário
            System.out.print("Digite o preço do produto " + (i + 1) + ": ");
            
            // Lê o número e guarda na posição 'i' do array
            precos[i] = leitor.nextDouble();

            total = total + precos[i];
           
        }

         System.out.println("total é " + total);
        System.out.println("\nPreços digitados com sucesso!");

        leitor.close();
    }
}
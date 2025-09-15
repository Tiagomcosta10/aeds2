
import java.util.Scanner;

public class SomaDigitosRecursivo {

    // função que verifica se a string é "FIM"
    public static boolean isFim(String s) {
        return (s.length() == 3 && 
                s.charAt(0) == 'F' && 
                s.charAt(1) == 'I' && 
                s.charAt(2) == 'M');
    }

    // método que prepara o número e chama a função recursiva
    public static int somaDigitos(String s) {
        // a gente converte o texto lido para um número inteiro de verdade
        int numero = Integer.parseInt(s);
        return somaDigitosRec(numero);
    }

    // método recursivo que faz a soma, igual o da sua versão em C
    private static int somaDigitosRec(int n) {
        // caso base: se o número só tem um dígito, a soma é ele mesmo.
        if (n < 10) {
            return n;
        //  se o número for maior
        } else {
         
            return (n % 10) + somaDigitosRec(n / 10);
        }
    }

    // método principal 
    public static void main(String[] args) {
       
        Scanner leitor = new Scanner(System.in);
        String entrada;

       
        while (leitor.hasNextLine()) {
         
            entrada = leitor.nextLine();

            // se a linha for "FIM", a gente para o programa
            if (isFim(entrada)) {
                break; 
            }

            
            int resultado = somaDigitos(entrada);
            
           
            System.out.println(resultado);
        }

        
        leitor.close();
    }
}

// Tiago Morais Costa
// Matrícula: 867656

// a biblioteca mais facil pra ler coisas do teclado
import java.util.Scanner;

public class InversaoRecursiva {

    // função que verifica se a string é "FIM"
    public static boolean isFim(String s) {
        return (s.length() == 3 && 
                s.charAt(0) == 'F' && 
                s.charAt(1) == 'I' && 
                s.charAt(2) == 'M');
    }

    // método público que inicia a recursão.
    // começando pelo último caractere.
    public static String inverterString(String s) {
        return inverterStringRecursiva(s, s.length() - 1);
    }

    // método recursivo que inverte a string de verdade
    private static String inverterStringRecursiva(String s, int i) {
        
        // então, retornamos uma string vazia para parar a recursão.
        if (i < 0) {
            return "";
        // passo recursivo: se ainda não chegamos ao fim
        } else {
            // caractere da posição atual (i)
            //  chamada recursiva para o resto da string (i - 1).
            return s.charAt(i) + inverterStringRecursiva(s, i - 1);
        }
    }

    // método principal que o Java executa
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        String entrada;

      
        while (leitor.hasNextLine()) {
            
            entrada = leitor.nextLine();

           
            if (isFim(entrada)) {
                break;
            }

          
            System.out.println(inverterString(entrada));
        }

       
        leitor.close();
    }
}

// Tiago Morais Costa
// Matrícula: 867656
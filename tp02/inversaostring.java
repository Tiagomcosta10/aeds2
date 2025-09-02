import java.util.Scanner;

public class inversaostring {

    // método principal que o Java executa.
    public static void main(String[] args) {
        
        // leitor
        Scanner leitor = new Scanner(System.in);

        // rodar enquanto tiver texto
        while (true) {
            
            // lê a próxima linha
            String primeiralinha = leitor.nextLine();
            
            // condição  de parada
            if (primeiralinha.length() == 3 && 
                primeiralinha.charAt(0) == 'F' && 
                primeiralinha.charAt(1) == 'I' && 
                primeiralinha.charAt(2) == 'M') {
                
                break; 
            }

            // imprime a string invertida
            System.out.println(invertString(primeiralinha));
        }

        // fechar o leitor
        leitor.close();
    }

    // método que inverte a string
    public static String invertString(String s) {
        String invertida = ""; 
        for (int i = s.length() - 1; i >= 0; i--) {  //começa a ler pelo final da string
            invertida = invertida + s.charAt(i);
        }
        return invertida;
    }
}

// Tiago Morais Costa
// Matrícula: 867656

import java.util.Scanner;

public class Palindromo {

   
     // Verifica se é palindromo
    
    public static boolean ehPalindromo(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

   //finaliza com FIM
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String linha = sc.nextLine();
            if (linha.equals("FIM")) break;

            if (ehPalindromo(linha)) {
                System.out.println("SIM");
            } else {
                System.out.println("NAO");
            }
        }

        sc.close();
    }
}


// Tiago Morais Costa
  //Matrícula: 867656
 
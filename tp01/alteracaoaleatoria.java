import java.util.Random;

public class alteracaoaleatoria {

    
     // Recebe uma string e um gerador de números aleatórios para trocar as letras.
    
    public static String alterarAleatoriamente(String s, Random gerador) {
        //sorteia as duas letras usando o gerador que foi recebido.
        char letra1 = (char)('a' + (Math.abs(gerador.nextInt()) % 26));
        char letra2 = (char)('a' + (Math.abs(gerador.nextInt()) % 26));

        String resultado = "";
//laço de substituição
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == letra1) {
                resultado += letra2;
            } else {
                resultado += s.charAt(i);
            }
        }

        return resultado;
    }

    //verifica fim
    public static boolean isFim(String s) {
        return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }

    
    public static void main(String[] args) {
     //faz ler certo
        MyIO.setCharset("UTF-8");
        //gerador de numeros aleatorios
        Random gerador = new Random();
        gerador.setSeed(4);
        
        String entrada = MyIO.readLine();

      
        while (!isFim(entrada)) {
            
            MyIO.println(alterarAleatoriamente(entrada, gerador));
          
            entrada = MyIO.readLine();
        }
    }
}
// Tiago Morais Costa
  //Matrícula: 867656
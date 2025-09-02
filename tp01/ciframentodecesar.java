
//só consegui resolver este problema utilizando a biblioteca myio, por causa dos caracteres especiais
public class ciframentodecesar {

    public static String cifrar(String s) {
        String cifrada = ""; 
        //percorre cada caractere da string original, soma 3 ao seu valor
        for (int i = 0; i < s.length(); i++) { 
            char caractereOriginal = s.charAt(i);  //string original a ser cifrada
            char caractereCifrado = (char)(caractereOriginal + 3); 
            cifrada = cifrada + caractereCifrado;
        }
        
        return cifrada; //string resultante após a cifragem
    }

    public static boolean isfim(String s) {
        return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    } //verifica palavra "FIM"

    public static void main(String[] args) {  //metodo principal
       
        String entrada;

       
        entrada = MyIO.readLine();

        // O laço continua enquanto a entrada não for "FIM".
        while (!isfim(entrada)) {
            
            MyIO.println(cifrar(entrada));
            
     
            entrada = MyIO.readLine();
        }
    }
}
// Tiago Morais Costa
  //Matrícula: 867656
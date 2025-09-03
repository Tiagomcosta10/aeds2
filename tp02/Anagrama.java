import java.util.*;

public class Anagrama{

    // essa funcao serve para quebrar ela em duas strings separadas
    public static String[] separarstring(String frasecompleta){
        int tamanho = frasecompleta.length();
        int indicedapalavra = 0;
        char caractereatual;
        String[] stringsseparadas = new String[2];
        stringsseparadas[0] = "";
        stringsseparadas[1] = "";

        // a gente roda a frase inteira
        for(int i = 0; i < tamanho; i++){
            caractereatual = frasecompleta.charAt(i);
            
            // se o caractere for um '-' pulamos pra segunda palavra
            if(caractereatual == '-'){
                indicedapalavra++;
            }
            // se nao for um espaço, a gente adiciona o caractere na palavra atual
            else if(caractereatual != ' '){
                stringsseparadas[indicedapalavra] = stringsseparadas[indicedapalavra] + caractereatual;
            }
        }
        return stringsseparadas;
    }
    
    // aqui a gente ve se as duas palavras sao anagramas
    public static boolean verificacaodeanagrama(String palavra1, String palavra2){
        
        // se os tamanhos forem diferentes é falso
        if(palavra1.length() != palavra2.length()){
            return false;
        }

        // esse for roda pra cada letra da palavra1
        for(int i = 0; i < palavra1.length(); i++){
            int repeticoesnapalavra1 = 0;
            int repeticoesnapalavra2 = 0;
            
            // conta quantas vezes a letra atual da palavra1 aparece nela mesma
            for(int j = 0; j < palavra1.length(); j++){
                if(palavra1.charAt(j) == palavra1.charAt(i)){
                    repeticoesnapalavra1++;
                }
            }

            // conta quantas vezes essa mesma letra aparece na palavra2
            for(int k = 0; k < palavra2.length(); k++){
                if(palavra2.charAt(k) == palavra1.charAt(i)){
                    repeticoesnapalavra2++;
                }
            }

            // se a contagem for diferente, nao eh anagrama
            if(repeticoesnapalavra1 != repeticoesnapalavra2){
                return false;
            }
        }
        
        // se a gente passou por todas as letras e as contagens sempre bateram então é um anagrama
        return true;
    }
    
    // metodo principal que controla o programa
    public static void main(String[] args) {
        String frasecompleta = "";
        String palavra1, palavra2;
        int continuarloop = 1;
        int codigodotil = 195; // codigo do caractere 'Ã'
        boolean resultado;
        
        // roda enquanto a variavel de controle for 1
        while(continuarloop == 1){
            frasecompleta = MyIO.readLine();
            
            // condicao de parada
            if(frasecompleta.equals("FIM")){
                continuarloop = -1;
            }else{
                // chama a funcao pra separar a frase em duas
                String[] stringsseparadas = separarstring(frasecompleta);
                
                // joga as duas palavras pra minusculo
                palavra1 = stringsseparadas[0].toLowerCase();
                palavra2 = stringsseparadas[1].toLowerCase();
                
                // chama a funcao que verifica se é anagrama
                resultado = verificacaodeanagrama(palavra1, palavra2);
                
                // imprime o resultado
                if(resultado == true){
                    System.out.println("SIM");
                }else{
                    // imprime NÃO  usando Ã'
                    System.out.println("N" + (char)codigodotil + "O");
                }
            }
        }
    }
}
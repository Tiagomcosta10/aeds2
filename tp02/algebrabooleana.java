public class algebrabooleana {

    // método que resolve uma expressão booleana completa
    public static boolean resolver(String expressaocompleta) {
        // Pega o número de variáveis a partir do primeiro caractere
        int numerodevariaveis = charparanInt(expressaocompleta.charAt(0));
        
        // array que guarda os valores de cada variável 
        int[] valoresdasvariaveis = new int[numerodevariaveis];
        int posicaonastring = 2; // posição inicial dos valores

        // lê os valores das variáveis da string de entrada
        for (int i = 0; i < numerodevariaveis; i++) {
            valoresdasvariaveis[i] = charparanInt(expressaocompleta.charAt(posicaonastring));
            posicaonastring += 2; // pula o valor e o espaço
        }

        // pega a parte da string que contém a expressão booleana
        String expressao = "";
        for (int i = posicaonastring; i < expressaocompleta.length(); i++) {
            expressao += expressaocompleta.charAt(i);
        }

        // substitui as letras da expressão pelos valores correspondentes
        String expressaocomvalores = "";
        for (int i = 0; i < expressao.length(); i++) {
            char caractereatual = expressao.charAt(i);
            if (caractereatual >= 'A' && caractereatual < (char)('A' + numerodevariaveis)) {
                expressaocomvalores += valoresdasvariaveis[caractereatual - 'A'];
            } else if (caractereatual != ' ') { // ignora espaços
                expressaocomvalores += caractereatual;
            }
        }

        // resolve as operações dentro de parênteses, de dentro para fora
        while (expressaocomvalores.length() > 1) {
            int fimdaoperacao = 0;
            // encontra o fechamento do parêntese ')'
            for (int i = 0; i < expressaocomvalores.length(); i++) {
                if (expressaocomvalores.charAt(i) == ')') {
                    fimdaoperacao = i;
                    break;
                }
            }

            int iniciodaoperacao = 0;
            // encontra a abertura do parêntese '(' correspondente
            for (int i = fimdaoperacao; i >= 0; i--) {
                if (expressaocomvalores.charAt(i) == '(') {
                    iniciodaoperacao = i;
                    break;
                }
            }

            // pega o conteúdo dentro dos parênteses, ignorando vírgulas
            String miolodaoperacao = "";
            for(int i = iniciodaoperacao + 1; i < fimdaoperacao; i++){
                if(expressaocomvalores.charAt(i) != ','){
                    miolodaoperacao += expressaocomvalores.charAt(i);
                }
            }
            
            // identifica o tipo da operação: not, and ou or
            char nomedaoperacao = expressaocomvalores.charAt(iniciodaoperacao - 1);
            int iniciodonome = 0;
            if(nomedaoperacao == 't') iniciodonome = iniciodaoperacao - 3; // not
            if(nomedaoperacao == 'd') iniciodonome = iniciodaoperacao - 3; // and
            if(nomedaoperacao == 'r') iniciodonome = iniciodaoperacao - 2; // or

            int resultado = 0;

            // calcula o resultado da operação
            if (nomedaoperacao == 't') { // not
                resultado = (miolodaoperacao.charAt(0) == '0') ? 1 : 0;
            } else if (nomedaoperacao == 'd') { // and
                resultado = 1;
                for (int i = 0; i < miolodaoperacao.length(); i++) {
                    if (miolodaoperacao.charAt(i) == '0') {
                        resultado = 0;
                        break;
                    }
                }
            } else if (nomedaoperacao == 'r') { // or
                resultado = 0;
                for (int i = 0; i < miolodaoperacao.length(); i++) {
                    if (miolodaoperacao.charAt(i) == '1') {
                        resultado = 1;
                        break;
                    }
                }
            }
            
            //substitui a operação pelo resultado na string principal
            String novaexpressao = "";
            for(int i = 0; i < iniciodonome; i++){
                novaexpressao += expressaocomvalores.charAt(i);
            }
            novaexpressao += resultado;
            for(int i = fimdaoperacao + 1; i < expressaocomvalores.length(); i++){
                novaexpressao += expressaocomvalores.charAt(i);
            }
            expressaocomvalores = novaexpressao;
        }

        //retorna o resultado final (0 ou 1)
        return (expressaocomvalores.charAt(0) == '1');
    }
    
    // converte char '0' ou '1' para int
    public static int charparanInt(char c){
        return c - '0';
    }

    // método principal que controla a execução do programa
    public static void main(String[] args) {
        String entradadousuario = MyIO.readLine();
        while (entradadousuario.length() != 1 || entradadousuario.charAt(0) != '0') {
            MyIO.println(resolver(entradadousuario) ? "1" : "0");
            entradadousuario = MyIO.readLine();
        }
    }
}

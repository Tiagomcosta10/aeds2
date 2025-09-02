package estudos;

public class CalculadoraMedia {
    /*
     * Agora vamos para o seu próximo desafio.
     * O Desafio:
     * Crie um programa chamado CalculadoraMedia.java.
     * Dentro dele, crie três variáveis do tipo double: nota1, nota2 e nota3, e
     * coloque os valores 7.5, 8.0 e 9.2 nelas.
     * Crie uma quarta variável chamada media.
     * Calcule a média das três notas e guarde o resultado na variável media.
     * Mostre o resultado no console com a mensagem
     * "A média das notas é: [valor da média]".
     */
    public static void main(String[] args) {
        double nota1 = 7.5;
        double nota2 = 8.0;
        double nota3 = 9.2;

        double media = ((nota1+nota2+nota3)/3);

        System.out.println("A média das notas é: " + media);

    }
}

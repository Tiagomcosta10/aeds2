package estudos;
import java.util.Scanner;

public class Calculadora {

    public static double somar(double num1, double num2) {
        double resultadoSoma = num1 + num2;
        return resultadoSoma;
    }

    public static double subtrair(double num1, double num2) {
        double resultadoSub = num1 - num2;
        return resultadoSub;
    }

    public static double multiplicar(double num1, double num2) {
        double resultadoMult = num1 * num2;
        return resultadoMult;
    }

    public static double dividir(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Erro: Divisão por zero não é permitida.");
            return 0.0;
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = leitor.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = leitor.nextDouble();

        double resultado;

        resultado = somar(num1, num2);
        System.out.println("A soma é: ");
        System.out.println(resultado);

        resultado = subtrair(num1, num2);
        System.out.println("A subtração é: ");
        System.out.println(resultado);

        resultado = multiplicar(num1, num2);
        System.out.println("A multiplicação é: ");
        System.out.println(resultado);

        resultado = dividir(num1, num2);
        System.out.println("A divisão é: ");
        System.out.println(resultado);

        leitor.close();
    }
}

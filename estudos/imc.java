package estudos;
import java.util.Scanner;
public class imc {
    public static void exibirmensageminicial(){
        System.out.println("seja bem vindo a calculadora de IMC");

    }
    public static void main (String[] args){

        Scanner leitor = new Scanner(System.in);
        exibirmensageminicial();

System.out.println("qual seu peso?");
double peso = leitor.nextDouble();


System.out.println("qual sua altura?");
double altura = leitor.nextDouble();

double indice = peso / (altura * altura); 

leitor.close();

if (indice > 24.9) {
    System.out.println("seu IMC é " + indice +", que é acima do peso");

}else if (indice >= 18.5 && indice <= 24.9){
    System.out.println("seu IMC é " + indice + ", que está no peso ideal");
} else{
    System.out.println("seu IMC é " + indice + ", que está abaixo do peso");
}


    }   
}

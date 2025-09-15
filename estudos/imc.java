package estudos;
import java.util.Scanner;
public class imc {
    public static void exibirmensageminicial(){
        System.out.println("seja bem vindo a calculadora de IMC");

    }

    public static double calcularIMC(double peso, double altura){
       

double indice = peso / (altura * altura); 


return indice;
    }   
    public static void exibirmensagemfinal(double indiceIMC){

if (indiceIMC > 24.9) {
    System.out.println("seu IMC é " + indiceIMC +", que é acima do peso");

}else if (indiceIMC >= 18.5 && indiceIMC <= 24.9){
    System.out.println("seu IMC é " + indiceIMC + ", que está no peso ideal");
} else{
    System.out.println("seu IMC é " + indiceIMC + ", que está abaixo do peso");
}
    }
    
    public static void main (String[] args){
        exibirmensageminicial();

        Scanner leitor = new Scanner(System.in);
       
System.out.println("qual seu peso?");
double peso = leitor.nextDouble();


System.out.println("qual sua altura?");
double altura = leitor.nextDouble();
        
      double indiceIMC = calcularIMC( peso,  altura);
        exibirmensagemfinal(indiceIMC);


leitor.close();

    }
}

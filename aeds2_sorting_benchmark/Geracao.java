import java.util.*;

class Geracao {
   protected int[] array;
   protected int n;

   public Geracao(){
      array = new int[100];
      n = array.length;
   }

   public Geracao(int tamanho){
      array = new int[tamanho];
      n = array.length;
   }

   public void crescente() {
      for (int i = 0; i < n; i++)  array[i] = i;
   }

   public void decrescente() {
      for (int i = 0; i < n; i++) array[i] = n - 1 - i;
   }

   public void aleatorio() {
      Random rand = new Random();
      crescente();
      for (int i = 0; i < n; i++)
          swap(i, Math.abs(rand.nextInt()) % n);
   }

   public void entrada(int[] vet){
      n = vet.length;
      array = new int[n];
      for (int i = 0; i < n; i++) array[i] = vet[i]; 
   }

   public void swap(int i, int j) {
      int temp = array[i];
      array[i] = array[j];
      array[j] = temp;
   }

   public long now(){
      return new Date().getTime();
   }

   public boolean isOrdenado(){
      for (int i = 1; i < n; i++) {
         if (array[i] < array[i-1]){
            return false;
         }
      }
      return true;
   }

   public void sort(){
      System.out.println("Método a ser implementado nas subclasses.");
   }

   public void mostrar() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'mostrar'");
   }
}

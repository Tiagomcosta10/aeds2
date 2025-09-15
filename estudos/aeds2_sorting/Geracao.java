import java.util.Date;
import java.util.Random;

/*public class Geracao {
    protected int[] array;
    protected int n;

    // Construtores
    public Geracao() {
        array = new int[100];
        n = array.length;
    }

    public Geracao(int tamanho) {
        array = new int[tamanho];
        n = array.length;
    }

    // Preenchimento
    public void crescente() {
        for (int i = 0; i < n; i++) array[i] = i;
    }

    public void decrescente() {
        for (int i = 0; i < n; i++) array[i] = n - 1 - i;
    }

    public void aleatorio() {
        Random rand = new Random();
        crescente();
        for (int i = 0; i < n; i++) {
            swap(i, rand.nextInt(n));
        }
    }

    // Entrada externa
    public void entrada(int[] vet) {
        n = vet.length;
        array = new int[n];
        for (int i = 0; i < n; i++) array[i] = vet[i];
    }

    // Mostrar vetor
    public void mostrar() {
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(" (" + i + ")" + array[i]);
        }
        System.out.println(" ]");
    }

    // Utilitários
    public void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public long now() {
        return new Date().getTime();
    }

    public boolean isOrdenado() {
        for (int i = 1; i < n; i++) {
            if (array[i] < array[i - 1]) return false;
        }
        return true;
    }

    // Método polimórfico
    public void sort() {
        System.out.println("Método a ser implementado nas subclasses.");
    }
}*/

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
   public void entradaPadrao() {
      n = MyIO.readInt();
      array = new int[n];
      for (int i = 0; i < n; i++) 
         array[i] = MyIO.readInt();
   }
   public void entrada(int[] vet){
      n = vet.length;
      array = new int[n];
      for (int i = 0; i < n; i++) array[i] = vet[i]; 
   }
  public void mostrar() {
      System.out.print("[");
      for (int i = 0; i < n; i++)
         System.out.print(" ("+i+")" + array[i]);
      System.out.println("]");
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
      boolean resp = true;
      for (int i = 1; i < n; i++) {
         if (array[i] < array[i-1]){
            i = n;
            resp = false;
         }
      }
      return resp;
   }
   public void sort(){
      System.out.println("Método a ser implementado nas subclasses.");
   }
 }



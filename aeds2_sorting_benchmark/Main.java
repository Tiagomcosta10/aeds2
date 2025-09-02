public class Main {
   public static void main(String[] args) {
      int[] tamanhos = {10, 1000, 10000, 100000};

      for (int tam : tamanhos) {
         System.out.println("\n=== Teste com " + tam + " elementos ===");

         testarAlgoritmo(new SelectionSort(tam), tam, "SelectionSort");
         testarAlgoritmo(new BubbleSort(tam), tam, "BubbleSort");
         testarAlgoritmo(new InsertionSort(tam), tam, "InsertionSort");
         testarAlgoritmo(new QuickSort(tam), tam, "QuickSort");
      }
   }

   private static void testarAlgoritmo(Geracao sortAlg, int tam, String nome) {
      sortAlg.aleatorio();
      long inicio = System.currentTimeMillis();
      sortAlg.sort();
      long fim = System.currentTimeMillis();
      long tempo = fim - inicio;

      System.out.println(nome + ": " + tempo + " ms | Ordenado? " + sortAlg.isOrdenado());
   }
}

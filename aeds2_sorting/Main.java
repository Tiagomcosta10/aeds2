public class Main {
    public static void main(String[] args) {
        Geracao[] algoritmos = {
            new SelectionSort(10),
            new BubbleSort(10),
            new InsertionSort(10),
            new QuickSort(10),
            new MergeSort(10)
        };

        String[] nomes = {
            "SelectionSort", "BubbleSort", "InsertionSort", "QuickSort", "MergeSort"
        };

        for (int i = 0; i < algoritmos.length; i++) {
            algoritmos[i].aleatorio();
            System.out.println(nomes[i] + ":");
            algoritmos[i].mostrar();

            long inicio = algoritmos[i].now();
            algoritmos[i].sort();
            long fim = algoritmos[i].now();

            algoritmos[i].mostrar();
            System.out.println("Ordenado? " + algoritmos[i].isOrdenado());
            System.out.println("Tempo: " + (fim - inicio) + " ms\n");
        }
    }
}

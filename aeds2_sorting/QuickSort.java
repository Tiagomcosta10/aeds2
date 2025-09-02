public class QuickSort extends Geracao {
    public QuickSort() { super(); }
    public QuickSort(int tamanho) { super(tamanho); }

    @Override
    public void sort() {
        quicksort(0, n - 1);
    }

    private void quicksort(int esq, int dir) {
        int i = esq, j = dir;
        int pivo = array[(esq + dir) / 2];
        while (i <= j) {
            while (array[i] < pivo) i++;
            while (array[j] > pivo) j--;
            if (i <= j) {
                swap(i, j);
                i++;
                j--;
            }
        }
        if (esq < j) quicksort(esq, j);
        if (i < dir) quicksort(i, dir);
    }
}

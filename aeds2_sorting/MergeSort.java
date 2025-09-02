public class MergeSort extends Geracao {
    public MergeSort() { super(); }
    public MergeSort(int tamanho) { super(tamanho); }

    @Override
    public void sort() {
        mergesort(0, n - 1);
    }

    private void mergesort(int esq, int dir) {
        if (esq < dir) {
            int meio = (esq + dir) / 2;
            mergesort(esq, meio);
            mergesort(meio + 1, dir);
            intercalar(esq, meio, dir);
        }
    }

    private void intercalar(int esq, int meio, int dir) {
        int n1 = meio - esq + 1;
        int n2 = dir - meio;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) L[i] = array[esq + i];
        for (int j = 0; j < n2; j++) R[j] = array[meio + 1 + j];

        int i = 0, j = 0, k = esq;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) array[k++] = L[i++];
            else array[k++] = R[j++];
        }

        while (i < n1) array[k++] = L[i++];
        while (j < n2) array[k++] = R[j++];
    }
}

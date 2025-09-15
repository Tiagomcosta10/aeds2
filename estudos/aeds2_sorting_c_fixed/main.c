#include <stdio.h>
#include <stdlib.h>
#include "geracao.h"
#include "selection_sort.h"
#include "bubble_sort.h"
#include "insertion_sort.h"
#include "quick_sort.h"
#include "merge_sort.h"

int main() {
    int n = 10;
    int arr[n];

    gerarVetor(arr, n);

    printf("Vetor original:\n");
    imprimirVetor(arr, n);

    // Selection Sort
    selectionSort(arr, n);
    printf("\nOrdenado com Selection Sort:\n");
    imprimirVetor(arr, n);

    // Bubble Sort
    gerarVetor(arr, n);
    bubbleSort(arr, n);
    printf("\nOrdenado com Bubble Sort:\n");
    imprimirVetor(arr, n);

    // Insertion Sort
    gerarVetor(arr, n);
    insertionSort(arr, n);
    printf("\nOrdenado com Insertion Sort:\n");
    imprimirVetor(arr, n);

    // Quick Sort
    gerarVetor(arr, n);
    quickSort(arr, 0, n - 1);
    printf("\nOrdenado com Quick Sort:\n");
    imprimirVetor(arr, n);

    // Merge Sort
    gerarVetor(arr, n);
    mergeSort(arr, 0, n - 1);
    printf("\nOrdenado com Merge Sort:\n");
    imprimirVetor(arr, n);

    return 0;
}

#include <iostream>
#include <vector>
#include <utility> // Para usar a função std::swap

// Função para imprimir os elementos do vetor na tela
void imprimirVetor(const std::vector<int>& array) {
    for (int elemento : array) {
        std::cout << elemento << " ";
    }
    std::cout << std::endl;
}

// Função que implementa o Selection Sort
void selectionSort(std::vector<int>& array) {
    int n = array.size();

    // Este é o seu código:
    for (int i = 0; i < (n - 1); i++) {
        int menor = i; // Assume que o menor é o primeiro elemento da parte não ordenada
        
        // Loop interno para encontrar o menor elemento no restante do vetor
        for (int j = (i + 1); j < n; j++) {
            if (array[menor] > array[j]) {
                menor = j; // Encontrou um elemento menor, atualiza o índice
            }
        }

        // Troca o menor elemento encontrado com o elemento da posição i
        if (menor != i) {
            std::swap(array[menor], array[i]);
        }
    }
}

int main() {
    // Vetor de exemplo que queremos ordenar
    std::vector<int> meuVetor = {64, 25, 12, 22, 11};

    std::cout << "Vetor original: ";
    imprimirVetor(meuVetor);

    // Chama a função de ordenação
    selectionSort(meuVetor);

    std::cout << "Vetor ordenado: ";
    imprimirVetor(meuVetor);

    return 0;
}
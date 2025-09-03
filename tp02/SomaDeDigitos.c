#include <stdio.h> 
#include <string.h>  
#include <stdbool.h>  
#include <stdlib.h>   

//ela recebe um número e vai somando os dígitos dele
int somaDigitos(int numeroParaSomar) {
    
    //se o número for menor que 10, ele só tem um dígito. Então a soma é ele mesmo
    if (numeroParaSomar < 10) {
        return numeroParaSomar;
    
    //se o número for maior
    } else {
        // a gente pega o último dígito do número.
        int ultimoDigito = numeroParaSomar % 10;

        // remove o último dígito do número
        // a divisão de inteiros em C joga fora a parte decimal
        int restoDoNumero = numeroParaSomar / 10;

        //chama de novo para pegar o restante dos números
        int somaDoResto = somaDigitos(restoDoNumero);

        // o resultado final
        int resultadoFinal = ultimoDigito + somaDoResto;
        
        return resultadoFinal;
    }
}

//função para verificar se a entrada é "FIM"
bool isFim(const char* s){
    return (strcmp(s, "FIM") == 0);
}

//função main principal
int main() {
    char entradaComoTexto[1000];

    // roda enquanto a gente conseguir ler uma linha de texto
    while (fgets(entradaComoTexto, 1000, stdin) != NULL) {
        
        // tira o '\n' (quebra de linha) que o fgets coloca no final
        entradaComoTexto[strcspn(entradaComoTexto, "\n")] = '\0';

        // verifica se a condição de parada "FIM" foi atingida
        if(isFim(entradaComoTexto)){
            break; // se for "FIM", sai do laço
        }

        // converte o texto que lemos para um número de verdade
        int numeroLido = atoi(entradaComoTexto);
        
        // faz a soma
        int resultadoDaSoma = somaDigitos(numeroLido);
        
        // mostra o resultado na tela
        printf("%d\n", resultadoDaSoma);
    }

    return 0; 
}

// Tiago Morais Costa
// Matrícula: 867656


#include <stdio.h>
#include <string.h>
#include <stdbool.h>
#include <ctype.h>

//ajudante
bool palindromoRecursivo(char* texto, int esquerda, int direita);


bool isPalindromo(char* s) { // chama o main
    int tamanho = strlen(s);

    return palindromoRecursivo(s, 0, tamanho - 1); // começa na ponta da string
}


bool palindromoRecursivo(char* texto, int esquerda, int direita) {
    //condição de parada
    if (esquerda >= direita) {
        return true;
    }

    //ignorar pontos e espaços
    else if (!isalpha(texto[esquerda])) {
        return palindromoRecursivo(texto, esquerda + 1, direita);
    }

    else if (!isalpha(texto[direita])) {
        return palindromoRecursivo(texto, esquerda, direita - 1);
    }

    //COMPARAÇÃO 
    else if (texto[esquerda] != texto[direita]) {
        // se as letras forem diferentes não é palindromo
        return false;
    }
    
    // Se tudo foi verificado avança
    else {
        return palindromoRecursivo(texto, esquerda + 1, direita - 1);
    }
}

bool isFim(char* s) {
    return (strcmp(s, "FIM") == 0); //finaliza no FIM
}

int main() {
    char entrada[1000];

    
    while (fgets(entrada, 1000, stdin) != NULL) {
        entrada[strcspn(entrada, "\n")] = '\0';

        if (isFim(entrada)) {
            break; 
        }

        if (isPalindromo(entrada)) { //imprime
            printf("SIM\n");
        } else {
            printf("NAO\n");
        }
    }
    return 0;
}
// Tiago Morais Costa
//Matrícula: 867656
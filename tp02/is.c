#include <stdio.h>
#include <string.h>
#include <stdbool.h> 
#include <ctype.h>   

bool ehvogal(char caractere) {
    caractere = tolower(caractere); // joga o caractere pra minusculo
    return (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u');
}

// ve se a palavra toda é so de vogal
bool isvogal(const char* texto) {
    bool resposta = true; // a gente assume que é verdade, e tenta provar que é mentira
    int tamanho = strlen(texto);

    // roda a palavra letra por letra
    for (int i = 0; i < tamanho; i++) {
        char letra_atual = texto[i];

        // se a letra atual nao for vogal
        if (ehvogal(letra_atual) == false) {
            resposta = false; // a resposta é falsa
            i = tamanho; // sai do for
        }
    }
    return resposta;
}

// ve se a palavra toda é so de consoante
bool isconsoante(const char* texto) {
    bool resposta = true;
    int tamanho = strlen(texto);

    for (int i = 0; i < tamanho; i++) {
        char letra_atual = texto[i];

        // pra ser consoante, tem que ser letra do alfabeto
        bool eh_letra_do_alfabeto = isalpha(letra_atual);
        // e nao pode ser vogal
        bool eh_uma_vogal = ehvogal(letra_atual);

        // se nao for letra ou se for uma vogal, entao ta errado
        if (eh_letra_do_alfabeto == false || eh_uma_vogal == true) {
            resposta = false;
            i = tamanho; // sai do for
        }
    }
    return resposta;
}

// essa aqui é pra ver se é um numero inteiro (so tem digitos de 0 a 9)
bool isinteiro(const char* texto) {
    bool resposta = true;
    int tamanho = strlen(texto);

    for (int i = 0; i < tamanho; i++) {
        char caractere_atual = texto[i];

        //usa isdigit pra ver se o caractere eh um numero de 0 a 9
        if (isdigit(caractere_atual) == false) {
            resposta = false;
            i = tamanho; // sai do for
        }
    }
    return resposta;
}

// essa aqui é pra ver se é um numero real 
bool isreal(const char* texto) {
    bool pode_ser_real = true;
    int contador_de_separador = 0; // pra contar quantos pontos ou virgulas tem
    int tamanho = strlen(texto);

    for (int i = 0; i < tamanho; i++) {
        char caractere_atual = texto[i];

        // primeiro, a gente ve se eh um numero
        if (isdigit(caractere_atual) == true) {
            // se for numero, nao faz nada, so continua o loop
        } 
        // se nao for numero, a gente ve se é um ponto ou uma virgula
        else if (caractere_atual == '.' || caractere_atual == ',') {
            // se for um separador, aumenta nosso contador
            contador_de_separador = contador_de_separador + 1;
        } 
        // se nao for nem numero nem separador, ja sabemos que eh falso
        else {
            pode_ser_real = false;
            i = tamanho; // sai do for
        }
    }

    // se tiver mais de um separador, nao pode ser real
    if (contador_de_separador > 1) {
        pode_ser_real = false;
    }

    return pode_ser_real;
}

//funcao main principal
int main() {
    char entrada_do_usuario[1000];

    // roda enquanto tiver linha
    while (fgets(entrada_do_usuario, 1000, stdin) != NULL) {
        
        // tira a quebra de linha
        entrada_do_usuario[strcspn(entrada_do_usuario, "\n")] = '\0';

        // chama as 4 funções
        bool x1 = isvogal(entrada_do_usuario);
        bool x2 = isconsoante(entrada_do_usuario);
        bool x3 = isinteiro(entrada_do_usuario);
        bool x4 = isreal(entrada_do_usuario);

       
        if(x1 == true){ printf("SIM "); } else { printf("NAO "); }
        if(x2 == true){ printf("SIM "); } else { printf("NAO "); }
        if(x3 == true){ printf("SIM "); } else { printf("NAO "); }
        if(x4 == true){ printf("SIM\n"); } else { printf("NAO\n"); }
    }

    return 0; 
}

// Tiago Morais Costa
// Matrícula: 867656


#include <stdio.h>
#include <string.h>
#include <stdbool.h> 
#include <ctype.h>   

bool ehvogal(char caractere) {
    caractere = tolower(caractere); // joga o caractere pra minusculo
    return (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u');
}

// Funções recursivas
bool isvogalRec(const char* texto, int i) {
    // caso base: se chegamos no fim da string, deu tudo certo
    if (texto[i] == '\0') {
        return true;
    }
    // se o caractere atual nao for vogal, a gente ja para e retorna falso
    if (ehvogal(texto[i]) == false) {
        return false;
    }
    // se for vogal, a gente chama de novo pra ver o proximo caractere
    return isvogalRec(texto, i + 1);
}

bool isconsoanteRec(const char* texto, int i) {
    if (texto[i] == '\0') {
        return true;
    }
    bool eh_letra = isalpha(texto[i]);
    bool eh_uma_vogal = ehvogal(texto[i]);

    // se nao for letra ou se for uma vogal, ja ta errado
    if (eh_letra == false || eh_uma_vogal == true) {
        return false;
    }
    return isconsoanteRec(texto, i + 1);
}

bool isinteiroRec(const char* texto, int i) {
    if (texto[i] == '\0') {
        return true;
    }
    // se o caractere nao for um numero, retorna falso
    if (isdigit(texto[i]) == false) {
        return false;
    }
    return isinteiroRec(texto, i + 1);
}

bool isrealRec(const char* texto, int i, int contador_separador) {
    // se ja achamos mais de um ponto/virgula, nao eh real
    if (contador_separador > 1) {
        return false;
    }
    if (texto[i] == '\0') {
        return true;
    }

    if (isdigit(texto[i])) {
        // se for numero, continua sem mudar o contador
        return isrealRec(texto, i + 1, contador_separador);
    } 
    else if (texto[i] == '.' || texto[i] == ',') {
        // se for separador, continua e aumenta o contador
        return isrealRec(texto, i + 1, contador_separador + 1);
    }
    // se for qualquer outra coisa, eh falso
    return false;
}

// Funções principais que iniciam a recursão
bool isvogal(const char* texto) {
    return isvogalRec(texto, 0);
}
bool isconsoante(const char* texto) {
    return isconsoanteRec(texto, 0);
}
bool isinteiro(const char* texto) {
    return isinteiroRec(texto, 0);
}
bool isreal(const char* texto) {
    return isrealRec(texto, 0, 0); // começa o contador de separadores com 0
}

//funcao main principal
int main() {
    char entrada_do_usuario[1000];

    // roda enquanto tiver linha
    while (fgets(entrada_do_usuario, 1000, stdin) != NULL) {
        
        // tira a quebra de linha
        entrada_do_usuario[strcspn(entrada_do_usuario, "\n")] = '\0';

      
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
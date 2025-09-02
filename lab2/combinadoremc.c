#include <stdio.h>
#include <string.h>
#include <stdlib.h>


char* combinar(const char* str1, const char* str2) {
    int len1 = strlen(str1);  //recebe uma string 
    int len2 = strlen(str2);  //recebe segunda string
    char* resultado = (char*) malloc(len1 + len2 + 1); // cria uma nova com das duas

    int i = 0, j = 0, k = 0;

    while (i < len1 && j < len2) {
        resultado[k++] = str1[i++];
        resultado[k++] = str2[j++];
    }

    while (i < len1) {
        resultado[k++] = str1[i++];
    }

    while (j < len2) {
        resultado[k++] = str2[j++];
    }

    resultado[k] = '\0';

    return resultado;
}


int main() {
    char str1[51], str2[51];

    while (scanf("%50s %50s", str1, str2) != EOF) {
        char* combinado = combinar(str1, str2);

        printf("%s\n", combinado);

        free(combinado);
    }

    return 0;
}
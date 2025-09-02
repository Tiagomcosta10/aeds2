#include <stdio.h>
#include <string.h>

int ehPalindromo(const char s[]) {
    int i = 0;
    int j = strlen(s) - 1;

    while (i < j) {
        if (s[i] != s[j]) {
            return 0; // Não é palíndromo
        }
        i++;
        j--;
    }
    return 1; // É palíndromo
}

int main() {
    char linha[1001]; // Buffer para linhas até 1000 caracteres

    while (fgets(linha, sizeof(linha), stdin) != NULL) {
        // Remove quebra de linha do final (se existir)
        linha[strcspn(linha, "\n")] = '\0';

        // Se for "FIM", encerra
        if (strcmp(linha, "FIM") == 0) {
            break;
        }

        if (ehPalindromo(linha)) {
            printf("SIM\n");
        } else {
            printf("NAO\n");
        }
    }

    return 0;
}

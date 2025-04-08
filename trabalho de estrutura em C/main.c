#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "ponto_descarte.h"

int main() {
    FILE* arquivo = fopen("pontos_de_descartes.txt", "r");
    if (!arquivo) {
        printf("Erro ao abrir o arquivo.\n");
        return 1;
    }

    char linha[256];
    char nome[100], endereco[100], tipo_material[30];
    char criterio[30];

    printf("Digite o tipo de material a buscar (ex: Plastico, Vidro, Eletronicos): ");
    scanf("%s", criterio);

    Ponto* lista = NULL;

    while (fgets(linha, sizeof(linha), arquivo)) {
      char* token = strtok(linha, ";");
if (token) strcpy(nome, token);

token = strtok(NULL, ";");
if (token) strcpy(endereco, token);

token = strtok(NULL, ";\n");
if (token) strcpy(tipo_material, token);

// Remove \n do criterio se tiver
criterio[strcspn(criterio, "\n")] = '\0';
tipo_material[strcspn(tipo_material, "\n")] = '\0';

// Comparacao sem considerar maiusculas/minusculas
if (strcasecmp(tipo_material, criterio) == 0) {
    lista = inserir_ponto(lista, nome, endereco, tipo_material);
}

    }

    fclose(arquivo);

    printf("\nPontos de descarte encontrados:\n\n");
    exibir_lista(lista);
    liberar_lista(lista);

    return 0;
}


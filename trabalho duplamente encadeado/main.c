#include "lista_duplamente_encadeada.h"

#define ARQUIVO "rotas_de_transportes.txt"
#define FILTRO "Onibus" 

int main() {
    ListaDupla lista;
    inicializarLista(&lista);
    
    FILE *file = fopen(ARQUIVO, "r");
    if (!file) {
        printf("Erro ao abrir o arquivo %s\n", ARQUIVO);
        return 1;
    }
    
    char linha[100];
    while (fgets(linha, sizeof(linha), file)) {
        linha[strcspn(linha, "\n")] = 0; 
        if (strstr(linha, FILTRO)) {
            inserirFim(&lista, linha);
        }
    }
    fclose(file);
    
    printf("Rotas cadastradas:\n");
    exibirOrdem(&lista);
    
    printf("\nRotas em ordem reversa:\n");
    exibirReverso(&lista);
    
    liberarLista(&lista);
    return 0;
}


#include <stdio.h>
#include <stdlib.h>
#include "rodizio.h"

int main() {
    ListaCircular lista;
    inicializarLista(&lista);

    FILE *arquivo = fopen("rodizio_de_veiculos.txt", "r");
    if (!arquivo) {
        printf("Erro ao abrir o arquivo\n");
        return 1;
    }

    char placa[8];
    int dia;
    while (fscanf(arquivo, "%s %d", placa, &dia) != EOF) {
        inserirVeiculo(&lista, placa, dia);
    }
    fclose(arquivo);

    int opcao, diaConsulta;
    do {
        printf("\nMenu:\n");
        printf("1 - Exibir todos os veiculos\n");
        printf("2 - Buscar por dia\n");
        printf("3 - Sair\n");
        printf("Escolha: ");
        scanf("%d", &opcao);

        switch (opcao) {
            case 1:
                imprimirLista(&lista);
                break;
            case 2:
                printf("Digite o dia do rodizio (1-5): ");
                scanf("%d", &diaConsulta);
                buscarPorDia(&lista, diaConsulta);
                break;
            case 3:
                printf("Saindo...\n");
                break;
            default:
                printf("Opcao invalida!\n");
        }
    } while (opcao != 3);

    liberarLista(&lista);
    return 0;
}


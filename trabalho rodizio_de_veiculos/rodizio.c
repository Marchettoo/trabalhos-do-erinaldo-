#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "rodizio.h"

void inicializarLista(ListaCircular *lista) {
    lista->atual = NULL;
}

void inserirVeiculo(ListaCircular *lista, const char *placa, int diaRodizio) {
    Veiculo *novo = (Veiculo *)malloc(sizeof(Veiculo));
    if (!novo) {
        printf("Erro ao alocar memoria\n");
        return;
    }
    strcpy(novo->placa, placa);
    novo->diaRodizio = diaRodizio;

    if (lista->atual == NULL) {
        novo->prox = novo;
        lista->atual = novo;
    } else {
        Veiculo *temp = lista->atual;
        while (temp->prox != lista->atual) {
            temp = temp->prox;
        }
        temp->prox = novo;
        novo->prox = lista->atual;
    }
}

void imprimirLista(const ListaCircular *lista) {
    if (lista->atual == NULL) {
        printf("Lista vazia\n");
        return;
    }
    Veiculo *temp = lista->atual;
    do {
        printf("Placa: %s - Dia do rodizio: %d\n", temp->placa, temp->diaRodizio);
        temp = temp->prox;
    } while (temp != lista->atual);
}

void buscarPorDia(const ListaCircular *lista, int dia) {
    if (lista->atual == NULL) {
        printf("Lista vazia\n");
        return;
    }
    Veiculo *temp = lista->atual;
    int encontrou = 0;
    do {
        if (temp->diaRodizio == dia) {
            printf("Placa: %s - Dia do rodizio: %d\n", temp->placa, temp->diaRodizio);
            encontrou = 1;
        }
        temp = temp->prox;
    } while (temp != lista->atual);
    
    if (!encontrou) {
        printf("Nenhum veiculo encontrado para o dia %d\n", dia);
    }
}

void liberarLista(ListaCircular *lista) {
    if (lista->atual == NULL) return;

    Veiculo *temp = lista->atual;
    Veiculo *aux;
    do {
        aux = temp->prox;
        free(temp);
        temp = aux;
    } while (temp != lista->atual);

    lista->atual = NULL;
}


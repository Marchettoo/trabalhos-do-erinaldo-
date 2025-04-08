#include "lista_duplamente_encadeada.h"

void inicializarLista(ListaDupla *lista) {
    lista->inicio = NULL;
    lista->fim = NULL;
}

void inserirFim(ListaDupla *lista, char *rota) {
    No *novo = (No *)malloc(sizeof(No));
    if (!novo) {
        printf("Erro de alocacao de memoria.\n");
        return;
    }
    strcpy(novo->rota, rota);
    novo->prox = NULL;
    novo->ant = lista->fim;
    
    if (lista->fim)
        lista->fim->prox = novo;
    else
        lista->inicio = novo;
    
    lista->fim = novo;
}

void exibirOrdem(ListaDupla *lista) {
    No *atual = lista->inicio;
    while (atual) {
        printf("%s\n", atual->rota);
        atual = atual->prox;
    }
}

void exibirReverso(ListaDupla *lista) {
    No *atual = lista->fim;
    while (atual) {
        printf("%s\n", atual->rota);
        atual = atual->ant;
    }
}

void liberarLista(ListaDupla *lista) {
    No *atual = lista->inicio;
    while (atual) {
        No *temp = atual;
        atual = atual->prox;
        free(temp);
    }
    lista->inicio = NULL;
    lista->fim = NULL;
}


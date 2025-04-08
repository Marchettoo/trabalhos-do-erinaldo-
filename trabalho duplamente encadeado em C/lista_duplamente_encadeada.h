#ifndef LISTA_DUPLAMENTE_ENCADEADA_H
#define LISTA_DUPLAMENTE_ENCADEADA_H

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct No {
    char rota[100];
    struct No *prox;
    struct No *ant;
} No;

typedef struct {
    No *inicio;
    No *fim;
} ListaDupla;

void inicializarLista(ListaDupla *lista);
void inserirFim(ListaDupla *lista, char *rota);
void exibirOrdem(ListaDupla *lista);
void exibirReverso(ListaDupla *lista);
void liberarLista(ListaDupla *lista);

#endif

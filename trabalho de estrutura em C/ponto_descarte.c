#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "ponto_descarte.h"

Ponto* inserir_ponto(Ponto* lista, char* nome, char* endereco, char* tipo_material) {
    Ponto* novo = (Ponto*) malloc(sizeof(Ponto));
    if (!novo) return lista;

    strcpy(novo->nome, nome);
    strcpy(novo->endereco, endereco);
    strcpy(novo->tipo_material, tipo_material);
    novo->prox = lista;

    return novo;
}

void exibir_lista(Ponto* lista) {
    Ponto* atual = lista;
    while (atual != NULL) {
        printf("Nome: %s\nEndereco: %s\nTipo de material: %s\n\n",
            atual->nome, atual->endereco, atual->tipo_material);
        atual = atual->prox;
    }
}

void liberar_lista(Ponto* lista) {
    Ponto* temp;
    while (lista != NULL) {
        temp = lista;
        lista = lista->prox;
        free(temp);
    }
}


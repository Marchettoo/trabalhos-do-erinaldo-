#ifndef PONTO_DESCARTE_H
#define PONTO_DESCARTE_H

typedef struct Ponto {
    char nome[100];
    char endereco[100];
    char tipo_material[30];
    struct Ponto* prox;
} Ponto;

Ponto* inserir_ponto(Ponto* lista, char* nome, char* endereco, char* tipo_material);
void exibir_lista(Ponto* lista);
void liberar_lista(Ponto* lista);

#endif


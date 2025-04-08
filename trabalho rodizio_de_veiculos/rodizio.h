#ifndef RODIZIO_H
#define RODIZIO_H

typedef struct Veiculo {
    char placa[8];
    int diaRodizio;
    struct Veiculo *prox;
} Veiculo;

typedef struct {
    Veiculo *atual;
} ListaCircular;

void inicializarLista(ListaCircular *lista);
void inserirVeiculo(ListaCircular *lista, const char *placa, int diaRodizio);
void imprimirLista(const ListaCircular *lista);
void buscarPorDia(const ListaCircular *lista, int dia);
void liberarLista(ListaCircular *lista);

#endif


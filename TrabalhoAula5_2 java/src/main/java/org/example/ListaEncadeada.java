package org.example;

class ListaEncadeada {
    private No inicio;

    public ListaEncadeada() {
        this.inicio = null;
    }

    public void inserir(String nome, String endereco, String tipoMaterial) {
        No novoNo = new No(nome, endereco, tipoMaterial);
        if (inicio == null) {
            inicio = novoNo;
        } else {
            No atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNo;
        }
    }

    public void exibir() {
        No atual = inicio;
        while (atual != null) {
            System.out.println("Nome: " + atual.nome + ", Endereço: " + atual.endereco + ", Tipo: " + atual.tipoMaterial);
            atual = atual.proximo;
        }
    }
}


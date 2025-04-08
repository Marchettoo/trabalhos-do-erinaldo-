package org.example;

class No {
    int id;
    String nomeLinha;
    String tipo;
    String regiao;
    No anterior;
    No proximo;

    public No(int id, String nomeLinha, String tipo, String regiao) {
        this.id = id;
        this.nomeLinha = nomeLinha;
        this.tipo = tipo;
        this.regiao = regiao;
        this.anterior = null;
        this.proximo = null;
    }
}

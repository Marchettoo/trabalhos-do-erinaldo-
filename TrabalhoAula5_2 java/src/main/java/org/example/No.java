package org.example;

class No {
    String nome;
    String endereco;
    String tipoMaterial;
    No proximo;

    public No(String nome, String endereco, String tipoMaterial) {
        this.nome = nome;
        this.endereco = endereco;
        this.tipoMaterial = tipoMaterial;
        this.proximo = null;
    }
}


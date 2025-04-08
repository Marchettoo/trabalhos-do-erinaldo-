package org.example;

class Veiculo {
    String placa;
    String diaRestricao;
    String horarioRestricao;
    Veiculo proximo;

    public Veiculo(String placa, String diaRestricao, String horarioRestricao) {
        this.placa = placa;
        this.diaRestricao = diaRestricao;
        this.horarioRestricao = horarioRestricao;
        this.proximo = null;
    }
}

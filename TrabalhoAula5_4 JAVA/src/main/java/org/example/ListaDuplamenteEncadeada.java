package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ListaDuplamenteEncadeada {
    private No cabeca;
    private No cauda;

    public void inserir(int id, String nomeLinha, String tipo, String regiao) {
        No novoNo = new No(id, nomeLinha, tipo, regiao);
        if (cabeca == null) {
            cabeca = cauda = novoNo;
        } else {
            cauda.proximo = novoNo;
            novoNo.anterior = cauda;
            cauda = novoNo;
        }
    }

    public void carregarRotasDeArquivo(String nomeArquivo, String filtro) {
        try (BufferedReader br = new BufferedReader(new FileReader("rotas_de_transportes"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");
                if (dados.length == 4) {
                    int id = Integer.parseInt(dados[0]);
                    String nomeLinha = dados[1];
                    String tipo = dados[2];
                    String regiao = dados[3];
                    if (tipo.equalsIgnoreCase(filtro) || regiao.equalsIgnoreCase(filtro)) {
                        inserir(id, nomeLinha, tipo, regiao);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    public void exibirListaEmOrdem() {
        if (cabeca == null) {
            System.out.println("Nenhuma rota encontrada.");
            return;
        }
        No atual = cabeca;
        while (atual != null) {
            System.out.println(atual.id + " - " + atual.nomeLinha + " (" + atual.tipo + ") - " + atual.regiao);
            atual = atual.proximo;
        }
    }

    public void exibirListaEmOrdemInversa() {
        if (cauda == null) {
            System.out.println("Nenhuma rota encontrada.");
            return;
        }
        No atual = cauda;
        while (atual != null) {
            System.out.println(atual.id + " - " + atual.nomeLinha + " (" + atual.tipo + ") - " + atual.regiao);
            atual = atual.anterior;
        }
    }

    public void liberarLista() {
        No atual = cabeca;
        while (atual != null) {
            No proximo = atual.proximo;
            atual.anterior = null;
            atual.proximo = null;
            atual = proximo;
        }
        cabeca = cauda = null;
    }
}

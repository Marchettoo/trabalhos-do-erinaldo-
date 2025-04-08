package org.example;

import java.io.*;
import java.util.Scanner;

public class GerenciadorDescarte {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tipo de material a buscar (Plástico, Vidro, Eletrônicos e Papel.): ");
        String tipoBusca = scanner.nextLine().trim();

        try (BufferedReader br = new BufferedReader(new FileReader("pontos_de_descartes"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");
                if (dados.length == 3) {
                    String nome = dados[0].trim();
                    String endereco = dados[1].trim();
                    String tipoMaterial = dados[2].trim();
                    if (tipoMaterial.equalsIgnoreCase(tipoBusca)) {
                        lista.inserir(nome, endereco, tipoMaterial);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        System.out.println("\nPontos de descarte encontrados:");
        lista.exibir();
        scanner.close();
    }
}

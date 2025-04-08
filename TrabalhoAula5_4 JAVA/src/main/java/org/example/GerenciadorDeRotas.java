package org.example;

import java.util.Scanner;

public class GerenciadorDeRotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        System.out.print("Digite o tipo de transporte ou região desejada: ");
        String filtro = scanner.nextLine();

        lista.carregarRotasDeArquivo("rotas_de_transportes", filtro);

        System.out.println("\nRotas na ordem normal:");
        lista.exibirListaEmOrdem();

        System.out.println("\nRotas na ordem inversa:");
        lista.exibirListaEmOrdemInversa();

        lista.liberarLista();
        scanner.close();
    }
}


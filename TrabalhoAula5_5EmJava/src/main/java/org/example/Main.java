package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaCircular lista = new ListaCircular();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o critério de filtragem:");
        System.out.println("1 - Por dia da semana");
        System.out.println("2 - Por final de placa");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        String criterio = "";
        if (opcao == 1) {
            System.out.print("Digite o dia da semana (ex: Segunda-feira): ");
            criterio = scanner.nextLine().trim();
        } else if (opcao == 2) {
            System.out.print("Digite o final da placa (ex: 4): ");
            criterio = scanner.nextLine().trim();
        } else {
            System.out.println("Opção inválida.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("rodizio_de_veiculos"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] partes = linha.split(";");
                if (partes.length == 3) {
                    String placa = partes[0];
                    String dia = partes[1];
                    String horario = partes[2];

                    if ((opcao == 1 && dia.equalsIgnoreCase(criterio)) ||
                            (opcao == 2 && placa.endsWith(criterio))) {
                        lista.inserir(placa, dia, horario);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        System.out.println("\n=== Veículos que atendem ao critério ===");
        lista.exibir();

        System.out.println("\nDeseja navegar continuamente pela lista? (s/n)");
        String navegar = scanner.nextLine();
        if (navegar.equalsIgnoreCase("s")) {
            lista.navegar();
        }

        lista.liberar();
        System.out.println("Programa finalizado.");
    }
}
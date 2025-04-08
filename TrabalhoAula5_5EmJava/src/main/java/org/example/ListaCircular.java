package org.example;

import java.util.Scanner;

class ListaCircular {
    private Veiculo inicio = null;

    public void inserir(String placa, String dia, String horario) {
        Veiculo novo = new Veiculo(placa, dia, horario);
        if (inicio == null) {
            inicio = novo;
            inicio.proximo = inicio;
        } else {
            Veiculo temp = inicio;
            while (temp.proximo != inicio) {
                temp = temp.proximo;
            }
            temp.proximo = novo;
            novo.proximo = inicio;
        }
    }

    public void exibir() {
        if (inicio == null) {
            System.out.println("Lista vazia.");
            return;
        }
        Veiculo temp = inicio;
        do {
            System.out.println("Placa: " + temp.placa + " | Dia: " + temp.diaRestricao + " | Horário: " + temp.horarioRestricao);
            temp = temp.proximo;
        } while (temp != inicio);
    }

    public void navegar() {
        if (inicio == null) {
            System.out.println("Nenhum veículo para navegar.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        Veiculo atual = inicio;

        while (true) {
            System.out.println("Placa: " + atual.placa + " | Dia: " + atual.diaRestricao + " | Horário: " + atual.horarioRestricao);
            System.out.println("Pressione ENTER para próximo, digite 'sair' para encerrar:");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("sair")) break;
            atual = atual.proximo;
        }
    }

    public void buscarPorDia(String dia) {
        if (inicio == null) {
            System.out.println("Lista vazia.");
            return;
        }
        Veiculo temp = inicio;
        boolean encontrado = false;
        do {
            if (temp.diaRestricao.equalsIgnoreCase(dia)) {
                System.out.println("Placa: " + temp.placa + " | Horário: " + temp.horarioRestricao);
                encontrado = true;
            }
            temp = temp.proximo;
        } while (temp != inicio);
        if (!encontrado) {
            System.out.println("Nenhum veículo encontrado para o dia: " + dia);
        }
    }

    public void liberar() {
        inicio = null;
    }
}

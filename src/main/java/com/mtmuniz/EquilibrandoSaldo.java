package com.mtmuniz;

import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoAtual = scanner.nextDouble();
        double valorDeposito = scanner.nextDouble();
        double valorRetirada = scanner.nextDouble();

        saldoAtual += valorDeposito;
        double saldoAtualizado = saldoAtual - valorRetirada;

        System.out.printf("Saldo atualizado na conta: %.1f %n",  saldoAtualizado);

    }
}
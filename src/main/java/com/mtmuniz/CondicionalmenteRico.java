package com.mtmuniz;

import java.util.Scanner;

public class CondicionalmenteRico {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int saldoTotal = scanner.nextInt();
        int valorSaque = scanner.nextInt();
        int saldoDisponivel = saldoTotal - valorSaque;

        if(saldoTotal > valorSaque) {
            System.out.println("Saque realizado com sucesso. Novo saldo: " + saldoDisponivel);
        } else {
            System.out.println("Saldo insuficiente. Saque nao realizado!");
        }
    }
}

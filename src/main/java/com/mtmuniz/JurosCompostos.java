package com.mtmuniz;

import java.util.Scanner;

public class JurosCompostos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorInicial = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();

        int periodo = scanner.nextInt();
        double valorFinal = valorInicial;

        for (int i = 0; i < periodo; i++) {
            valorInicial += valorInicial*taxaJuros;
            valorFinal = valorInicial;
        }
        System.out.printf("Valor final do investimento: R$ %.2f" , valorFinal);
        scanner.close();
    }
}

package com.mtmuniz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BancoOrganizadorAtivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> ativos = new ArrayList<>();

        int quantidadeAtivos = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < quantidadeAtivos; i++) {
            String codigoAtivo = scanner.nextLine();
            ativos.add(codigoAtivo);
        }

        Collections.sort(ativos);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ativos);

        for (int i = 0; i < ativos.toArray().length; i++) {
            stringBuilder.append(ativos.get(i));
            System.out.println(ativos.get(i));
        }
    }
}

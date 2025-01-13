package com.nascimento.dio.iniciante.challenge1985;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MacPronalts {
    private static Map<Integer, Double> cardapio = new HashMap<>();

    public static void main(String[] args) {
        gerarCardapio();
        try(Scanner entrada = new Scanner(System.in)){
            int itens = entrada.nextInt();
            double total = 0.0;

            for(int i = 0; i < itens; i++){
                int codigoItem = entrada.nextInt();
                int quantidade = entrada.nextInt();

                total += (cardapio.get(codigoItem)*quantidade);
            }
            System.out.printf("%.2f", total);
        }
    }

    private static void gerarCardapio() {
        cardapio.put(1001, 1.5);
        cardapio.put(1002, 2.5);
        cardapio.put(1003, 3.5);
        cardapio.put(1004, 4.5);
        cardapio.put(1005, 5.5);

    }
}

package com.nascimento.dio.iniciante.challenge2374;

import java.util.Scanner;

public class Pneu {
    public static void main(String[] args) {

        try(Scanner entrada = new Scanner(System.in)){
            int pressaoDesejada = entrada.nextInt();
            int pressaoAtual = entrada.nextInt();

            int ajusteDePressao = pressaoDesejada - pressaoAtual;
            System.out.println(ajusteDePressao);
        }
    }
}

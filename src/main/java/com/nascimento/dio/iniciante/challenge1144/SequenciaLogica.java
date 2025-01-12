package com.nascimento.dio.iniciante.challenge1144;

import java.util.Scanner;

public class SequenciaLogica {
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
            int valor = entrada.nextInt();

            for(int i = 1; i<=valor;i++){
                System.out.printf("%d %d %d%n", i, i*i, i*i*i);
                System.out.printf("%d %d %d%n", i, (i*i)+1, (i*i*i)+1);
            }
        }
    }
}

package com.nascimento.dio.iniciante.challenge2413;

import java.util.Scanner;

public class BuscaNaInternet {
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
            int quantidadeDePessoas = entrada.nextInt();

            quantidadeDePessoas *= 4;

            System.out.println(quantidadeDePessoas);
        }
    }
}

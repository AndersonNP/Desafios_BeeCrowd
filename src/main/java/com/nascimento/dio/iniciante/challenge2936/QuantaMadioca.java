package com.nascimento.dio.iniciante.challenge2936;

import java.util.Scanner;

public class QuantaMadioca {
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
            int quantidadeCurupira = entrada.nextInt() * 300;
            int quantidadeBoitata = entrada.nextInt() * 1500;
            int quantidadeBoto = entrada.nextInt() * 600;
            int quantidadeMapinguari = entrada.nextInt() * 1000;
            int quantidadeIara = entrada.nextInt() * 150;
            int quantidadeChica = 225;

            int totalMandioca = quantidadeBoitata + quantidadeBoto + quantidadeIara + quantidadeCurupira + quantidadeMapinguari + quantidadeChica;

            System.out.println(totalMandioca);
        }
    }
}

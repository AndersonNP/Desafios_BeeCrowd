package com.nascimento.dio.iniciante.challenge2058;

import java.util.Scanner;

public class TriangulosEPoligonosRegulares {

    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
            int lados = entrada.nextInt();

            int qtdTriangulos = lados - 2;

            System.out.println(qtdTriangulos);
        }
    }
}

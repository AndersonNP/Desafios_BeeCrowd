package com.nascimento.dio.iniciante.challenge1478;

import java.util.Scanner;

public class MatrizQuadradaII {
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
            while (true){
                int ordemMatriz = entrada.nextInt();

                if(ordemMatriz == 0){
                    break;
                }

                StringBuilder resultado = new StringBuilder();

                for (int linha = 0; linha < ordemMatriz; linha++){
                    for (int coluna = 0; coluna < ordemMatriz; coluna++){
                        int valor = Math.abs(coluna-linha)+1;
                        if(coluna == 0){
                            resultado.append(String.format("%3d", valor));
                        }else {
                            resultado.append(String.format(" %3d", valor));
                        }
                    }
                    resultado.append("\n");
                }

                System.out.println(resultado);
            }
        }
    }
}

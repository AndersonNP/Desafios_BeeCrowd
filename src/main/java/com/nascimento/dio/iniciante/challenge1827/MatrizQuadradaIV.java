package com.nascimento.dio.iniciante.challenge1827;

import java.util.Scanner;

public class MatrizQuadradaIV {
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
            while (entrada.hasNext()){
                int ordemMatriz = entrada.nextInt();

                StringBuilder resultado = new StringBuilder();

                for(int linha = 0; linha < ordemMatriz; linha++){
                    for (int coluna = 0; coluna < ordemMatriz; coluna++){
                        String valor = getValor(linha, coluna, ordemMatriz);

                        resultado.append(valor);
                    }
                    resultado.append("\n");
                }
                System.out.println(resultado);
            }
        }
    }

    private static String getValor(int linha, int coluna, int ordemMatriz) {
        String valor = "0";

        if(linha == coluna){
            valor = "2";
        }

        if(linha + coluna == ordemMatriz -1){
            valor = "3";
        }

        if(linha >= ordemMatriz /3 && coluna >= ordemMatriz /3
                && linha <= (ordemMatriz -1)- ordemMatriz /3 && coluna <= (ordemMatriz -1)- ordemMatriz /3){
            valor = "1";
        }


        if (ordemMatriz % 2 != 0) {
            int posicaoCentral = (int) Math.ceil(ordemMatriz/2.0)-1;
            if(coluna == posicaoCentral && linha == posicaoCentral)
                valor = "4";
        }
        return valor;
    }
}

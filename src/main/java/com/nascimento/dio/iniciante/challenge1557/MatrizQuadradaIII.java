package com.nascimento.dio.iniciante.challenge1557;

import java.util.Scanner;

public class MatrizQuadradaIII {
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
            while (true){

                int ordemMatriz = entrada.nextInt();

                if(ordemMatriz == 0){
                    break;
                }

                int espacamento = String.valueOf((int) Math.pow(2, 2*ordemMatriz-2)).length();
                StringBuilder resultado = getMatriz(ordemMatriz, espacamento);

                System.out.println(resultado);
            }
        }
    }

    private static StringBuilder getMatriz(int ordemMatriz, int espacamento) {
        StringBuilder resultado = new StringBuilder();

        for(int linha = 0; linha < ordemMatriz; linha++){
            for (int coluna = 0; coluna < ordemMatriz; coluna++){
                int valor = (int) Math.pow(2, coluna+linha);
                String formato = " %"+ espacamento +"d";
                if(coluna==0){
                    formato = formato.trim();
                }
                resultado.append(String.format(formato, valor));
            }
            resultado.append("\n");
        }
        return resultado;
    }
}

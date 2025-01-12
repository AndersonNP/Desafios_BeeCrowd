package com.nascimento.dio.iniciante.challenge3105;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Scanner;

public class DobrandoPapel {
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
            BigDecimal comprimento = entrada.nextBigDecimal();
            BigDecimal largura = entrada.nextBigDecimal();
            BigDecimal comprimentoNovo = comprimento;
            BigDecimal larguraNova = largura;
            BigDecimal altura;
            BigDecimal constante = entrada.nextBigDecimal();
            BigDecimal quantidadeDobradurasHorizontais = BigDecimal.ZERO;
            BigDecimal quantidadeDobradurasVerticais = BigDecimal.ZERO;

            while (true){
                boolean dividirHorizontalmente = false;
                boolean dividirVerticalmente = false;
                if (comprimentoNovo.compareTo(larguraNova) > 0){
                    quantidadeDobradurasHorizontais = quantidadeDobradurasHorizontais.add(BigDecimal.ONE);
                    dividirHorizontalmente = true;
                }else {
                    quantidadeDobradurasVerticais = quantidadeDobradurasVerticais.add(BigDecimal.ONE);
                    dividirVerticalmente = true;
                }

                altura = (quantidadeDobradurasHorizontais.add(BigDecimal.ONE)).multiply(quantidadeDobradurasVerticais.add(BigDecimal.ONE));
                if(altura.compareTo(constante) > 0 ){
                    break;
                }

                comprimentoNovo = dividirHorizontalmente ? comprimento.divide(quantidadeDobradurasHorizontais.add(BigDecimal.ONE), 0, RoundingMode.CEILING) : comprimentoNovo;
                larguraNova = dividirVerticalmente ? largura.divide(quantidadeDobradurasVerticais.add(BigDecimal.ONE), 0, RoundingMode.CEILING) : larguraNova;

            }

            BigInteger valor = (comprimentoNovo.compareTo(larguraNova) > 0 ? comprimentoNovo : larguraNova).toBigInteger();

            System.out.println(valor);
        }
    }
}

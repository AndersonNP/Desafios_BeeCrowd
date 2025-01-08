package com.nascimento.dio.iniciante.challenge2867;

import java.math.BigInteger;
import java.util.Scanner;

public class Digitos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int testes = entrada.nextInt();
        for (int i = 0; i < testes; i++){
            BigInteger valor1 = BigInteger.valueOf(entrada.nextInt());
            int valor2 = entrada.nextInt();
            BigInteger total = valor1.pow(valor2);
            System.out.println(quantidadeDigitos(total));

        }
    }

    public static BigInteger quantidadeDigitos(BigInteger valor){
        valor = valor.divide(BigInteger.TEN);
        return valor.equals(BigInteger.ZERO) ? BigInteger.ONE : BigInteger.ONE.add(quantidadeDigitos(valor));
    }
}

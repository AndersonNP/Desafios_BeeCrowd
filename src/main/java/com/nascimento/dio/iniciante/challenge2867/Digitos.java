package com.nascimento.dio.iniciante.challenge2867;

public class Digitos {
    public static void main(String[] args) {

        System.out.println(quantidadeDigitos(123456));
    }

    public static long quantidadeDigitos(long valor){
        valor /= 10;
        return valor == 0 ? 1 : 1 + quantidadeDigitos(valor);
    }
}

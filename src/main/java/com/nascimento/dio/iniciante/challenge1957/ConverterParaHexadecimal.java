package com.nascimento.dio.iniciante.challenge1957;

import java.util.Scanner;

public class ConverterParaHexadecimal {
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
            int valor = entrada.nextInt();
            StringBuilder valorHexadecimal = new StringBuilder();
            while(valor != 0){
                int resto = valor%16;
                valor /= 16;
                valorHexadecimal.append(resto > 9 ? (char)('7' + resto) : (char)('0' + resto));
            }
            System.out.println(valorHexadecimal.reverse());
        }
    }
}

package com.nascimento.dio.iniciante.challenge3084;

import java.util.Scanner;

public class RelogioAntigo {
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
            while(entrada.hasNext()){
                int anguloHoras = entrada.nextInt();
                int anguloMinutos = entrada.nextInt();

                int hora = (int) Math.floor(anguloHoras/30.0);
                int minuto = (int) Math.floor(anguloMinutos/6.0);

                System.out.printf("%02d:%02d%n",hora,minuto);
            }
        }
    }
}

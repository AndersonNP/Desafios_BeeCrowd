package com.nascimento.dio.iniciante.challenge2709;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MoedasDeRobbie {
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
            while (entrada.hasNext()){
                int somatoria = 0;
                int quantidadeMoedas = entrada.nextInt();
                List<Integer> moedas = new ArrayList<>();
                for(int i = 0; i < quantidadeMoedas; i++){
                    int valorMoeda = entrada.nextInt();
                    moedas.add(valorMoeda);
                }
                int salto = entrada.nextInt();

                for (int i = quantidadeMoedas - 1; i >= 0; i -= salto) {
                    somatoria += moedas.get(i);
                }

                boolean isPrimo = isPrimo(somatoria);

                String resultado = isPrimo
                        ? "You’re a coastal aircraft, Robbie, a large silver aircraft."
                        : "Bad boy! I’ll hit you.";

                System.out.println(resultado);
            }
        }
    }

    private static boolean isPrimo(int valor) {

        if (valor < 2)
            return false;

        for(int i = 2; i < valor; i++){
            if (valor % i == 0) {
                return false;
            }
        }
        return true;
    }
}

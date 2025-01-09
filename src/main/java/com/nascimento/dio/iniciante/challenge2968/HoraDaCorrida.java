package com.nascimento.dio.iniciante.challenge2968;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HoraDaCorrida {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int voltas = entrada.nextInt();
        int qtdPlacas = entrada.nextInt();

        List<String> metas = new ArrayList<>();

        for(int i = 1; i < 10; i++){
            metas.add(String.valueOf((int) Math.ceil((voltas * qtdPlacas) * (i/10.0))));
        }

        System.out.println(String.join(" ", metas));
    }
}

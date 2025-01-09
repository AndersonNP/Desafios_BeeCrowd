package com.nascimento.dio.iniciante.challenge3068;

import java.util.Scanner;

public class Meteoros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int x1 = 0, y1 = 0, x2 = 0, y2 = 0, qtdTestes = 0;

        x1 = entrada.nextInt();
        y1 = entrada.nextInt();
        x2 = entrada.nextInt();
        y2 = entrada.nextInt();

        while (!(x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0)) {
            qtdTestes++;
            int qtdMeteoritosEncontrados = 0;

            int xMax = Math.max(x1, x2);
            int xMin = Math.min(x1, x2);
            int yMax = Math.max(y1, y2);
            int yMin = Math.min(y1, y2);

            int qtdMeteoritosCaidos = entrada.nextInt();

            for(int i = 1; i <= qtdMeteoritosCaidos; i++){
                int xM = entrada.nextInt();
                int yM = entrada.nextInt();

                if(xM >= xMin && yM <= yMax && xM <= xMax && yM >= yMin ){
                    qtdMeteoritosEncontrados++;
                }

                if(i == qtdMeteoritosCaidos){
                    System.out.println("Teste " + qtdTestes);
                    System.out.println(qtdMeteoritosEncontrados);
                }
            }

            x1 = entrada.nextInt();
            y1 = entrada.nextInt();
            x2 = entrada.nextInt();
            y2 = entrada.nextInt();
        }

    }
}

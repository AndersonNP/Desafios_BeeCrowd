package com.nascimento.dio.iniciante.challenge2632;

import java.util.*;

public class MagicAndSword {
    static Map<String, Magia> magias = new HashMap<>();
    public static void main(String[] args) {
        magias.put("fire",new Magia("fire", 200, Arrays.asList(20, 30, 50)));
        magias.put("water",new Magia("water", 300, Arrays.asList(10, 25, 40)));
        magias.put("earth",new Magia("earth", 400, Arrays.asList(25, 55, 70)));
        magias.put("air",new Magia("air", 100, Arrays.asList(18, 38, 60)));

        try(Scanner entrada = new Scanner(System.in)){
            int quantidadeTestes = entrada.nextInt();
            for(int teste = 0; teste < quantidadeTestes; teste++){
                int largura = entrada.nextInt();
                int altura = entrada.nextInt();
                int coordenadaXMinima = entrada.nextInt();
                int coordenadaYMinima = entrada.nextInt();
                int coordenadaXMaxima = coordenadaXMinima + largura;
                int coordenadaYMaxima = coordenadaYMinima + altura;

                String magia = entrada.next();
                int nivel = entrada.nextInt();
                int cX = entrada.nextInt();
                int cY = entrada.nextInt();

                int pontMaisProximoX = Math.max(coordenadaXMinima, Math.min(cX, coordenadaXMaxima));
                int pontMaisProximoY = Math.max(coordenadaYMinima, Math.min(cY, coordenadaYMaxima));

                double distancia = Math.sqrt(Math.pow((cX - pontMaisProximoX),2) + Math.pow((cY - pontMaisProximoY),2));

                int dano = foiAtingido(distancia, magia, nivel)
                        ? magias.get(magia).dano
                        : 0;

                System.out.println(dano);
            }
        }
    }

    private static boolean foiAtingido(double distancia, String magia, int nivel) {
        return distancia <= magias.get(magia).raioPorNivel.get(nivel - 1);
    }


    public static class Magia{
        String tipo;
        int dano;
        List<Integer> raioPorNivel;

        public Magia(String tipo, int dano, List<Integer> raioPorNivel) {
            this.tipo = tipo;
            this.dano = dano;
            this.raioPorNivel = raioPorNivel;
        }
    }
}

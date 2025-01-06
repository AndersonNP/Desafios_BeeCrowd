package com.nascimento.dio.iniciante.challenge2852;


import java.util.Scanner;

public class TrocaDeMensagens {
    private static final int ALPHABET_SIZE = 26;
    private static final String[][] CHAR_MATRIX = new String[ALPHABET_SIZE][ALPHABET_SIZE];
    public static void main(String[] args) {
        gerarMatriz();
        executarAplicacao();
    }

    public static void executarAplicacao(){
        try(Scanner entrada = new Scanner(System.in)){
            String palavraChave = entrada.next();
            int quantidadeMensagens = entrada.nextInt();
            entrada.nextLine();

            for(int i = 0;i<quantidadeMensagens; i++){
                String mensagem = entrada.nextLine();
                String mensagemCriptografada = criptografarMensagem(mensagem, palavraChave);
                System.out.println(mensagemCriptografada);
            }
        }
    }

    private static String criptografarMensagem(String mensagem, String palavraChave) {
        StringBuilder chaveExpandida = expandirChave(mensagem, palavraChave);
        String[] palavras = mensagem.split(" ");
        String[] palavrasCriptografadas = new String[palavras.length];

        for(int j = 0; j<palavras.length;j++){

            palavrasCriptografadas[j] = isInicialVogal(palavras[j])
                    ? palavras[j]
                    : criptografarPalavra(palavras[j], chaveExpandida.toString().split(" ")[j]);
        }

        return String.join(" ", palavrasCriptografadas);
    }

    private static StringBuilder expandirChave(String mensagem, String palavraChave) {
        String[] palavras = mensagem.split(" ");
        StringBuilder chaveExpandida = new StringBuilder();
        int posicaoAtual = 0;

        for(String palavra : palavras){
            if(isInicialVogal(palavra)){
                chaveExpandida.append(palavra);
            }else{
                for(int i = 0; i < palavra.length(); i++){
                    chaveExpandida.append(palavraChave.charAt(posicaoAtual % palavraChave.length()));
                    posicaoAtual++;
                }
            }
            chaveExpandida.append(" ");
        }

        //System.out.println(stringKey.toString());
        return chaveExpandida;
    }

    private static String criptografarPalavra(String palavra, String chave) {
        StringBuilder palavraCriptografada = new StringBuilder();

        for(int i = 0; i < palavra.length(); i++){
            char letra = palavra.charAt(i);
            char letraChave = chave.charAt(i);
            palavraCriptografada.append(criptografarLetra(letra, letraChave));

        }
        return palavraCriptografada.toString();
    }

    private static boolean isInicialVogal(String palavra) {
        return palavra.startsWith("A") || palavra.startsWith("E") || palavra.startsWith("I") || palavra.startsWith("O") || palavra.startsWith("U")
                || palavra.startsWith("a") || palavra.startsWith("e") || palavra.startsWith("i") || palavra.startsWith("o") || palavra.startsWith("u");
    }

    public static String criptografarLetra(char letra, char letraChave){
        int linha = letraChave - 'a';
        int coluna = letra - 'a';
        return CHAR_MATRIX[linha][coluna];
    }

    private static void printMatriz() {
        for(int i = 0; i < ALPHABET_SIZE; i++){
            for(int j = 0; j < ALPHABET_SIZE; j++){
                System.out.print(CHAR_MATRIX[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void gerarMatriz() {
        for(int i = 0; i < ALPHABET_SIZE; i++){
            for(int j = 0; j < ALPHABET_SIZE; j++){
                if((97+i) + j>122){
                    CHAR_MATRIX[i][j] = String.valueOf((char)((71+i+j)));
                }else {
                    CHAR_MATRIX[i][j] = String.valueOf((char)((97+i) + j));
                }
            }
        }
    }


}

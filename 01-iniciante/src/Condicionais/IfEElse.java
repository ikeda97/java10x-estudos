package Condicionais;

public class IfEElse {

    public static void main(String[] args) {
        String nome = " Naruto Uumaki";
        int idade = 16;
        boolean hokage = false;
        short numeroDeMissoes = 4;

        if (numeroDeMissoes < 10 && idade > 15 ){ // se algo nao atende a condicao entao ela e falsa
            System.out.println("Rank: Genin");
        }else {
            System.out.println("Rank: Chunnin");
        }

    }

}

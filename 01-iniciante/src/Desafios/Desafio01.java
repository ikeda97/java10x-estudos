package Desafios;

public class Desafio01 {
    public static void main(String[] args) {
        // Ninja1
        String nomeNinja1 = "Naruto";
        int idade1 = 14;
        String nomeMissao1 = "Escolta pais do Arroz";
        char rankMissao1 = 'C';
        boolean missaoConcluida1 = false;

        //Ninja2
        String nomeNinja2 = "Sasuke";
        int idade2 = 15;
        String nomeMissao2 = "Cuidar das criancas na academia";
        char rankMissao2 = 'B';
        boolean missaoConcluida2 = false;

        //Ninja3
        String nomeNinja3 = "Sakura";
        int idade3 = 15;
        String nomeMissao3 = "Achar gato perdido";
        char rankMissao3 = 'D';
        boolean missaoConcluida3 = false;

        if (idade1 >= 15) {
            if (rankMissao1 != 'D' && rankMissao1 != 'C') {
                System.out.println("Missao nao pode ser concluida. Missao completada = " + missaoConcluida1);
            } else {
                missaoConcluida1 = true;
                System.out.println("A missao foi um sucesso. Missao completada =" + missaoConcluida1);
            }
        } else {
            System.out.println("Esse ninja nao tem idade para sair em Missao");
        }

        if (idade2 >= 15) {
            if (rankMissao2 != 'D' && rankMissao2 != 'C') {
                System.out.println("Missao nao pode ser concluida. Missao completada= " + missaoConcluida2);
            } else {
                missaoConcluida2 = true;
                System.out.println("A missao foi um sucesso. Missao completa= " + missaoConcluida2);
            }
        } else {
            System.out.println("Esse ninja nao tem idade para sair em Missao");
        }

        if (idade3 >= 15) {
            if (rankMissao3 != 'D' && rankMissao3 != 'C') {
                System.out.println("Missao nao pode ser concluida. Missao completada= " + missaoConcluida3);
            } else {
                missaoConcluida3 = true;
                System.out.println("A missao foi um sucesso. Missao completa= " + missaoConcluida3);
            }
        } else {
            System.out.println("Esse ninja nao tem idade para sair em Missao");
        }
    }
}

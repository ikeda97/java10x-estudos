package Desafios;

public class Desafio01 {
    public static void main(String[] args) {
        // Ninja1
        String nomeNinja1= "Naruto";
        int idade1 = 15;
        String nomeMissao1 = "Escolta pais do Arroz";
        char rankMissao1 = 'C';
        boolean missaoConcluida1 = false;

        //Ninja2
        String nomeNinja2 = "Sasuke";
        int idade2 = 15;
        String nomeMissao2 = "Cuidar das criancas na academia";
        char rankMissao2 = 'D';
        boolean missaoConcluida2 = false;

        //Ninja3
        String nomeNinja3 = "Sakura";
        int idade3 = 15;
        String nomeMissao3 = "Achar gato perdido";
        char rankMissao3 = 'D';
        boolean missaoConcluida3 = false;

        if (idade1 < 15 && rankMissao1 == 'C' || rankMissao1 == 'B' || rankMissao1 == 'A'){
            System.out.println("Missao nao pode ser concluida. Missao completada = " + missaoConcluida1);
        } else {
            missaoConcluida1 = true;
            System.out.println("A missao foi um sucesso");
       }

        if (idade2 < 15 && rankMissao2 == 'C' || rankMissao2 == 'B' || rankMissao2 == 'A'){
            System.out.println("Missao nao pode ser concluida. Missao completada = " + missaoConcluida1);
        } else {
            missaoConcluida2 = true;
            System.out.println("A missao foi um sucessoMissao completada = " + missaoConcluida2);
        }

        if (idade3 < 15 && rankMissao3 == 'C' || rankMissao3 == 'B' || rankMissao3 == 'A'){
            System.out.println("Missao nao pode ser concluida. Missao completada = " + missaoConcluida1);
        } else {
            missaoConcluida3 = true;
            System.out.println("A missao foi um sucessoMissao completada = " + missaoConcluida3);
        }

    }
}

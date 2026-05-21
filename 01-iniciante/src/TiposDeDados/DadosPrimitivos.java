package TiposDeDados;

public class DadosPrimitivos {
    public static void main(String[] args)
    {
      //Dados primitivos: int, double, float, char, boolean, short.

        int idade = 16; // o valor máximo que pode ser alocado é de 2bi e uns quebrados
        double altura = 1.65;
        char inicial = 'R'; // guarda um único caractere
        boolean vivo = true; // armazena apenas se o valor é true or false;
        Long saldoBancario = 99999L; // valor máximo muito grande 9 trilhoes, tem a particularidade de ser o único a começar com a letra maiúscula
        float teste = 1.777f;

        System.out.println(idade);
        System.out.println(altura);
        System.out.println(inicial);
        System.out.println(vivo);
        System.out.println(saldoBancario);
        System.out.println(teste);

    }
}

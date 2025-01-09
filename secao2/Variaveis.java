package JAVA.secao2;

public class Variaveis {
    public static void main(String[] args) {
        // 1 - O que são variaveis
        String nome = "Talita";

        System.out.println(nome);

        // 2, 3, 4 - Concatenação e redefinindo string
        String teste = "Vinicius";
        String teste2 = "Marcus " + teste + " de Moraes";

        System.out.println(teste2);

        // 5 - Diferença do uso do Char para String, String é comum com varias letras e
        // pode ser utilizado com aspas duplas, já o char é apenas aspas simples e é bem
        // utilizado para armazenar apenas um caracter.
        char testechar = '$';

        System.out.println(testechar);

        // 6 - Trabalhando com int

        int num1 = 3;
        int num2 = 6;

        System.err.println(num1 + num2);
        System.err.println(num1 - num2);
        System.err.println(num1 * num2);
        System.err.println(num1 / num2);

        // 7 - Trabalhando com a expressão long

        long numero = 7900000000000L;

        System.err.println(numero);

        long grandeNumero = 1_000_000L;

        System.err.println(grandeNumero + 2);

        // 8 - Expressão double

        double preco = 12.65;

        System.err.println(preco + 1.5);
        System.err.println(preco - 1.5);
        System.err.println(preco * 1.5);
        System.err.println(preco / 1.5);

        double pi = 13.143_124_124D;

        System.out.println(pi);
    }
}

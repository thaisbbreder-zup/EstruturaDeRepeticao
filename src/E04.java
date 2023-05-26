import java.util.Scanner;

public class E04 {
    public static void main(String[] args) {
        Scanner entradaDoUsuario = new Scanner(System.in);
        System.out.println("***** CALCULO DA MÉDIA *****");

        System.out.println("Informe a quantidade de números que você deseja saber a média: ");
        int quantidadeNumeros = entradaDoUsuario.nextInt();

        System.out.println("Agora informe os números: ");

        int soma = 0;
        int i = 0;

        //enquanto os numeros forem menores do que a quantidade de numeros informados,
        //, o programa continua perguntado o próximo numero
        while (i < quantidadeNumeros) {
            System.out.print("Número: ");
            int numero = entradaDoUsuario.nextInt();
            //adiciona e soma o numero informado dentro da variavel soma
            soma += numero;
            i++;
        }

        double media = soma / quantidadeNumeros;
        System.out.println("A média dos números é: " + media);
    }
}

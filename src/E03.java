public class E03 {
    public static void main(String[] args) {
        System.out.println("***** GERADOR E SOMA DE 5 NÚMEROS *****");

        int numero = 1;
        int soma = 0;

        //enquanto o número for menor ou igual a 5
        //imprima a mensagem "O número gerado foi: "
        while (numero <= 5) {

            System.out.println("O número gerado foi: " + numero);
            //+= adiciona o valor somando ao que já consta na variavel
            soma += numero;
            numero++;
        }
        System.out.println("\nA soma de todos os números resultou em: " + soma);
    }
}

import java.sql.SQLOutput;
import java.util.Scanner;

public class E05 {
    public static void main(String[] args) {
        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.println("********** ZERE A FILA DO BANCO **********");

        int fila = 14;

        for (int i = fila; i >= 1; i--) {
            fila -= 1;
            System.out.println(fila + " clientes aguardam para serem atendidos");
            entradaDoUsuario.nextLine();

            if (fila == 0) {
                System.out.println("Ufa, fim do expediente! Todos os clientes foram atendidos :)");
            }
        }
    }
}

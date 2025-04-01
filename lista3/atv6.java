import java.util.Scanner;
import java.util.Random;

public class atv6 {
    public static void main(String[] args) {
        Scanner inteiro = new Scanner(System.in);
        Random numero = new Random();

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = inteiro.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = inteiro.nextInt();

        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);

        int numeroSorteado = numero.nextInt((maior - menor) + 1) + menor;

        if (numeroSorteado % 2 == 0) {
            System.out.println("Número sorteado: " + numeroSorteado + " - Ele é par.");
        } else {
            System.out.println("Número sorteado: " + numeroSorteado + " - Ele é ímpar.");
        }

        inteiro.close();
    }
}
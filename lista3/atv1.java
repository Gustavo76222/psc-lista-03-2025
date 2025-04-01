import java.util.Scanner;

public class atv1{
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Digite um números :");
        int Num1 = numero.nextInt();

        System.out.println("Digite um números :");
        int Num2 = numero.nextInt();

        System.out.println("Digite um números :");
        int Num3 = numero.nextInt();

        int maior = Math.max(Num1,Math.max(Num2,Num3));
        int menor = Math.min(Num1,Math.min(Num2,Num3));
        int media = (Num1 + Num2 + Num2)/3;

        System.out.println("O maior número é :" + maior);
        System.out.println("O menor número é :" + menor);
        System.out.println("A média aritmética é :" + media);

        numero.close();

    }
}
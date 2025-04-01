import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {
        Scanner circulo = new Scanner(System.in);

        System.out.print("Digite o código da operação (1-Perímetro, 2-Área, 3-Volume): ");
        int operacao = circulo.nextInt();

        System.out.print("Digite o raio da circunferência/esfera: ");
        double raio = circulo.nextDouble();

        double pi = 3.141592;
        switch (operacao) {
            case 1:
                double perimetro = 2 * pi * raio;
                System.out.printf("Perímetro do círculo: %.6f%n", perimetro);
                break;
            case 2:
                double area = pi * Math.pow(raio, 2);
                System.out.printf("Área do círculo: %.6f%n", area);
                break;
            case 3:
                double volume = (4.0 / 3.0) * pi * Math.pow(raio, 3);
                System.out.printf("Volume da esfera: %.6f%n", volume);
                break;
            default:
                System.out.println("Erro: código da operação inválido.");
        }

        circulo.close();
    }
}
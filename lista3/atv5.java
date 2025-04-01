import java.util.Scanner;

public class atv5 {
    public static void main(String[] args) {
        Scanner calculadora = new Scanner(System.in);

        System.out.print("Digite o primeiro número real: ");
        double num1 = calculadora.nextDouble();

        System.out.print("Digite o segundo número real: ");
        double num2 = calculadora.nextDouble();

        System.out.print("Digite a operação (+, -, *, /, ^): ");
        char operacao = calculadora.next().charAt(0);

        double resultado;
        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                System.out.printf("Resultado: %.6f%n", resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.printf("Resultado: %.6f%n", resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.printf("Resultado: %.6f%n", resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.printf("Resultado: %.6f%n", resultado);
                } else {
                    System.out.println("Erro: divisão por zero não permitida.");
                }
                break;
            case '^':
                resultado = Math.pow(num1, num2);
                System.out.printf("Resultado: %.6f%n", resultado);
                break;
            default:
                System.out.println("Erro: símbolo de operação inválido.");
        }

        calculadora.close();
    }
}
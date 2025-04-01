import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {
        Scanner dinheiro = new Scanner(System.in);
        System.out.println("Informe o valor do produto :");
        int valor = dinheiro.nextInt();

        System.out.println("Valor do pagamento :");
        int pagamento = dinheiro.nextInt();

        if (pagamento < valor) {
            System.out.println("Valor insuficiente!");
            }

        int troco = pagamento - valor;
        System.out.println("Troco : " + troco);
        
        int[] notas = {50,20,10,5,2,1};
        for (int nota : notas){
            int quantidade = troco / nota;
            troco %= nota;
            if (quantidade > 0){
                System.out.println("Notas de R$ " + nota + ": " + quantidade);
            }
        }
        dinheiro.close();
            
        }
        
        
    }
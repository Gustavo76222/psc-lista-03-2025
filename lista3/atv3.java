import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Informe o valor da letra A :");
        double NumA = valor.nextDouble();

        System.out.println("Informe o valor da letra B :");
        double NumB = valor.nextDouble();

        System.out.println("Informe o valor da letra C :");
        double NumC = valor.nextDouble();

        double delta = NumB * NumB - 4 * (NumA * NumC);

        if (NumA == 0 && NumB == 0 && NumC != 0 ) {
        System.out.println("Coeficientes errados!");
            
        } else if (NumA == 0 && NumB != 0 ) {
            System.out.println("Essa é uma equação de primeiro grau : " + delta);
            double raizEPG = Math.sqrt(delta);
            
        } else if (delta < 0) {
            System.out.println("Esta equação não possui raízes reais");

        } else if (delta == 0) {
            System.out.println("Esta equação possui duas raízes reais iguais : " + delta);
            double raizRRI = Math.sqrt(delta);
            
        } else if (delta > 0) {
            System.out.println("Esta equação possui duas raízes reais diferentes : " + delta);
            double raizDRD = Math.sqrt(delta);
            
        }

            
        }
        
    }

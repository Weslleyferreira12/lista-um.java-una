import java.util.Scanner;
public class ExercicioSeis {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("APP de logaritmo!");
        double num1, num2, soma;
        System.out.println("\nDigite o primeiro numero: ");
        num1 = scanner.nextDouble();
        System.out.println("Digite o segundo numero:: ");
        num2 = scanner.nextDouble();
        soma = Math.log(num1) / Math.log(num2);
        System.out.printf("O logaritmo de %.2f na base %.2f é de %.2f", num1, num2, soma);
        scanner.close();
    }
    
}

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        System.out.println("APP de porcentagem!");
        Scanner scanner = new Scanner(System.in);
        double valor, porcentagem, soma;
        System.out.println("Digite o valor do produto: ");
        valor = Double.valueOf(scanner.nextLine()).doubleValue();
        porcentagem = valor * 0.1;
        soma = valor + porcentagem;
        System.out.printf("O novo valor acrescido será de: %.2f " , soma);
        scanner.close();
        
    }
}

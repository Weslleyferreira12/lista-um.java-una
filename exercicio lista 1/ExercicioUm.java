
import java.util.Scanner;

public class ExercicioUm {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1, numero2, media;
        System.out.println("Média Aritmetica");
        System.out.println("Digite um número: ");
        numero1 = scanner.nextInt();
        System.out.println("Digite o proximo número: ");
        numero2 = scanner.nextInt();
        media = (numero1 + numero2) / 2;
        System.out.println("A Média Aritimetica de " + numero1 + " e " + numero2 + " é: "+ media);
        scanner.close();
        
    }
    
}

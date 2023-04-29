import java.util.Scanner;
public class ExercicioDez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, aritmetica, harmonica, geometrica;
        System.out.print("Digite o primeiro valor: ");
        a = scanner.nextDouble();
        System.out.print("Digite o segundo valor: ");
        b = scanner.nextDouble();
        System.out.print("Digite o terceiro valor: ");
        c = scanner.nextDouble();
        aritmetica = (a + b + c) / 3;
        harmonica = 3 / ((1/a) + (1/b) + (1/c));
        geometrica = Math.cbrt(a * b * c);
        System.out.printf("Média aritmética: %.2f\n", aritmetica);
        System.out.printf("Média harmônica: %.2f\n", harmonica);
        System.out.printf("Média geométrica: %.2f\n", geometrica);
        
        scanner.close();
    }
}
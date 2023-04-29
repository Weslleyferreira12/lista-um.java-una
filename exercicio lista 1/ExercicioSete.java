import java.util.Scanner;
public class ExercicioSete {
    public static void main (String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        double salarioFixo, vendas, percentual, total;

        System.out.println("Aplicativo de Salario!");
        
        System.out.println("\nDigite o valor do salario Fixo: ");
        salarioFixo = scanner.nextDouble();

        System.out.println("\nDigite o valor total das vendas: ");
        vendas = scanner.nextDouble();

        System.out.println("\nDigite o percentual sobre as vendas: ");
        percentual = scanner.nextDouble();

        total = (salarioFixo + (vendas * (percentual / 100)));

        System.out.printf("\nO salario total do vendedor é:%.2f ", total);
        scanner.close();
    }
    
}

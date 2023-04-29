import java.util.Scanner;
public class ExercicioCinco {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorhoras, valorfamilia, valorsalario;
        int numerohoras, numerof;

        System.out.println("Digite o numero de horas que o funcionario(a) trabalhou no mês: ");
        numerohoras = scanner.nextInt();

        System.out.println("\nDigite o valor recebido por hora de trabalho: ");
        valorhoras = scanner.nextDouble();

        System.out.println("\nDigite o valor do salário família por pessoa: ");
        valorfamilia = scanner.nextDouble();

        System.out.println("\nNúmero de filhos com idade menor que 14 anos, para caucular o salario familia:");
        numerof = scanner.nextInt();

        valorsalario = (numerohoras * valorhoras) + (valorfamilia * numerof);

        System.out.printf("O salario bruto a ser recebido é de R$ %.2f", valorsalario);
        scanner.close();

    }
    
}

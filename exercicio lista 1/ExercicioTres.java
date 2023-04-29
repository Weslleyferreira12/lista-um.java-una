import java.util.Scanner;
public class ExercicioTres {
    public static void main(String [] args)throws Exception {
        double valor, valor1;
        System.out.println ("Aplicativo conversor de temperatura!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatua em Fahrenheit a ser convertida: ");
        valor = scanner.nextDouble();
        valor1 = (valor - 32) / 1.8;
        System.out.println("A têmperatura indicada em graus Celsios é: "+ valor1);
        scanner.close();
    } 
}
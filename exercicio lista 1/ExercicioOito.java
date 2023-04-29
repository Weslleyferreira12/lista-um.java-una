import java.util.Scanner;
public class ExercicioOito {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        int carros, motos, rodas, veiculos;

        System.out.println("Informe quantos veiculos: ");
        veiculos = scanner.nextInt();

        System.out.println("Digite o numero de rodas: ");
        rodas = scanner.nextInt();

        carros = (rodas - (veiculos * 2)) / 2;
        motos = veiculos - carros;

        System.out.printf("O numero de carros é %d e o numero de motos é %d", carros, motos);
        scanner.close();
    }
}
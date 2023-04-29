import java.util.Scanner;

public class ExercicioNove {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalSegundos, horas, minutos, segundos;
        System.out.print("Digite o número de segundos: ");
        totalSegundos = input.nextInt();
        horas = totalSegundos / 3600;
        minutos = (totalSegundos % 3600) / 60;
        segundos = totalSegundos % 60;
        System.out.printf("%d segundos correspondem a %d horas, %d minutos e %d segundos.", totalSegundos, horas, minutos, segundos);
        
        input.close();
    }
}
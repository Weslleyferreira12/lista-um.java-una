import java.util.Scanner;
public class ExercicioQuatro {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        double capital, prazo, juros, jurosp, montante;
        System.out.println("APP de Juros compostos!");
        System.out.println("Digite o capital: ");
        capital = scanner.nextDouble();
        System.out.println("Digite o prazo: ");
        prazo = scanner.nextDouble();
        System.out.println("Digite o Juros mensal: ");
        juros = scanner.nextDouble();
        jurosp = juros / 100;
        montante = (capital*(Math.pow(1+jurosp, prazo)));
        System.out.printf("O montante á ser recebido é:%.2f", montante);
        scanner.close();
    }

}

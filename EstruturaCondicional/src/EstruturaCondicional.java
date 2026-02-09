import java.util.Scanner;

public class EstruturaCondicional {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite que horas são agora: ");
        int hora = sc.nextInt();

        sc.close();

        if (hora >= 0 && hora <= 12) {
            System.out.println("Bom Dia!");
        } else if (hora >= 13 && hora <= 17) {
            System.out.println("Boa tarde!");
        } else if (hora >= 18 && hora <= 23) {
            System.out.println("Boa noite!");
        } else {
            System.out.println("Digite um horário válido!");
        }
    }
}
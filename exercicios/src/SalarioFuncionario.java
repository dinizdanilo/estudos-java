import java.util.Locale;
import java.util.Scanner;

public class SalarioFuncionario {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("%nDigite seu número de funcionário: ");
        int number = sc.nextInt();

        System.out.printf("%nDigite suas horas trabalhadas: ");
        int horas = sc.nextInt();

        System.out.printf("%nDigite quanto você recebe por hora: ");
        double valorHora = sc.nextDouble();

        sc.close();
        double salario = (horas * valorHora);

        System.out.printf("%nSeu número de funcionário é %d", number);
        System.out.printf("%nVocê recebe %.2f por hora e trabalhou %d horas", valorHora, horas);
        System.out.printf("%nVocê recebeu %.2f de salário este mês!", salario);
    }
}
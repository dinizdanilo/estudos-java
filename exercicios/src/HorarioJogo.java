import java.util.Scanner;

public class HorarioJogo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a hora inicial do jogo: ");
        int horaComeco = sc.nextInt();;
        System.out.print("Digite a hora Final do jogo: ");
        int horaFinal = sc.nextInt();

        sc.close();

        int duracao;

        if (horaFinal > horaComeco) {
            duracao = horaFinal - horaComeco;
            if (duracao == 1) {
                System.out.printf("\nO jogo durou %d hora", duracao);
            }
            else{
            System.out.printf("\nO jogo durou %d horas", duracao);
            }
        }
        else if (horaComeco == horaFinal){
            duracao = 24;
            System.out.printf("\nO jogo durou %d horas.", duracao);
        }
        else {
            duracao = (24 - horaComeco) + horaFinal;
            if (duracao == 1) {
                System.out.printf("\nO jogo durou %d hora", duracao);
            }
            else{
                System.out.printf("\nO jogo durou %d horas", duracao);
            }
        }
    }
}
import java.util.Locale;
import java.util.Scanner;

public class Quadrante {

    public static void main(String[] args) {

       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);

       System.out.print("Digite o número do eixo X: ");
       double x = sc.nextDouble();

       System.out.print("Digite o número do eixo Y: ");
       double y = sc.nextDouble();

       sc.close();

       if (x > 0 && y > 0) {
          System.out.printf("\nO eixo de X = %.1f e Y = %.1f está no Quadrante 1", x, y);
       } else if (x < 0 && y > 0) {
          System.out.printf("\nO eixo de X = %.1f e Y = %.1f está no Quadrante 2", x, y);
       } else if (x < 0 && y < 0){
          System.out.printf("\nO eixo de X = %.1f e Y = %.1f está no Quadrante 3", x, y);
       } else if (x > 0 && y < 0) {
          System.out.printf("\nO eixo de X = %.1f e Y = %.1f está no Quadrante 4", x, y);
       }
       else {
          System.out.println("\nO seu eixo está na origem (0)");
       }
    }
}
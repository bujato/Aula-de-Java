import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);
        
        int A, B, soma;

        A = sc.nextInt();
        B = sc.nextInt();
        soma = A + B;

        System.out.println("Soma: " + soma);

        sc.close();
    }
}

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        // L == Linhas == 2
        // C == Colunas == 3
        System.out.println("Want lines your have?");
        int L = sc.nextInt();

        System.out.println("Want colunes your have?");
        int C = sc.nextInt();

        int [][] matriz = new int [L][C];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length ; j++) {
                System.out.printf("Digit this value of lines [%d] [%d] : " , i, j);
                matriz[i][j] = sc.nextInt();

            }
        }



        for (int i = 0; i <= matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j] + " ");
            }

        }


    }
}


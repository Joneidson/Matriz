import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantas Linhas tera a matriz? ");

        int linhas = sc.nextInt();
        System.out.println("Quantas Colunas tera a matriz? ");
        int colunas = sc.nextInt();

        int[][] matriz = new int[linhas][colunas];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Qual o valor da posição [%d] [%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }


        // cabeçalho
        System.out.printf("%8s %5s %5s %5s %n", "col0", "col1", "col2", "col3");

        // matriz
        for (int i = 0; i < matriz.length; i++) {
            System.out.printf("lin%d", i); // imprime lin0, lin1...
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf(" [%2d]", matriz[i][j]); // imprime cada valor * [%2d] = faz reservar 2 casas
            }
            System.out.println(); // pula linha no fim de cada linha
        }


        System.out.println("Qual numero você quer saber os vizinhos? ");
        int valorVizinho = sc.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == valorVizinho) {
                    System.out.printf("O valor selecionado [%d] na posiçãp [%d] [%d] tem como vizinho : ", valorVizinho, i, j);

                    if (j - 1 >= 0) {
                        System.out.printf("Esquerda =  %d ", matriz[i][j - 1]);
                    }
                    if (i - 1 >= 0) {
                        System.out.printf("Cima =  %d ", matriz[i - 1][j]);
                    }
                    if (j + 1 < matriz[i].length) {
                        System.out.printf("Direita = %d ", matriz[i][j + 1]);
                    }
                    if (i + 1 < matriz.length) {
                        System.out.printf("Baixo = %d ", matriz[i + 1][j]);
                    }
                    System.out.println();
                }
            }
        }
        sc.close();
    }
}


/*
// opção em poo
// Fiz em POO porem o copilador do execicio nao aceitou
// Deixei comentado se quiser usar com POO descomenta esse bloco e comenta o de cima
        import entidades.MenuApp;

public class Main {
    public static void main(String[] args) {
        MenuApp menu = new MenuApp();
        menu.executar();
    }
}
*/
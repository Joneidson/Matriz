package entidades;

import java.util.Scanner;

public class MatrizService {

    private Matriz matriz;
    private Scanner sc;

    public MatrizService(Scanner sc) {
        this.sc = sc;
    }

    // Valida se a matriz já foi criada antes de operar
    private boolean matrizCriada() {
        if (matriz == null) {
            System.out.println("Nenhuma matriz criada ainda. Use a opção 1.");
            return false;
        }
        return true;
    }

    public void criar() {
        System.out.print("Quantas linhas terá a matriz? ");
        int linhas = sc.nextInt();
        System.out.print("Quantas colunas terá a matriz? ");
        int colunas = sc.nextInt();

        matriz = new Matriz(linhas, colunas);

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf("Valor da posição [%d][%d]: ", i, j);
                matriz.setValor(i, j, sc.nextInt());
            }
        }
        System.out.println("Matriz criada com sucesso!");
    }

    public void exibir() {
        if (!matrizCriada()) return;

        // Cabeçalho dinâmico
        System.out.printf("%8s", "");
        for (int j = 0; j < matriz.getColunas(); j++) {
            System.out.printf(" col%-2d", j);
        }
        System.out.println();

        // Linhas
        for (int i = 0; i < matriz.getLinhas(); i++) {
            System.out.printf("lin%d", i);
            for (int j = 0; j < matriz.getColunas(); j++) {
                System.out.printf("  [%2d]", matriz.getValor(i, j));
            }
            System.out.println();
        }
    }

    public void buscarVizinhos() {
        if (!matrizCriada()) return;

        System.out.print("Qual número você quer saber os vizinhos? ");
        int valorBuscado = sc.nextInt();

        boolean encontrou = false;

        for (int i = 0; i < matriz.getLinhas(); i++) {
            for (int j = 0; j < matriz.getColunas(); j++) {
                if (matriz.getValor(i, j) == valorBuscado) {
                    encontrou = true;
                    System.out.printf("Valor [%d] na posição [%d][%d] → vizinhos: ", valorBuscado, i, j);

                    if (j - 1 >= 0)
                        System.out.printf("Esquerda=%d ", matriz.getValor(i, j - 1));
                    if (i - 1 >= 0)
                        System.out.printf("Cima=%d ", matriz.getValor(i - 1, j));
                    if (j + 1 < matriz.getColunas())
                        System.out.printf("Direita=%d ", matriz.getValor(i, j + 1));
                    if (i + 1 < matriz.getLinhas())
                        System.out.printf("Baixo=%d ", matriz.getValor(i + 1, j));

                    System.out.println();
                }
            }
        }

        if (!encontrou) {
            System.out.println("Valor não encontrado na matriz.");
        }
    }
}
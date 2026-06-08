package entidades;

import java.util.Scanner;

public class MenuApp {

    private MatrizService service;
    private Scanner sc;

    public MenuApp() {
        this.sc = new Scanner(System.in);
        this.service = new MatrizService(sc);
    }

    public void executar() {
        int opcao;
        do {
            System.out.println("""
                    
                    ═══════════ MENU ═══════════
                    1 - Criar Matriz
                    2 - Consultar Matriz
                    3 - Vizinhos de um Valor
                    4 - Sair
                    ════════════════════════════
                    """);
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> service.criar();
                case 2 -> service.exibir();
                case 3 -> service.buscarVizinhos();
                case 4 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 4);
        sc.close();
    }
}
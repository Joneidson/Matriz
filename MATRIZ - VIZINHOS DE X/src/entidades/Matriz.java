package entidades;


public class Matriz {

    private int[][] dados;
    private int linhas;
    private int colunas;

    public Matriz(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.dados = new int[linhas][colunas];
    }

    public void setValor(int i, int j, int valor) {
        dados[i][j] = valor;
    }

    public int getValor(int i, int j) {
        return dados[i][j];
    }

    public int getLinhas() {
        return linhas;
    }

    public int getColunas() {
        return colunas;
    }
}
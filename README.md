# 🔲 Matrizes Java - Vizinhos de um Elemento

Exercício de fixação sobre matrizes bidimensionais em Java.

Parte da trilha de estudos de **Lógica de Programação, Matrizes e POO com Java**.

---

## 🧠 O que estou praticando

```text
Matrizes (int[][])
├── Criação de matrizes
├── Leitura dinâmica de linhas e colunas
├── Percorrer matriz com for aninhado
├── Busca de valores
├── Identificação de posições [i][j]
├── Consulta de vizinhos
│   ├── Esquerda
│   ├── Cima
│   ├── Direita
│   └── Baixo
├── Validação de limites
└── Organização em POO
```

---

## 📋 Exercícios

| #  | Problema                         | Conceito principal          | Status |
| -- | -------------------------------- | --------------------------- | ------ |
| 01 | Consulta de vizinhos de um valor | Matrizes e posições         | ✅      |
| 02 | Versão orientada a objetos       | Classes e responsabilidades | ✅      |

---

## 🗂️ Estrutura

```text
Matriz/
├── MATRIZ CONSULTA/
│    └── src/
│         └── Main.java
│
├── MATRIZ - VIZINHOS DE X/
│    └── src/
│         ├── Main.java
│         └── entidades/
│              ├── Matriz.java
│              ├── MatrizService.java
│              └── MenuApp.java
│
└── README.md
```

---

## 💡 Conceitos Chave

### Criar Matriz

```java
int[][] matriz = new int[linhas][colunas];
```

### Percorrer Matriz

```java
for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz[i].length; j++) {

    }
}
```

### Encontrar um Valor

```java
if (matriz[i][j] == valorBuscado) {

}
```

### Vizinho da Esquerda

```java
if (j - 1 >= 0) {
    System.out.println(matriz[i][j - 1]);
}
```

### Vizinho de Cima

```java
if (i - 1 >= 0) {
    System.out.println(matriz[i - 1][j]);
}
```

### Vizinho da Direita

```java
if (j + 1 < matriz[i].length) {
    System.out.println(matriz[i][j + 1]);
}
```

### Vizinho de Baixo

```java
if (i + 1 < matriz.length) {
    System.out.println(matriz[i + 1][j]);
}
```

---

## 🖥️ Exemplo

Matriz:

```text
       col0 col1 col2

lin0   [10] [20] [30]
lin1   [40] [50] [60]
lin2   [70] [80] [90]
```

Valor pesquisado:

```text
50
```

Resultado:

```text
Esquerda = 40
Cima     = 20
Direita  = 60
Baixo    = 80
```

---

## 🏗️ Versão POO

### Matriz

Responsável por armazenar os dados.

```text
Matriz
├── dados[][]
├── linhas
└── colunas
```

### MatrizService

Responsável pelas regras de negócio.

```text
MatrizService
├── criar()
├── exibir()
└── buscarVizinhos()
```

### MenuApp

Responsável pela interação com o usuário.

```text
MenuApp
└── executar()
```

---

## 🎯 Conceitos Praticados

```text
✓ Matrizes
✓ Loops aninhados
✓ Condicionais
✓ Busca em estruturas bidimensionais
✓ Encapsulamento
✓ Classes e Objetos
✓ Construtores
✓ Organização em pacotes
✓ Separação de responsabilidades
✓ Git
✓ GitHub
```

---

## 🚀 Próximas Melhorias

```text
□ Buscar múltiplos valores
□ Editar posições da matriz
□ Somar linhas e colunas
□ Encontrar maior e menor valor
□ Exportar matriz para arquivo
□ Interface gráfica
□ Testes automatizados
```

---

## 👨‍💻 Autor

Feito por **Joneidson Victor** como parte da trilha de estudos Java — Matrizes, Estruturas Bidimensionais e Programação Orientada a Objetos.

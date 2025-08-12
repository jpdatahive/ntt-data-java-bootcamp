# Desafio: Hierarquia de Ingressos de Cinema

## Descrição

O objetivo deste desafio é criar uma hierarquia de classes em Java para modelar a venda de ingressos em um cinema, aplicando os conceitos de Herança e Polimorfismo.

## Requisitos

1.  **Classe Pai (`Ingresso`):**
    -   Deve ter os atributos: `valor` (double), `nomeFilme` (String) e `dublado` (boolean).
    -   Deve ter um método que retorna o valor do ingresso.

2.  **Subclasse (`IngressoMeiaEntrada`):**
    -   Deve herdar da classe `Ingresso`.
    -   O método que retorna o valor deve aplicar um desconto de 50% sobre o valor original do ingresso.

3.  **Subclasse (`IngressoFamilia`):**
    -   Deve herdar da classe `Ingresso`.
    -   Deve ter um atributo adicional: `numeroPessoas` (int).
    -   O método que retorna o valor deve:
        -   Multiplicar o valor base do ingresso pelo `numeroPessoas`.
        -   Aplicar um desconto de 5% sobre o valor total se o `numeroPessoas` for maior que 3.
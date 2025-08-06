# Projeto Conta Bancária

Este projeto é uma simulação em Java de uma conta bancária básica, desenvolvida como parte de um desafio de programação. Ele implementa as operações essenciais de uma conta, com foco na lógica de negócio para o uso e cobrança de taxas do cheque especial.

## ☕ Tecnologias Utilizadas
- **Java**

## ✨ Funcionalidades (Operações)

A classe `ContaBancaria` permite realizar as seguintes operações:

-   **Consultar Saldo:** Verifica o saldo atual da conta.
-   **Consultar Cheque Especial:** Exibe o limite total e o valor já utilizado do cheque especial.
-   **Verificar Uso do Cheque Especial:** Retorna um booleano (`true`/`false`) indicando se a conta está atualmente utilizando o limite do cheque especial.
-   **Depositar:** Adiciona fundos à conta.
-   **Sacar:** Retira fundos da conta.
-   **Pagar Boleto:** Realiza o pagamento de um boleto, utilizando a mesma lógica de um saque.

## 룰 Regras de Negócio

A aplicação segue um conjunto estrito de regras de negócio, principalmente relacionadas ao cheque especial:

1.  **Limite do Cheque Especial:** O limite é definido no momento da criação da conta, com base no valor do depósito inicial.
    -   Se o depósito inicial for **menor ou igual a R$ 500,00**, o limite do cheque especial será de **R$ 50,00**.
    -   Se o depósito inicial for **maior que R$ 500,00**, o limite será de **50% do valor depositado**.

2.  **Uso do Cheque Especial:** O cliente pode sacar ou pagar boletos utilizando o saldo da conta somado ao limite do cheque especial.

3.  **Taxa de Utilização:** Caso o cliente utilize o cheque especial (deixando o saldo negativo), será cobrada uma **taxa de 20% sobre o valor utilizado**.
    -   A cobrança ocorre no momento em que um novo depósito é efetuado na conta que está com saldo negativo. O depósito primeiro cobre o saldo devedor, e a taxa é calculada sobre o montante que estava sendo utilizado.

## 🚀 Como Executar

Para testar a classe `ContaBancaria`, é necessário criar um método `main` que instancie a classe e chame seus métodos.

1.  **Adicione um método `main`** para interação (pode ser na própria classe `ContaBancaria` ou em uma classe separada, como `Terminal.java`).

    ```java
    // Exemplo de método main para teste
    public static void main(String[] args) {
        // Cria uma conta com depósito inicial de R$ 100,00
        // (Limite do cheque especial será de R$ 50,00)
        ContaBancaria minhaConta = new ContaBancaria(100.00);
        System.out.printf("Saldo inicial: R$ %.2f
", minhaConta.consultarSaldo());

        // Simula um saque maior que o saldo
        minhaConta.sacar(120.00); // Usa R$ 20,00 do cheque especial

        // Consulta o estado da conta
        System.out.printf("Saldo após saque: R$ %.2f
", minhaConta.consultarSaldo());
        minhaConta.consultarChequeEspecial();

        // Simula um depósito para cobrir o cheque especial
        minhaConta.depositar(50.00); // Paga os R$ 20,00 devidos + taxa de 20% (R$ 4,00)

        // Consulta o saldo final
        System.out.printf("Saldo final: R$ %.2f
", minhaConta.consultarSaldo());
    }
    ```

2.  **Compile o arquivo Java:**
    ```bash
    javac ContaBancaria.java
    ```

3.  **Execute o programa:**
    ```bash
    java ContaBancaria
    ```

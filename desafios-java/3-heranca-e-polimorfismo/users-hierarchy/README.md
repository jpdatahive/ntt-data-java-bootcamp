# Desafio: Hierarquia de Usuários

Este projeto em Java implementa uma hierarquia de usuários para um sistema simplificado, demonstrando os conceitos de Herança e Polimorfismo da Programação Orientada a Objetos.

## Estrutura das Classes

O sistema é composto por uma classe base (`User`) e três classes derivadas que representam diferentes papéis em uma empresa: `Manager`, `Seller` e `Attendant`.

### 1. `User` (Classe Pai)
A classe base que contém os atributos e métodos comuns a todos os usuários.
- **Atributos:** `name`, `email`, `password`, `isAdmin`
- **Métodos Comuns:**
    - `login()`
    - `logoff()`
    - `changeInfo()`
    - `changePassword()`

### 2. `Manager` (Herda de `User`)
Representa um usuário com privilégios de administrador.
- **Configuração:** O atributo `isAdmin` é sempre definido como `true`.
- **Métodos Exclusivos:**
    - `generateFinancialReport()`: Gera um relatório financeiro.
    - `getGeneralSalesReport()`: Gera um relatório geral de vendas.

### 3. `Seller` (Herda de `User`)
Representa um vendedor.
- **Configuração:** O atributo `isAdmin` é sempre definido como `false`.
- **Atributo Exclusivo:** `salesCount` (para contar o número de vendas realizadas).
- **Métodos Exclusivos:**
    - `makeSale()`: Registra uma nova venda.
    - `getMySalesReport()`: Gera um relatório de vendas individual.

### 4. `Attendant` (Herda de `User`)
Representa um atendente de caixa.
- **Configuração:** O atributo `isAdmin` é sempre definido como `false`.
- **Atributo Exclusivo:** `cashBalance` (para controlar o saldo do caixa).
- **Métodos Exclusivos:**
    - `receivePayment(amount)`: Recebe um pagamento e atualiza o saldo.
    - `closeCashier()`: Fecha o caixa e exibe o valor total.

## Objetivo do Teste

O arquivo `Main.java` é utilizado para instanciar objetos de cada tipo de usuário e testar seus métodos, tanto os herdados quanto os exclusivos, para verificar o funcionamento correto da herança e do polimorfismo.

# Checklist de Desenvolvimento: Ingressos de Cinema

- [x] **1. Classe Pai: `Ingresso`**
    - [x] Criar a classe `Ingresso`.
    - [x] Adicionar atributos: `valor`, `nomeFilme`, `dublado`.
    - [x] Criar o construtor para inicializar os atributos.
    - [x] Criar os métodos `getters` para os atributos.
    - [x] Criar um método para retornar o valor do ingresso (`getValorFinal()`).

- [x] **2. Subclasse: `IngressoMeiaEntrada`**
    - [x] Criar a classe `IngressoMeiaEntrada` que herda de `Ingresso`.
    - [x] Criar o construtor da subclasse.
    - [x] Sobrescrever (`@Override`) o método `getValorFinal()` para retornar 50% do valor.

- [x] **3. Subclasse: `IngressoFamilia`**
    - [x] Criar a classe `IngressoFamilia` que herda de `Ingresso`.
    - [x] Adicionar o atributo `numeroPessoas`.
    - [x] Criar o construtor da subclasse.
    - [x] Sobrescrever (`@Override`) o método `getValorFinal()` para aplicar a regra de negócio (multiplicar por pessoa e dar desconto se > 3 pessoas).

- [x] **4. Classe de Teste (`Main`)**
    - [x] Criar uma classe `Main` com um método `main`.
    - [x] Instanciar objetos de cada tipo de ingresso.
    - [x] Imprimir os detalhes e o valor final de cada ingresso para verificar se a lógica está correta.

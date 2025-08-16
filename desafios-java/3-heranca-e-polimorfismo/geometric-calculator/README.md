# Desafio: Calculadora de Área de Figuras Geométricas

O objetivo deste desafio é criar uma hierarquia de classes em Java para modelar o cálculo da área de diferentes figuras geométricas, aplicando os conceitos de Herança e Polimorfismo.

## Requisitos

1.  **Interface ou Classe Abstrata (`Shape`):**
    *   Deve definir um método para retornar o valor da área, por exemplo: `getArea()`.

2.  **Classes Concretas (Figuras):**
    *   **`Square`**: Implementa/estende `Shape`, possui o valor do lado e calcula a área (lado * lado).
    *   **`Rectangle`**: Implementa/estende `Shape`, possui os valores de base e altura e calcula a área (base * altura).
    *   **`Circle`**: Implementa/estende `Shape`, possui o atributo raio e calcula a área (PI * raio * raio).

3.  **Classe de Teste (`Main`):**
    *   Deve ser capaz de criar instâncias de cada figura geométrica.
    *   Deve demonstrar o polimorfismo calculando e exibindo a área para cada figura.

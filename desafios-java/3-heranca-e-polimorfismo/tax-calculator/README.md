# Desafio: Calculadora de Tributos de Produtos

O objetivo deste desafio é criar uma hierarquia de classes em Java para modelar o cálculo de tributos de diferentes tipos de produtos, aplicando os conceitos de Herança e Polimorfismo.

## Requisitos

1.  **Interface ou Classe Abstrata (`Product`):**
    *   Deve definir um método para retornar o valor do imposto, por exemplo: `getTaxValue()`.

2.  **Classes Concretas (Produtos):**
    *   **`FoodProduct`**: Implementa/estende `Product` e calcula o imposto em 1%.
    *   **`HealthProduct`**: Implementa/estende `Product` e calcula o imposto em 1.5%.
    *   **`ClothingProduct`**: Implementa/estende `Product` e calcula o imposto em 2.5%.
    *   **`CultureProduct`**: Implementa/estende `Product` e calcula o imposto em 4%.

3.  **Classe de Teste (`Main`):**
    *   Deve ser capaz de criar instâncias de cada tipo de produto.
    *   Deve demonstrar o polimorfismo calculando e exibindo o imposto para cada produto.

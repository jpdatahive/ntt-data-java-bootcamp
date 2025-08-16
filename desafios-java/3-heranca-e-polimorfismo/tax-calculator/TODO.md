# Checklist de Desenvolvimento: Calculadora de Tributos

- [ ] **1. Interface/Classe Abstrata: `Product`**
    - [ ] Criar a interface ou classe abstrata `Product`.
    - [ ] Adicionar a assinatura do método `getTaxValue()`.

- [ ] **2. Classes de Produto**
    - [ ] Criar a classe `FoodProduct` que implementa `Product`.
    - [ ] Criar a classe `HealthProduct` que implementa `Product`.
    - [ ] Criar a classe `ClothingProduct` que implementa `Product`.
    - [ ] Criar a classe `CultureProduct` que implementa `Product`.

- [ ] **3. Classe de Teste (`Main`)**
    - [ ] Criar uma classe `Main` com um método `main`.
    - [ ] Instanciar objetos de cada tipo de produto.
    - [ ] Chamar o método `getTaxValue` em cada objeto para verificar o polimorfismo.

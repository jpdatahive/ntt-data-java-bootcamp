# Guia de Conceitos: Herança e Polimorfismo em Java

Este guia serve como um material de apoio para os conceitos fundamentais de Herança e Polimorfismo, que são pilares da Programação Orientada a Objetos (POO).

---

## 1. Herança

### O que é?

Herança é um mecanismo que permite que uma classe (chamada de **subclasse** ou **classe filha**) herde atributos e métodos de outra classe (chamada de **superclasse** ou **classe pai**). É uma forma de reutilizar código e estabelecer uma relação de "é um" entre as classes.

**Exemplo:** Um `Carro` **é um** `Veiculo`. Um `Cachorro` **é um** `Animal`.

### Como usar em Java?

Em Java, usamos a palavra-chave `extends` para definir que uma classe herda de outra.

```java
// Superclasse (Classe Pai)
class Veiculo {
    String marca;
    int ano;

    void acelerar() {
        System.out.println("O veículo está acelerando.");
    }
}

// Subclasse (Classe Filha)
class Carro extends Veiculo {
    int numeroDePortas;

    void ligarArCondicionado() {
        System.out.println("Ar condicionado ligado.");
    }
}
```

Neste exemplo, a classe `Carro` herda os atributos `marca` e `ano` e o método `acelerar()` da classe `Veiculo`, além de ter seus próprios membros.

### Vantagens da Herança

- **Reutilização de Código:** Evita a duplicação de código, pois os membros da superclasse são compartilhados com as subclasses.
- **Organização:** Ajuda a criar uma hierarquia de classes lógica e organizada.
- **Manutenibilidade:** Alterações na superclasse são refletidas em todas as subclasses, facilitando a manutenção.

---

## 2. Polimorfismo

### O que é?

Polimorfismo, do grego "muitas formas", é a capacidade de um objeto ser referenciado de múltiplas maneiras. Em Java, isso geralmente se manifesta de duas formas:

1.  **Sobrescrita de Método (Overriding):** Ocorre quando uma subclasse fornece uma implementação específica para um método que já é definido em sua superclasse.
2.  **Sobrecarga de Método (Overloading):** Ocorre quando uma classe tem múltiplos métodos com o mesmo nome, mas com parâmetros diferentes (em número ou tipo).

Para os exercícios atuais, o foco principal será na **sobrescrita de métodos**.

### Sobrescrita de Método (Overriding)

Acontece quando uma classe filha precisa que um método herdado da classe pai se comporte de maneira diferente. Para isso, ela "reescreve" esse método.

**Regras para sobrescrita:**
- O nome do método, os parâmetros e o tipo de retorno devem ser exatamente os mesmos do método na superclasse.
- É uma boa prática usar a anotação `@Override` para indicar ao compilador que você está sobrescrevendo um método. Isso ajuda a evitar erros.

**Exemplo:**

```java
// Superclasse
class Animal {
    void fazerSom() {
        System.out.println("O animal faz um som.");
    }
}

// Subclasse
class Cachorro extends Animal {
    @Override // Sobrescrevendo o método da superclasse
    void fazerSom() {
        System.out.println("O cachorro late: Au au!");
    }
}

// Subclasse
class Gato extends Animal {
    @Override // Sobrescrevendo o método da superclasse
    void fazerSom() {
        System.out.println("O gato mia: Miau!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal meuAnimal1 = new Cachorro(); // Objeto Cachorro referenciado como Animal
        Animal meuAnimal2 = new Gato();     // Objeto Gato referenciado como Animal

        meuAnimal1.fazerSom(); // Chama o método do Cachorro -> "O cachorro late: Au au!"
        meuAnimal2.fazerSom(); // Chama o método do Gato -> "O gato mia: Miau!"
    }
}
```

No exemplo acima, o mesmo chamado de método (`fazerSom()`) se comporta de maneiras diferentes dependendo do objeto real (`Cachorro` ou `Gato`). Isso é polimorfismo em ação.

### Vantagens do Polimorfismo

- **Flexibilidade:** Permite que você escreva código que pode trabalhar com objetos de diferentes classes de forma genérica.
- **Extensibilidade:** Facilita a adição de novas subclasses sem precisar alterar o código que as utiliza.
- **Código mais limpo:** Reduz a necessidade de condicionais (como `if-else` ou `switch`) para verificar o tipo de um objeto antes de chamar um método.
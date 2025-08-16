# Checklist de Desenvolvimento: Formatador de Telefone

- [ ] **1. Classe `PhoneFormatter`**
    - [ ] Criar o método principal, por exemplo `formatPhoneNumber(String input)`.
    - [ ] Implementar a lógica para limpar a string de entrada, mantendo apenas os dígitos.
    - [ ] Implementar a lógica condicional (if/else if/else) ou (switch) para verificar a quantidade de dígitos.
    - [ ] Criar métodos auxiliares para cada tipo de formatação (8, 9, 10, 11 dígitos).
    - [ ] Implementar a verificação para números já formatados.
    - [ ] Adicionar tratamento para entradas inválidas.

- [ ] **2. Classe `Main`**
    - [ ] Criar uma classe `Main` com um método `main`.
    - [ ] Criar um loop para permitir que o usuário teste várias entradas.
    - [ ] Solicitar ao usuário a entrada do número de telefone.
    - [ ] Instanciar o `PhoneFormatter`.
    - [ ] Chamar o método de formatação e exibir o resultado para o usuário.

# Checklist de Desenvolvimento: Conversor de Dados

- [ ] **1. Estrutura de Dados**
    - [ ] Criar uma classe ou estrutura para armazenar os dados de cada campo (Nome, Valor, Tipo).
    - [ ] Utilizar uma lista (`ArrayList`) para guardar todas as entradas do usuário.

- [ ] **2. Classe `DataConverter`**
    - [ ] Criar um método para converter a lista de dados para o formato **JSON**.
    - [ ] Criar um método para converter a lista de dados para o formato **XML**.
    - [ ] Criar um método para converter a lista de dados para o formato **YAML**.
    - [ ] (Opcional) Considerar o uso de bibliotecas externas para facilitar a conversão (como Jackson ou Gson para JSON).

- [ ] **3. Classe `Main`**
    - [ ] Criar uma classe `Main` com um método `main`.
    - [ ] Implementar um loop para receber as entradas do usuário até que ele decida sair.
    - [ ] Para cada entrada, validar, separar os campos e criar o objeto de dados.
    - [ ] Adicionar o objeto à lista de dados.
    - [ ] Após o loop, instanciar o `DataConverter`.
    - [ ] Chamar os métodos de conversão e exibir os resultados (JSON, XML, YAML) no console.

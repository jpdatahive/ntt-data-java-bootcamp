# Hierarquia de Usuários (Simplificada)

---

### 1. `User` (Classe Pai)
- **Atributos:** `nome`, `email`, `senha`, `isAdministrador`
- **Métodos Principais:**
    - `realizarLogin()`
    - `realizarLogoff()`
    - `alterarDados()`
    - `alterarSenha()`
- **Getters/Setters:** Para todos os atributos.

---

### 2. `Manager` (Herda de `User`)
- **Configuração:** `isAdministrador` é sempre `true`.
- **Métodos Exclusivos:**
    - `gerarRelatorioFinanceiro()`
    - `consultarVendas()` (geral)

---

### 3. `Seller` (Herda de `User`)
- **Configuração:** `isAdministrador` é sempre `false`.
- **Atributo Exclusivo:** `quantidadeVendas` (inicia em 0).
- **Métodos Exclusivos:**
    - `realizarVenda()`
    - `consultarVendas()` (apenas as suas)

---

### 4. `Attendant` (Herda de `User`)
- **Configuração:** `isAdministrador` é sempre `false`.
- **Atributo Exclusivo:** `valorEmCaixa` (inicia em 0.0).
- **Métodos Exclusivos:**
    - `receberPagamentos(valor)`
    - `fecharCaixa()`

---

### Plano de Testes
- [ ] Criar um objeto de cada tipo (`Manager`, `Seller`, `Attendant`).
- [ ] Testar todos os seus métodos.
- [ ] Colocar todos em um array `User[]` e testar um método comum (como `realizarLogin`) para checar o polimorfismo.

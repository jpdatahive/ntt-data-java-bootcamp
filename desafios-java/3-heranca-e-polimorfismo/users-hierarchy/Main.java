public class Main {
  public static void main(String[] args) {
    // --- 1. Criação dos Objetos ---
    System.out.println("--- 1. Criando usuários ---");
    Manager gerente = new Manager("Joao", "jp@email.com", "123");
    Seller vendedor = new Seller("Pedro", "p@email.com", "123");
    Attendant atendente = new Attendant("Araujo", "a@email.com", "123");
    System.out.println("Usuários criados com sucesso!\n");

    // --- 2. Teste de Métodos Específicos ---
    System.out.println("--- 2. Testando métodos específicos de cada cargo ---\n");
    
    System.out.println(">> Ações do Gerente:");
    gerente.generateFinancialReport();
    gerente.getGeneralSalesReport();
    System.out.println();

    System.out.println(">> Ações do Vendedor:");
    vendedor.makeSale();
    vendedor.makeSale(); // Segunda venda para teste
    vendedor.getMySalesReport();
    System.out.println();

    System.out.println(">> Ações do Atendente:");
    atendente.receivePayment(50.0);
    atendente.receivePayment(35.50);
    atendente.closeCashier();
    System.out.println();

    // --- 3. Teste de Polimorfismo ---
    System.out.println("--- 3. Testando polimorfismo com um método comum (login) ---\n");
    User[] usuarios = {gerente, vendedor, atendente};

    for (User user : usuarios) {
      // getClass().getSimpleName() retorna o nome da classe (ex: "Manager")
      System.out.printf("Fazendo login com %s (%s): ", user.getName(), user.getClass().getSimpleName());
      user.login();
    }
    System.out.println();

    // --- 4. Teste de Métodos Herdados (com correção) ---
    System.out.println("--- 4. Testando métodos herdados e getters ---\n");
    System.out.println("Alterando informações do gerente...");
    gerente.changeInfo("Joao Paulo", "joao.paulo@email.com");
    
    // Agora usamos o valor retornado pelo getter
    System.out.println("Informações atualizadas do gerente:");
    System.out.println("Novo nome: " + gerente.getName());
    System.out.println("Novo email: " + gerente.getEmail());
  }
}
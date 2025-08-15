public class Manager extends User {
  
  // Construtor
  public Manager(String name, String email, String password) {
    super(name, email, password, true);
  }
  
  // Exclusive Methods
  public void generateFinancialReport() {
    System.out.println("Gerando relatorio financeiro...");
  }

  public void getGeneralSalesReport() {
    System.out.println("Gerando relatorio de vendas...");
  }

}

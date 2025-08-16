public class Seller extends User {
  // Atributo especial (conta quantidade de vendas)
  int salesCount;

  // Construtor
  public Seller(String name, String email, String password) {
    super(name, email, password, false);
    this.salesCount = 0;
  }

  public void makeSale() {
    this.salesCount += 1;
    System.out.println("Venda realizada com sucesso!");
  } 

  public void getMySalesReport() {
    System.out.printf("Gerando relatorio de vendas! Quantidade de vendas: %d", this.salesCount);
  }
}

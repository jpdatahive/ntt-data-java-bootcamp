public class Attendant extends User {
  // Atributo especial
  double cashBalance;

  // Construtor
  public Attendant(String name, String email, String password) {
    super(name, email, password, false);
    this.cashBalance = 0.0;
  }

  //Metodos especiais
  public void receivePayment(double amount) {
    System.out.println("Pagamento recebido com sucesso.");
    this.cashBalance += amount;
  } 

  public void closeCashier() {
    System.out.printf("Caixa fechado! Valor total em caixa: %.2f\n", this.cashBalance);
  }
}

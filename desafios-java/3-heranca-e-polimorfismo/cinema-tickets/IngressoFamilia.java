public class IngressoFamilia extends Ingresso {
  private int numeroPessoas;

  // Construtor passando os valores para a classe pai com super()
  public IngressoFamilia(double valor, String nome, boolean dublado, int pessoas) {
    super(valor, nome, dublado);
    this.numeroPessoas = pessoas;
  }

  // Metodo usando o @Override para alterar o metodo da classe pai, criando um personalizado
  @Override
  public double getValorFinal(){
   if (this.numeroPessoas <=3) {
      return super.getValorFinal() * numeroPessoas;
    } else {
      return (super.getValorFinal() * numeroPessoas * 0.95); 
    }

  } 


}

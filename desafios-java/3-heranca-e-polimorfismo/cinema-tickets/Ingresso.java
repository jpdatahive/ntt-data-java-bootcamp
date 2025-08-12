public class Ingresso {
  // Atributos
  private double valorIngresso;
  private String nomeFilme;
  private boolean dublado;
  
  // Construtor
  public Ingresso(double valor, String nome, boolean dublado) {
    this.valorIngresso = valor;
    this.nomeFilme = nome;
    this.dublado = dublado;

  }
  

  // Getters
  public double getValorIngresso() {
    return this.valorIngresso;
  } 

  public String getNomeFilme() {
    return this.nomeFilme;
  }

  public boolean isDublado() {
    return this.dublado;
  }

  public double getValorFinal() {
    return this.valorIngresso;
  }
}



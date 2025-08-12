public class IngressoMeiaEntrada extends Ingresso {

    // Construtor da subclasse IngressoMeiaEntrada
    // Ele recebe os mesmos parâmetros que o construtor da classe pai (Ingresso)
    public IngressoMeiaEntrada(double valor, String nome, boolean dublado) {
        // Chama o construtor da classe pai (Ingresso)
        // Isso garante que os atributos 'valorIngresso', 'nomeFilme' e 'dublado'
        // sejam inicializados corretamente pela classe pai.
        super(valor, nome, dublado);
    }

    // Sobrescreve o método getValorFinal() da classe pai (Ingresso)
    @Override
    public double getValorFinal() {
        // Retorna 50% do valor do ingresso.
        // Usamos 'super.getValorFinal()' para obter o valor original do ingresso
        // calculado pela classe pai, ou 'this.valorIngresso' (se fosse protected).
        // Como getValorIngresso() é público, podemos usar ele também.
        return super.getValorFinal() * 0.50;
    }
}
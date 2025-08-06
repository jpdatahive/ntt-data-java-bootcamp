public class BankAccount {
    // Determinamos primeiro as propriedades da classe Conta Bancária (atributos).
    private double saldo;
    private double limiteChequeEspecial;
    private double chequeEspecialUsado;
    private boolean usandoChequeEspecial;

    // Criamos o construtor e os métodos que Conta Bancária terão
    public ContaBancaria(double depositoInicial) {
        this.saldo = depositoInicial;
        this.usandoChequeEspecial = false;

        if (depositoInicial <= 500) {
            this.limiteChequeEspecial = 50;
        } else {
            this.limiteChequeEspecial = depositoInicial * 0.5;
        }

    }

    // Com o construtor pronto, podemos dar início na criação dos métodos
    public void depositar(double valor) {
        double desconto = 0;
        if (this.saldo < 0) {
            desconto = -this.saldo;

        }
        this.saldo += valor; // Deposita o valor na conta

        if (desconto > 0) {
            double taxa = desconto * 0.2;
            System.out.printf("Taxa de R$ % .2f cobrada pelo uso do cheque especial \n", taxa);
            this.saldo -= taxa;
        }

        if (this.saldo >= 0) {
            this.usandoChequeEspecial = false;
            this.chequeEspecialUsado = 0;
        }
    }

    public void sacar(double valor) {
        double valorDisponivel = this.saldo + this.limiteChequeEspecial;
        if (valor <=0) {
            System.out.println("ERRO: Quantidade para saque inválida, entre por favor com um valor positivo.");
            return;
        }

        if (valor > valorDisponivel) {
            System.err.printf("Valor indisponível para saque. Saldo total (com cheque especial) de R$ % .2f", valorDisponivel);
            return;
        } else {
            this.saldo -= valor;
            if (this.saldo < 0) {
                this.usandoChequeEspecial = true;
                this.chequeEspecialUsado = -this.saldo;
            }
            System.out.printf("Valor de R$ % .2f sacado com sucesso (foram usados R$ % .2f do limite de cheque especial)", valor, this.chequeEspecialUsado); 
        }
    }

    public void pagarBoleto(double valorBoleto) {
        System.out.println("Pagamento de boleto sendo processado.");
        sacar(valorBoleto);
    }

    // GETTERS
    public double getSaldo() {
        return this.saldo;
    }

    public double getLimiteChequeEspecial() {
        return this.limiteChequeEspecial;
    }

    public double getChequeEspecialUsado() {
        return this.chequeEspecialUsado;
    }

    public boolean isUsandoChequeEspecial() {
        return this.usandoChequeEspecial;
    }
    

}
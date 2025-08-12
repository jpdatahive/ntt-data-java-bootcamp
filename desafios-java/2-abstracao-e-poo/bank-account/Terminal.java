import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao Banco Digital!");
        System.out.print("Para começar, crie sua conta. Qual o depósito inicial? R$ ");
        
        double valorInicial = scanner.nextDouble();
        BankAccount minhaConta = new BankAccount(valorInicial);

        System.out.printf("\nConta criada com sucesso!\nSeu saldo é de R$ %.2f e seu limite de cheque especial é de R$ %.2f\n", minhaConta.getSaldo(), minhaConta.getLimiteChequeEspecial());
    
        int opcao;

        do {
            System.out.println("\n-------- MENU BANCÁRIO --------");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Ver Extrato Detalhado");
            System.out.println("4. Pagar Boleto");
            System.out.println("5. Sair");
            System.out.println("-----------------------------");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("\nQual é o valor do depósito? R$ ");
                    double valorDeposito = scanner.nextDouble();
                    minhaConta.depositar(valorDeposito);
                    System.out.printf("Depósito realizado! Seu novo saldo é de R$ %.2f\n", minhaConta.getSaldo());
                    break;
                
                case 2:
                    System.out.print("\nQual é o valor do saque? R$ ");
                    double valorSaque = scanner.nextDouble();
                    minhaConta.sacar(valorSaque);
                    // A classe BankAccount já imprime o resultado do saque
                    break;
                
                case 3:
                    System.out.println("\n--------- Extrato Detalhado da Conta ---------");
                    System.out.printf("Saldo em conta: R$ %.2f\n", minhaConta.getSaldo());
                    System.out.printf("Limite do Cheque Especial: R$ %.2f\n", minhaConta.getLimiteChequeEspecial());
                    if (minhaConta.isUsandoChequeEspecial()) {
                        // BUG CORRIGIDO: Adicionado o argumento que faltava na linha abaixo
                        System.out.printf("Valor usado do Cheque Especial: R$ %.2f\n", minhaConta.getChequeEspecialUsado());
                    }
                    System.out.println("----------------------------------------------");
                    break;
                
                case 4:
                    System.out.print("\nQual é o valor do boleto a pagar? R$ ");
                    double valorBoleto = scanner.nextDouble();
                    minhaConta.pagarBoleto(valorBoleto);
                    // A classe BankAccount já imprime o resultado do pagamento
                    break;
                
                case 5:
                    System.out.println("\nObrigado por utilizar nosso banco. Volte sempre!");
                    break;

                default:
                    System.out.println("\nOpção inválida! Por favor, escolha um número do menu.");
                    break;
                }

        } while (opcao != 5);

        scanner.close();
    }
}

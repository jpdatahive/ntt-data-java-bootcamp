import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Informações básicas
        System.out.print("Digite o valor do ingresso: R$ ");
        double valor = scanner.nextDouble();
        
        System.out.print("Digite o nome do filme: ");
        scanner.nextLine(); // limpa o buffer
        String filme = scanner.nextLine();
        
        System.out.print("É dublado? (true/false): ");
        boolean dublado = scanner.nextBoolean();
        
        boolean executando = true;
        
        while(executando) {
            // Escolha do tipo
            System.out.println("\nEscolha o tipo de ingresso:");
            System.out.println("1 - Normal");
            System.out.println("2 - Meia entrada");
            System.out.println("3 - Família");
            System.out.println("4 - Sair");
            System.out.print("Opção: ");
            
            int opcao = scanner.nextInt();
            
            // Criando diferentes tipos de ingresso
            if (opcao == 1) {
                Ingresso ingressoNormal = new Ingresso(valor, filme, dublado);
                System.out.println("Valor final: R$ " + ingressoNormal.getValorFinal());
                
            } else if (opcao == 2) {
                IngressoMeiaEntrada ingressoMeia = new IngressoMeiaEntrada(valor, filme, dublado);
                System.out.println("Valor final: R$ " + ingressoMeia.getValorFinal());
                
            } else if (opcao == 3) {
                System.out.print("Quantas pessoas? ");
                int pessoas = scanner.nextInt();
                IngressoFamilia ingressoFamilia = new IngressoFamilia(valor, filme, dublado, pessoas);
                System.out.println("Valor final: R$ " + ingressoFamilia.getValorFinal());
                
            } else if (opcao == 4) {
                System.out.println("Obrigado por usar nosso sistema.");
                executando = false;
                
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
        
        scanner.close();
    }
}
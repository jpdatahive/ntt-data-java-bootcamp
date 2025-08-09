import java.util.Scanner; // Importa a ferramenta para ler o teclado

public class Main {

    public static void main(String[] args) {
        // --- INICIALIZAÇÃO ---
        Scanner scanner = new Scanner(System.in);
        Car meuCarro = new Car();

        // --- LOOP PRINCIPAL DO SIMULADOR ---
        while (true) {
            // Mostra o estado atual do carro (nosso "painel")
            System.out.println("\n--- PAINEL DO CARRO ---");
            System.out.println("Estado: " + (meuCarro.isLigado() ? "Ligado" : "Desligado"));
            System.out.println("Marcha: " + meuCarro.getMarcha());
            System.out.println("Velocidade: " + meuCarro.getVelocidade() + " km/h");
            System.out.println("-------------------------");

            // Mostra o menu de ações
            System.out.println("1. Ligar Carro");
            System.out.println("2. Desligar Carro");
            System.out.println("3. Acelerar");
            System.out.println("4. Frear");
            System.out.println("5. Trocar de Marcha");
            System.out.println("6. Virar");
            System.out.println("0. Sair do Simulador");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt(); // Lê o número que o usuário digitar

            // Executa a ação com base na escolha
            switch (escolha) {
                case 1:
                    meuCarro.ligarCarro();
                    break;
                case 2:
                    meuCarro.desligarCarro();
                    break;
                case 3:
                    meuCarro.acelerarCarro();
                    break;
                case 4:
                    meuCarro.frearCarro();
                    break;
                case 5:
                    // Para trocar de marcha, precisamos de mais uma informação
                    System.out.print("Digite a nova marcha: ");
                    int novaMarcha = scanner.nextInt();
                    meuCarro.trocarMarcha(novaMarcha);
                    break;
                case 6:
                    // Para virar, também precisamos de mais informação
                    System.out.print("Digite a direção (esquerda/direita): ");
                    String direcao = scanner.next(); // .next() lê uma palavra
                    meuCarro.virarCarro(direcao);
                    break;
                case 0:
                    System.out.println("Saindo do simulador. Até mais!");
                    scanner.close(); // Boa prática: fechar o scanner
                    return; // Encerra o programa
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
                    break;
            }
        }
    }
}
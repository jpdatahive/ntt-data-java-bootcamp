import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Criando nosso objeto com base na classe
    Petshop petshop = new Petshop();
    boolean executando = true;
    while (executando) {

      System.out.println("---- MENU DE OPÇÕES ----");
      System.out.println("1. Adicionar Pet");
      System.out.println("2. Retirar Pet");
      System.out.println("3. Dar banho em Pet");
      System.out.println("4. Limpar Maquina ");
      System.out.println("5. Abastecer Agua");
      System.out.println("6. Abastecer Shampoo");
      System.out.println("7. Ver estado da maquina");
      System.out.println("0. Sair");
      System.out.println("--------------------");
      System.out.print("Escolha uma opção: ");

      int opcao = scanner.nextInt();

      switch (opcao) {
        case 1:
          petshop.adicionarPet();
          break;
        case 2:
          petshop.retirarPet();
          break;
        case 3:
          petshop.darBanho();
          break;
        case 4:
          petshop.limparMaquina();
          break;
        case 5:
          petshop.abastecerAgua();
          break;
        case 6:
          petshop.abastecerShampoo();
          break;
        case 7:
          System.out.println("--- STATUS DA MÁQUINA ---");
          System.out.println("Nível de Água: " + petshop.getQuantidadeAtualAgua() + "L");
          System.out.println("Nível de Shampoo: " + petshop.getQuantidadeAtualShampoo() + "L");
          System.out.println("Máquina está suja? " + petshop.isMaquinaSuja());
          System.out.println("Tem um pet na máquina? " + petshop.isPetNaMaquina());
          System.out.println("-------------------------");
          break;
        case 0:
          executando = false;
          break;
        default:
          System.out.println("Opção inválida! Tente novamente.");
          break;
      }
    }

    System.out.println("Programa encerrado.");
    scanner.close();
  }
}

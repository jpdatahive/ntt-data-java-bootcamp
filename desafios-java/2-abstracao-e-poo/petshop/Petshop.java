public class Petshop {
    // Atributos
    private final int capacidadeMaximaAgua = 30;
    private final int capacidadeMaximaShampoo = 10;
    private boolean petNaMaquina;
    private boolean petEstaLimpo;
    private boolean maquinaSuja;
    private int quantidadeAtualAgua;
    private int quantidadeAtualShampoo;

    // Construtor
    public Petshop() {
        this.quantidadeAtualAgua = 0;
        this.quantidadeAtualShampoo = 0;
        this.maquinaSuja = false;
        this.petNaMaquina = false;
        this.petEstaLimpo = false;
    }

    // --- Métodos de Ação ---

    public void darBanho() {
        if (!this.petNaMaquina) {
            System.out.println("ERRO: Não há pet na máquina para dar banho.");
            return;
        }
        if (this.petEstaLimpo) {
            System.out.println("INFO: O pet já está limpo!");
            return;
        }
        if (this.maquinaSuja) {
            System.out.println("ERRO: A máquina está suja, limpe-a primeiro.");
            return;
        }
        if (this.quantidadeAtualAgua < 10 || this.quantidadeAtualShampoo < 2) {
            System.out.println("ERRO: Recursos insuficientes para o banho.");
            return;
        }

        System.out.println("Iniciando banho...");
        this.quantidadeAtualAgua -= 10;
        this.quantidadeAtualShampoo -= 2;
        this.petEstaLimpo = true;
        System.out.println("Banho finalizado! O pet está limpo.");
    }

    public void adicionarPet() {
        if (this.petNaMaquina) {
            System.out.println("ERRO: Já existe um pet na máquina.");
            return;
        }
        if (this.maquinaSuja) {
            System.out.println("ERRO: A máquina está suja e precisa ser limpa.");
            return;
        }
        this.petNaMaquina = true;
        this.petEstaLimpo = false;
        System.out.println("Um pet foi colocado na máquina.");
    }

    public void retirarPet() {
        if (!this.petNaMaquina) {
            System.out.println("ERRO: Não há pet para retirar.");
            return;
        }
        if (!this.petEstaLimpo) {
            this.maquinaSuja = true;
            System.out.println("Pet sujo foi retirado. A MÁQUINA AGORA ESTÁ SUJA!");
        } else {
            System.out.println("Pet limpo foi retirado.");
        }
        this.petNaMaquina = false;
    }

    public void limparMaquina() {
        if (!this.maquinaSuja) {
            System.out.println("INFO: A máquina já está limpa.");
            return;
        }
        if (this.quantidadeAtualAgua < 3 || this.quantidadeAtualShampoo < 1) {
            System.out.println("ERRO: Recursos insuficientes para a limpeza.");
            return;
        }
        this.quantidadeAtualAgua -= 3;
        this.quantidadeAtualShampoo -= 1;
        this.maquinaSuja = false;
        System.out.println("Máquina limpa com sucesso.");
    }

    public void abastecerAgua() {
        if (this.quantidadeAtualAgua + 2 > this.capacidadeMaximaAgua) {
            System.out.println("ERRO: Capacidade máxima de água será ultrapassada.");
        } else {
            this.quantidadeAtualAgua += 2;
            System.out.println("Água abastecida. Nível atual: " + this.quantidadeAtualAgua + "L");
        }
    }

    public void abastecerShampoo() {
        if (this.quantidadeAtualShampoo + 2 > this.capacidadeMaximaShampoo) {
            System.out.println("ERRO: Capacidade máxima de shampoo será ultrapassada.");
        } else {
            this.quantidadeAtualShampoo += 2;
            System.out.println("Shampoo abastecido. Nível atual: " + this.quantidadeAtualShampoo + "L");
        }
    }

    // --- Métodos Getters ---

    public int getQuantidadeAtualAgua() {
        return this.quantidadeAtualAgua;
    }

    public int getQuantidadeAtualShampoo() {
        return this.quantidadeAtualShampoo;
    }

    public boolean isMaquinaSuja() {
        return this.maquinaSuja;
    }

    public boolean isPetEstaLimpo() {
        return this.petEstaLimpo;
    }

    public boolean isPetNaMaquina() {
        return this.petNaMaquina;
    }
}
public class Car {
    // Determinando as propriedades da classe
    private boolean carroLigado;
    private boolean acelerando;
    private boolean esquerda;
    private int marcha;
    private int velocidade;

    // Construtor do carro
    public Car() {
        this.carroLigado = false;
        this.acelerando = false;
        this.velocidade = 0;
        this.marcha = 0;
    }

    // Métodos do carro
    // Método para ligar
    public void ligarCarro() {
        if (this.carroLigado == false) {
            System.out.println("Ligando o carro...");
                this.carroLigado = true;
        } else {
            System.out.println("Carro já está ligado.");
            return;
        }        
    }

    // Método para desligar
    public void desligarCarro() {
        if (this.carroLigado) {
            System.out.println("Desligando o carro...");
            if (this.velocidade == 0 & this.marcha == 0) {
                this.carroLigado = false;
            } else {
                System.out.println("O carro precisa estar em ponto morto (marcha 0) e parado para desligar.");
                return;
            }

        } else {
            System.out.println("Carro já está desligado");
            return;
        }
    }

    public void passarMarcha() {
        if (this.marcha == 0) {
            System.out.println("Deseja sair do ponto morto?");
        }
    }

    // Método para acelerar
    public void acelerarCarro() {
        if (this.carroLigado == false) {
            System.out.println("O carro está desligado, não pode realizar nenhuma ação");
            return;
        } else if (this.carroLigado) {
            if (this.marcha == 0) {
                System.out.println("Não é possível andar com o carro no ponto morto.");
                return;
            }

            while (this.velocidade <= 120) {
                this.velocidade += 1;
                System.out.printf("Acelerando carro... Velocidade atual: ", this.velocidade, "\n");
                if (this.velocidade == 120) {
                    System.out.println("Velocidade máxima atingida.");
                    System.out.println("Não é possível mais acelerar");
                    return;
                }

            }
        }

    }

}


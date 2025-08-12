public class Car {
    // Propriedades da classe Carro (Car)
    private boolean carroLigado;
    private int marcha;
    private int velocidade;

    // Construtor da classe Carro (Car)
    public  Car() {
        this.carroLigado = false;
        this.marcha = 0;
        this.velocidade = 0;

    }

    // Métodos da classe
    // Método de ligar o carro
    public void ligarCarro() {
        if (this.carroLigado) {
            System.out.println("O carro já está ligado");
            return;
        }
        System.out.println("Ligando o carro...");
        this.carroLigado = true;
        this.velocidade = 0;
        this.marcha = 0;
        System.out.println("Carro ligado");
        System.out.printf("Marcha atual: %d\n", this.marcha);
        System.out.printf("Veocidade atual: %d\n", this.velocidade);
        return;
    }

    // Método de desligar o carro
    public void desligarCarro() {
        // Verificação adicionada
        if (!this.carroLigado) {
            System.out.println("O carro já está desligado.");
            return;
        }

        if (this.marcha != 0) {
            System.out.println("Carro não pode ser desligado. Deve estar em ponto morto.");
            return;
        }
        
        if (this.velocidade != 0) {
            System.out.println("Carro não pode ser desligado. Deve estar parado.");
            return;
        }

        System.out.println("Desligando carro...");
        this.carroLigado = false;
        System.out.println("Carro desligado.");
    }

    // Método de acelerar o carro
    public void acelerarCarro() {
        if (!this.carroLigado) {
            System.out.println("Carro não pode acelerar, está desligado.");
            return;
        }

        if (this.marcha == 0) {
            System.out.println("Carro não pode acelerar no ponto morto.");
            return;
        }

        if (this.marcha == 1) {
            if (this.velocidade == 20) {
                System.out.println("Limite de velocidade para a marcha atingido. Troque de marcha.");
                return;
            }
        }

        if (this.marcha == 2) {
            if (this.velocidade == 40) {
                System.out.println("Limite de velocidade para a marcha atingido. Troque de marcha.");
                return;
            }
        }

        if (this.marcha == 3) {
            if (this.velocidade == 60) {
                System.out.println("Limite de velocidade para a marcha atingido. Troque de marcha.");
                return;
            }
        }

        if (this.marcha == 4) {
            if (this.velocidade == 80) {
                System.out.println("Limite de velocidade para a marcha atingido. Troque de marcha.");
                return;
            }
        }

        if (this.marcha == 5) {
            if (this.velocidade == 100) {
                System.out.println("Limite de velocidade para a marcha atingido. Troque de marcha.");
                return;
            }
        }

        if (this.marcha == 6) {
            if (this.velocidade == 120) {
                System.out.println("Velocidade máxima atingida. Só pode reduzir a velocidade agora.");
                return;
            }
        }

        this.velocidade += 1;
        System.out.printf("Velocidade atual: %dkm/h.\n", this.velocidade);
    }

    // Método de desacelerar
    public void frearCarro() {
        if (!this.carroLigado) {
            System.out.println("Carro está desligado, não pode desacelerar.");
            return;
        }

        if (this.velocidade == 0) {
            System.out.println("Carro já está parado, não pode diminuir mais a velocidade.");
            return;
        }

        this.velocidade -= 1;
        System.out.printf("Diminuindo a velocidade. Velocidade atual: %dkm/h.\n", this.velocidade);
    }

    // Método de direção
    public void virarCarro(String direcao) {
        if (!this.carroLigado) {
            System.out.println("Carro deve estar ligado para fazer a curva.");
            return;
        }

        if (this.velocidade == 0) {
            System.out.println("Carro deve estar em movimento para fazer a curva.");
            return;
        }

        if (this.velocidade > 40) {
            System.out.println("Velocidade alta de mais para realizar a curva. Diminua a velocidade.");
            return;
        }

        System.out.println("Virando o carro para a " + direcao);

    }

    // Método de troca de marchas
    public void trocarMarcha(int novaMarcha) {
        if (!this.carroLigado) {
            System.out.println("Carro deve estar ligado para trocar de marcha.");
            return;
        }

        if (novaMarcha == this.marcha) {
            System.out.println("Carro já está na marcha " + novaMarcha);
            return;
        }

        boolean podeTrocar = false;

        // Lógica para subir a marcha
        if (novaMarcha > this.marcha) {
            if (novaMarcha != this.marcha + 1) {
                System.out.println("A troca de marchas deve ser sequencial.");
                return;
            }
            switch(this.marcha) {
                case 0: if (this.velocidade == 0) podeTrocar = true; break;
                case 1: if (this.velocidade == 20) podeTrocar = true; break;
                case 2: if (this.velocidade == 40) podeTrocar = true; break;
                case 3: if (this.velocidade == 60) podeTrocar = true; break;
                case 4: if (this.velocidade == 80) podeTrocar = true; break;
                case 5: if (this.velocidade == 100) podeTrocar = true; break;
            }
        }

        else {
            if (novaMarcha != this.marcha - 1) {
                System.out.println("A troca de marcha deve ser sequencial.");
                return;
            }
            switch(this.marcha) {
                case 1: if (this.velocidade == 0) podeTrocar = true; break;
                case 2: if (this.velocidade == 21) podeTrocar = true; break;
                case 3: if (this.velocidade == 41) podeTrocar = true; break;
                case 4: if (this.velocidade == 61) podeTrocar = true; break;
                case 5: if (this.velocidade == 81) podeTrocar = true; break;
                case 6: if (this.velocidade == 101) podeTrocar = true; break;
            }    
        }

        if (podeTrocar) {
            this.marcha = novaMarcha;
            System.out.println("Marcha trocada com sucesso para: " + novaMarcha);
        } else {
            System.out.println("A velocidade atual (" + this.velocidade + "km/h) não permite a troca de marcha");
        }

    }

    // Getters
    public int getVelocidade() {
        return this.velocidade;
    }

    public int getMarcha() {
        return this.marcha;
    }

    public boolean isLigado() {
        return this.carroLigado;
    }

}
# Desafio: Simulador de Carro

Este projeto consiste na criação de uma classe `Car` que simula o comportamento de um carro real, com foco na interação entre velocidade e marchas.

## Regras de Negócio

### Estado Inicial
1.  Quando um novo objeto `Car` for criado, ele deve sempre começar com as seguintes características:
    - **Estado:** Desligado
    - **Marcha:** 0 (Ponto Morto)
    - **Velocidade:** 0 km/h

### Condições Gerais
2.  **Carro Desligado:** Nenhuma função (acelerar, trocar de marcha, etc.) pode ser executada se o carro estiver desligado, com exceção do método para ligá-lo.
3.  **Ligar:** O carro pode ser ligado a qualquer momento.
4.  **Desligar:** O carro só pode ser desligado se estiver parado (velocidade 0 km/h) e em ponto morto (marcha 0).

### Movimento e Velocidade
5.  **Acelerar:** Incrementa a velocidade em 1 km/h a cada chamada, até um máximo de 120 km/h.
6.  **Frear:** Decrementa a velocidade em 1 km/h a cada chamada, até um mínimo de 0 km/h.
7.  **Virar (Esquerda/Direita):** O carro só pode virar se estiver em movimento, com velocidade entre 1 km/h e 40 km/h.

### Marchas e Velocidade
8.  **Troca de Marcha:** As marchas devem ser trocadas sequencialmente (1ª -> 2ª, 2ª -> 3ª, etc.), não sendo permitido pular marchas.
9.  **Limites de Velocidade por Marcha:** A aceleração e a troca de marchas devem respeitar os seguintes limites:
    - **Ponto Morto (Marcha 0):** Não é possível acelerar.
    - **1ª Marcha:** Velocidade entre 0 e 20 km/h.
    - **2ª Marcha:** Velocidade entre 21 e 40 km/h.
    - **3ª Marcha:** Velocidade entre 41 e 60 km/h.
    - **4ª Marcha:** Velocidade entre 61 e 80 km/h.
    - **5ª Marcha:** Velocidade entre 81 e 100 km/h.
    - **6ª Marcha:** Velocidade entre 101 e 120 km/h.

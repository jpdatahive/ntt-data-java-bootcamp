# Desafio - Petshop

Este projeto simula o funcionamento de uma máquina de banho para pets em um petshop.

## Regras de Negócio

- **Capacidade e Uso:**
    1. A máquina só pode conter 1 pet por vez.
    2. A capacidade máxima é de 30 litros de água e 10 litros de shampoo.
    3. Cada banho consome 10L de água e 2L de shampoo.
    4. A limpeza da máquina consome 3L de água e 1L de shampoo.
    5. O reabastecimento (água ou shampoo) adiciona 2L por vez.

- **Estados e Condições:**
    6. Um pet pode estar `dentro` ou `fora` da máquina.
    7. Um pet dentro da máquina pode estar `limpo` ou `sujo`.
    8. A máquina pode estar `limpa` ou `suja`.
    9. Se um pet é retirado sem ter tomado banho (ou seja, `sujo`), a máquina fica `suja`.
    10. Uma máquina `suja` precisa ser limpa antes de receber um novo pet.

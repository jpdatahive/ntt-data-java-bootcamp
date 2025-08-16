# Desafio: Formatador de Números de Telefone

O objetivo deste desafio é criar um programa que recebe entradas de números de telefone sem formatação e as retorna formatadas de acordo com padrões específicos.

## Requisitos

O código deve ser capaz de detectar e formatar as seguintes situações:

1.  **Detecção Automática por Quantidade de Dígitos:**
    *   Se receber uma string contendo apenas números, deve formatá-la com base na quantidade de dígitos:
        *   **8 dígitos:** Formatar como telefone fixo sem DDD (`xxxx-xxxx`).
        *   **9 dígitos:** Formatar como celular sem DDD (`xxxxx-xxxx`).
        *   **10 dígitos:** Formatar como telefone fixo com DDD (`(xx)xxxx-xxxx`).
        *   **11 dígitos:** Formatar como celular com DDD (`(xx)xxxxx-xxxx`).

2.  **Tratamento de Entradas Inválidas:**
    *   Se a quantidade de números na entrada for diferente dos padrões acima, deve informar que o número é inválido.

3.  **Identificação de Números Já Formatados:**
    *   Se receber um número que já está em um dos formatos corretos, deve retorná-lo como está e informar de qual tipo de dispositivo se trata (Fixo ou Celular).

4.  **Correção de Máscara:**
    *   Se receber um número com uma máscara incorreta (ex: `(11)9999-9999`), deve corrigir para o formato correto (`(11)99999-9999`) e retorná-lo.

5.  **Limpeza de Caracteres:**
    *   Se a entrada contiver uma mistura de números e outros caracteres (ex: `abc11def99999-9999xyz`), deve extrair apenas os dígitos, verificar se a quantidade corresponde a um padrão válido e, em caso afirmativo, retornar o número formatado. Caso contrário, informar que a entrada é inválida.

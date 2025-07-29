### Guia Prático de Engenharia de Prompt para Desenvolvedores

A Engenharia de Prompt é a arte de criar entradas (prompts) claras e eficazes para modelos de linguagem (LLMs) a fim de obter as respostas mais precisas, relevantes e úteis possíveis. Para desenvolvedores, é uma habilidade fundamental para acelerar o aprendizado, a geração de código, a depuração e muito mais.

#### Princípios Fundamentais (Boas Práticas)

1.  **Clareza e Especificidade:** Seja direto e evite ambiguidades. Quanto mais específico o seu pedido, melhor o resultado.
    *   **Ruim:** "Faça uma função em Python."
    *   **Bom:** "Crie uma função em Python chamada `calcular_media` que aceita uma lista de números como argumento e retorna a média deles."

2.  **Contexto é Rei:** Forneça todo o contexto necessário para que o modelo entenda o cenário. Isso inclui a linguagem, frameworks, bibliotecas e até trechos de código relevantes.
    *   **Ruim:** "Como conserto esse erro?"
    *   **Bom:** "Estou usando React com TypeScript. Ao tentar passar um estado para um componente filho, recebo o erro 'Type 'string' is not assignable to type 'number''. Abaixo estão os componentes Pai e Filho:" `[código aqui]`

3.  **Defina o Papel (Persona):** Instrua o modelo a agir como um especialista. Isso ajusta o tom, o estilo e a profundidade da resposta.
    *   **Exemplo:** "Aja como um desenvolvedor Sênior de Go, especialista em concorrência. Revise o código abaixo e aponte possíveis condições de corrida (race conditions)."

4.  **Estruture a Saída Desejada:** Peça explicitamente pelo formato que você quer. Isso economiza tempo de formatação manual.
    *   **Exemplo:** "Gere uma lista de objetos JSON com as chaves 'nome_funcao' e 'descricao_curta' para os principais métodos da API de `Array` do JavaScript."
    *   **Exemplo:** "Explique o conceito de 'ownership' em Rust usando uma analogia simples, em formato de lista (bullet points)."

5.  **Iteração e Refinamento:** O primeiro prompt raramente é o final. Use a primeira resposta como ponto de partida e refine seu prompt com mais detalhes, restrições ou exemplos para chegar ao resultado ideal.

6.  **Use Exemplos (Few-Shot Prompting):** Forneça um ou dois exemplos de entrada e saída no seu prompt para guiar o modelo sobre o padrão que você espera.
    *   **Exemplo:** "Traduza o seguinte verbo do infinitivo para o gerúndio em inglês. Exemplo: 'to walk' -> 'walking'. Agora, traduza 'to eat'."

#### Aplicações Práticas no Dia a Dia do Desenvolvedor

| Tarefa | Exemplo de Prompt |
| :--- | :--- |
| **Geração de Código** | "Gere um componente de formulário de login em React usando hooks (`useState`, `useEffect`) e a biblioteca `axios` para a submissão. O formulário deve ter campos para email e senha." |
| **Explicação de Código** | "Explique o que este trecho de código em Elixir faz, linha por linha, com foco na função do `Enum.reduce`:" `[código aqui]` |
| **Refatoração** | "Refatore este código Java para usar a API de Streams (Java 8+) em vez de loops `for` tradicionais, tornando-o mais funcional e conciso." `[código aqui]` |
| **Debugging** | "Estou recebendo um `TypeError: 'NoneType' object is not iterable` neste script Python. Analise o código e aponte a causa provável do erro e como corrigi-lo." `[código e traceback aqui]` |
| **Criação de Testes** | "Escreva três testes de unidade para a função TypeScript abaixo usando o framework `jest`. Cubra o caso de sucesso, um caso com entrada inválida e um caso de borda." `[código da função aqui]` |
| **Documentação** | "Gere uma docstring completa no formato Google para a função Python abaixo, incluindo descrição, argumentos (`Args`), e o que ela retorna (`Returns`)." `[código da função aqui]` |
| **Aprendizado** | "Qual a diferença fundamental entre `async/await` em JavaScript e goroutines em Go? Explique como se eu fosse um desenvolvedor experiente em JavaScript, mas novo em Go." |
| **Comandos de Shell** | "Crie um comando `grep` para encontrar todos os arquivos `.md` que contenham a palavra 'API' (case-insensitive), mas excluindo o diretório `node_modules`." |

#### Técnica Avançada: "Chain of Thought" (Cadeia de Pensamento)

Para problemas complexos, peça ao modelo para "pensar passo a passo". Isso o força a detalhar o raciocínio, o que frequentemente leva a uma solução mais correta, especialmente em lógica ou algoritmos.

*   **Exemplo:** "Preciso otimizar uma consulta SQL. Primeiro, analise a consulta e o schema da tabela. Depois, explique passo a passo quais índices você criaria e por quê. Por fim, reescreva a consulta otimizada."

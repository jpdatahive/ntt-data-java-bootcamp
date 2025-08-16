# Desafio: Serviço de Mensagens de Marketing

O objetivo deste desafio é criar uma hierarquia de classes em Java para modelar um serviço de envio de mensagens de marketing, aplicando os conceitos de Herança e Polimorfismo.

## Requisitos

1.  **Interface ou Classe Abstrata (`MarketingService`):**
    *   Deve definir um método comum para enviar mensagem, por exemplo: `sendMessage(String message)`.

2.  **Classes Concretas (Serviços):**
    *   **`SmsService`**: Implementa/estende `MarketingService` e simula o envio de um SMS.
    *   **`EmailService`**: Implementa/estende `MarketingService` e simula o envio de um E-mail.
    *   **`SocialMediaService`**: Implementa/estende `MarketingService` e simula o envio para Redes Sociais.
    *   **`WhatsappService`**: Implementa/estende `MarketingService` e simula o envio para o WhatsApp.

3.  **Classe de Teste (`Main`):**
    *   Deve ser capaz de criar instâncias de cada serviço.
    *   Deve demonstrar o polimorfismo enviando a mesma mensagem através de diferentes serviços.

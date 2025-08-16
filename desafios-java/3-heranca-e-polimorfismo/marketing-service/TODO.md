# Checklist de Desenvolvimento: Serviço de Marketing

- [ ] **1. Interface/Classe Abstrata: `MarketingService`**
    - [ ] Criar a interface ou classe abstrata `MarketingService`.
    - [ ] Adicionar a assinatura do método `sendMessage(String message)`.

- [ ] **2. Classes de Serviço**
    - [ ] Criar a classe `SmsService` que implementa `MarketingService`.
    - [ ] Criar a classe `EmailService` que implementa `MarketingService`.
    - [ ] Criar a classe `SocialMediaService` que implementa `MarketingService`.
    - [ ] Criar a classe `WhatsappService` que implementa `MarketingService`.

- [ ] **3. Classe de Teste (`Main`)**
    - [ ] Criar uma classe `Main` com um método `main`.
    - [ ] Instanciar objetos de cada tipo de serviço.
    - [ ] Chamar o método `sendMessage` em cada objeto para verificar o polimorfismo.

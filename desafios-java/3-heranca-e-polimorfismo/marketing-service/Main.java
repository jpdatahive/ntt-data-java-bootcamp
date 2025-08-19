public class Main {
    public static void main(String[] args) {
        // Definindo a mensagem padrão
        String marketingMessage = "Aproveite nossa promoção de 50% de desconto em todos os produtos!";

        // Instanciando os serviços
        MarketingService smsService = new SmsService();
        MarketingService emailService = new EmailService();
        MarketingService socialMediaService = new SocialMediaService();
        MarketingService whatsappService = new WhatsappService();

        // Criando um array de serviços para demonstrar o polimorfismo
        MarketingService[] services = {smsService, emailService, socialMediaService, whatsappService};

        System.out.println("--- Disparando Campanha de Marketing ---");

        // Iterando sobre os serviços e enviando a mensagem
        // O método sendMessage() correto é chamado para cada tipo de serviço
        for (MarketingService service : services) {
            service.sendMessage(marketingMessage);
        }
    }
}

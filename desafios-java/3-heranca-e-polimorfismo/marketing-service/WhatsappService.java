public class WhatsappService implements MarketingService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Enviando via WhatsApp: " + message);
    }
}

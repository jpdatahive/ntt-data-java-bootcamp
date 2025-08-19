public class EmailService implements MarketingService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Enviando Email: " + message);
    }
}

public class SmsService implements MarketingService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Enviando SMS: " + message);
    }
}

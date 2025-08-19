public class SocialMediaService implements MarketingService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Postando em Redes Sociais: " + message);
    }
}

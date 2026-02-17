import javax.crypto.spec.PSource;

public class StreamingService extends Service
        implements PremiumFeature {

    // TODO: declare premium field
    private boolean premium;

    // TODO: constructor
    public StreamingService(String name, int id) {
        super(name, id);
        this.premium = false;
    }

    @Override
    public void performService() {

        // TODO:
        // check if service is active
        // print different message for premium and normal

        if (getisActive()) {
            System.out.println("Streaming content in High Definition...");
        } else{
            System.out.println("Error: Cannot stream. Service is inactive.");
        }

    }

    @Override
    public void upgradeToPremium() {

        // TODO:
        // set premium = true
        // print message
        premium = true;
        System.out.println("This service was upgraded to premium ");

    }
}

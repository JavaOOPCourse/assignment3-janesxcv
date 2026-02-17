public class CloudStorageService extends Service
        implements PremiumFeature, Billable {

    // TODO: declare premium field
    private boolean premium;


    // TODO: constructor
    public CloudStorageService(String name, int id) {
        super(name, id);
        this.premium = false;
    }


    @Override
    public void performService() {

        // TODO:
        // check if active
        // print cloud access message
        if (getisActive()) {
            System.out.println("Syncing files to the cloud...");
        } else {
            System.out.println("Error: Cloud storage is unavailable.");
        }

    }

    @Override
    public void upgradeToPremium() {

        // TODO:
        // enable premium
        // print message
        premium = true;
        System.out.println("Adding 2TB of extra storage space.");

    }

    @Override
    public void generateBill() {

        // TODO:
        // print billing message
        System.out.println("Billing: $9.99 calculated for Cloud Storage usage.");

    }
}

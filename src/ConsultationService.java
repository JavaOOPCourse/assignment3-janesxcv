public class ConsultationService extends Service
        implements Billable {

    // TODO: constructor
    public ConsultationService(String name, int id) {
        super(name, id);
    }

    @Override
    public void performService() {

        // TODO:
        // check active
        // print consultation message
        if (getisActive()) {
            System.out.println("Streaming content in High Definition..");
        } else{
            System.out.println("Error: Cannot consult. Service is inactive.");
        }

    }

    @Override
    public void generateBill() {

        // TODO:
        // print billing message
        System.out.println("Billing: $50.00 for the consultation session.");
    }
}

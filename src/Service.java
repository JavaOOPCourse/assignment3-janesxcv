public abstract class Service {

    // TODO: declare private fields
    // serviceName
    // serviceId
    // isActive
    private String name;
    private int id;
    private boolean isActive;


    // TODO: constructor
    public Service(String name, int id) {
        this.name = name;
        this.id = id;
        this.isActive = false;
    }


    // TODO: activateService()
    // should set isActive = true
    // print activation message
    public void activateService() {
        isActive = true;
        System.out.println(getServiceName()+"is now active");
    }


    // TODO: deactivateService()
    // should set isActive = false
    // print deactivation message
    public void deactivateService() {
        isActive = false;
        System.out.println(getServiceName()+ "is now not active");
    }


    // TODO: getter for serviceName
    public String getServiceName() {return name;}

    // TODO: getter for isActive
    public boolean getisActive() {
        return isActive;
    }



    // TODO: abstract method performService()

    public abstract void performService();

}

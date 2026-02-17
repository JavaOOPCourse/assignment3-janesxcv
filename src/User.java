public abstract class User {

    // TODO: declare fields
    // name
    //id
    private String name;
    private int id;


    // TODO: constructor
    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {return name;}

    public int getId() {return id;}


    // TODO: abstract method manageService(Service s)
    public abstract void manageService(Service s);


    // TODO: abstract method useService(Service s)
    public abstract void useService(Service s);
}

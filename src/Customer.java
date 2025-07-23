public class Customer {
    private String name;
    private int creditLimit;
    private String email;

    public Customer(String name,int creditLimit,String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public Customer() {
        this("Tijani Teslim","mail@teslim.com");
    }
    public Customer(String name,String email) {
        this( name,500000,email);
    }


    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}

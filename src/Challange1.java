public class Challange1 {
    public static void main(String[] args) {
        Customer c1 = new Customer("Disha",100000.0,"disha@email.com");
        Customer c2 = new Customer();
        System.out.println(c1.getName()+c1.getEmailAddress()+c1.getCreditLimit());
        System.out.println(c2.getName()+c2.getEmailAddress()+c2.getCreditLimit());
    }
}

class Customer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    Customer(){
        name = "Riya";
        creditLimit = 1000.0;
        emailAddress = "emailAddress";
    }

    Customer(String name, double creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }
    public double getCreditLimit() {
        return creditLimit;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
}

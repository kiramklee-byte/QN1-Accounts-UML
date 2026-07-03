public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Lucy");

        SavingsAccount sa = new SavingsAccount("S001", 1000, 10);
        CurrentAccount ca = new CurrentAccount("C001", 500, 300);

        customer.addAccount(sa);
        customer.addAccount(ca);

        sa.addInterest();
        ca.withdraw(700);

        System.out.println(sa.generateStatement());
        System.out.println(ca.generateStatement());
        System.out.println("Total Worth: " + customer.totalWorth());
    }
}
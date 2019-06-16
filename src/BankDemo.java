public class BankDemo {
    public static void main(String[] args) {
        CheckingAccount c = new CheckingAccount(101);
        System.out.println("Depositing $500");
        c.deposit(500);

        try {
            System.out.println("\n Withdrawing $100");
            c.withdraw(100);
            System.out.println("\n Withdrawing $500");
            c.withdraw(600);
        } catch (InSufficientFundsException e) {
            System.out.println("Sorry, you are short $" + e.getAmount());
            e.printStackTrace();
        }
    }
}

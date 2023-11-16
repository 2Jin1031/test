public class ClassExample {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        System.out.println(bankAccount);
        bankAccount.changePassword(123456);
        System.out.println(bankAccount.getPassword());
    }
}

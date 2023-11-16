public class SavingsAccount extends BankAccount implements Withdrawable {
    // 자유 입출금 통장 만들기
    boolean isOverdraft; // 마이너스 기능
    public void inquiry() {};

    public void withdraw() {
        System.out.println("Withdraw");
    }
}





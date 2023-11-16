public class BankAccount {

    // 멤버 변수
    // private => 동일 클래스 내에서만 참조, 수정, 조회 가능
    private int bankCode; // 각 은행이 가지는 개별적인 코드
    private int accountNo; // 계좌 번호
    private String owner; // 예금주
    private int balance; // 잔액
    private boolean inDormant; // 휴면 계좌인 지 아닌지
    private int password; // 계좌 비밀 번호

    // 메소드
    public void inquiry() {} // 계좌 조회
    public void deposit() {} // 계좌 입금
    //public void withdraw() {} // 출금
    public void heldInDormant() {} // 휴면 계좌로 전환

    public void changePassword(int password) {
        this.password = password;
    }
    // 생성자
    // 클래스 내부에 정의, 생성자 메서드 명은 클래스 명과 일치 해야 함

    BankAccount() {} // 프로그래밍 상 자동으로 만들어줌 (아무런 생성자가 없을 때)
    BankAccount(
            int bankCode,
            int accountNo,
            String owner,
            int balance,
            int password,
            boolean inDormant
    ) { // 중괄호 안에는 데이터를 할당해서 실제적으로 의미있는 인스턴스를 만드는 과정
        // this는 자기자신을 가르킴
        this.bankCode = bankCode; // 왼쪽에 있는 bankCode는 클래스 안에 명시된 bankcode를 가리키고 오른쪽에 있는 bankcode는 사용자로부터 입력 받는 bankcode 값
        this.accountNo = accountNo;
        this.owner = owner;
        this.balance = balance;
        this.password = password;
        this.inDormant = inDormant;
    }
    // getter: 조회, setter: 수정
    public int getBankCode() {
        return bankCode;
    }

    public void setBankCode(int bankCode) {
        this.bankCode = bankCode;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean isInDormant() {
        return inDormant;
    }

    public void setInDormant(boolean inDormant) {
        this.inDormant = inDormant;
    }
}

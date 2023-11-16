package InterfaceTest;

interface ResCustomer {
    String getOrder();
}

class ResCustomerA implements ResCustomer {
    public String getOrder () {
        return "손님 A에게 김치찌개를 준다";
    }
}

class ResCustomerB implements ResCustomer {
    @Override
    public String getOrder() {
        return "손님 B에게 제육볶음을 준다";
    }
}

class ResOwner {
    public void giveFood(ResCustomer resCustomer) {
        System.out.println(resCustomer.getOrder());
    }
}

public class MyInterfaceTest2 {
    public static void main(String[] args) {
        ResOwner owner = new ResOwner();
        ResCustomerA a = new ResCustomerA();
        ResCustomerB b = new ResCustomerB();

        owner.giveFood(a);
        owner.giveFood(b);
    }
}
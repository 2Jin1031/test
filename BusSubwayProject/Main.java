package BusSubwayProject;

class Student {
    String studentName;
    int tMoney;

    public Student() {
    }

    public Student(String studentName, int tMoney) {
        this.studentName = studentName;
        this.tMoney = tMoney;
    }

    void takeBus(Bus bus) {
        bus.take(1500);
        this.tMoney -= 1500;
    }

    void takeSubway(Subway subway) {
        subway.take(1400);
        this.tMoney -= 1400;
    }

    void showStudentInfo() {
        System.out.println(studentName + "님의 잔액은 " + tMoney + "원 입니다.");
    }
}

class Bus {
    int busNumber;
    int passengerCount;
    int money;
    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }
    void take(int money) {
        this.money += money; // money += money; 라고 쓰면 money가 지역변수인지 멤버변수인지 구분이 가지 않기 때문에 this.money로 표시해줘야 함 -> 멤버 변수인 money를 가리키기 위해 this를 앞에 붙여줌
        passengerCount++; // passengerCount는 이름이 충돌하지 않기 때문에 this를 사용하지 않아도 가능!
    }

    void showBusInfo() {
        System.out.println("버스 번호 : " + busNumber);
        System.out.println("버스 승객 수 : " + passengerCount);
        System.out.println("버스 회사 수입 : " + money);
        System.out.println("=======================");
    }

}

class Subway {

    int lineNumber;
    int passengerCount;
    int money;
    public Subway(int lineNumber) {
        this.lineNumber = lineNumber;
    }
    void take(int money) {
        this.money += money;
        this.passengerCount++;
    }

    void showSubwayInfo() {
        System.out.println("지하철 노선 번호: " + lineNumber);
        System.out.println("지하철 승객 수: " + passengerCount);
        System.out.println("지하철 회사 수입 : " + money);
        System.out.println("=========================");
    }
}
public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("강해린", 50000);
        Student student2 = new Student("킴민지", 30000);

        Bus bus2227 = new Bus(2227);
        Subway subway7 = new Subway(7);

        student1.takeBus(bus2227);
        student2.takeSubway(subway7);

        student1.showStudentInfo();
        student2.showStudentInfo();

        bus2227.showBusInfo();
        subway7.showSubwayInfo();

    }
}

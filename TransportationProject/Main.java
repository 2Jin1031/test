package TransportationProject;

class Student {
    final private String studentName;
    private int tmoney;
    int time;
    int transfer;

    public Student(String studentName, int tmoney) {
        this.studentName = studentName;
        this.tmoney = tmoney;
    }

    void takeBus(Bus bus, int time) {
        int money = 1500;
        if (time - this.time < 30) {
            money = 0;
        }
        bus.take(money);
        tmoney -= money;
        this.time = time;
    }

    void takeSubway(Subway subway, int time) {
        int money = 1400;
        if (time - this.time < 30) {
            transfer++;
            money = 0;
        }
        subway.take(money);
        tmoney -= money;
        this.time = time;
    }

    void showInfo() {
        System.out.println(studentName + "님의 잔액은 " + tmoney + "원입니다.");
        System.out.println("환승 횟수는 " + transfer + "번입니다.");
    }

}

class Bus {
    final private String number;
    private int passenger;

    private int money;

    public Bus(String number) {
        this.number = number;
    }

    void take(int money) {
        this.money += money;
        passenger++;
    }

    void showInfo() {
        System.out.println("=====" + number + "버스의 정보======");
        System.out.println("현재 승객의 수는 " + passenger + "입니다.");
        System.out.println("현재 수익은 " + money + "입니다");
    }
}

class Subway {

    final private String number;
    private int passenger;
    private int money;


    public Subway(String number) {
        this.number = number;
    }

    void take(int money) {
        this.money += money;
        passenger++;
    }

    void showInfo() {
        System.out.println("=====" + number + "호선 지하철의 정보======");
        System.out.println("현재 승객의 수는 " + passenger + "입니다.");
        System.out.println("현재 수익은 " + money + "입니다");
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("김진주", 10000);
        Student student2 = new Student("이진", 22000);

        Bus bus2227 = new Bus("2227");
        Bus bus02 = new Bus("02");
        Subway subway7 = new Subway("7");

        //student1.tmoney = 0;
        student1.takeBus(bus2227, 0130);

        student2.takeBus(bus02, 0230);
        student2.takeSubway(subway7, 0240);
        student2.takeBus(bus2227, 0300);

        student1.showInfo();
        student2.showInfo();
        bus2227.showInfo();
        bus02.showInfo();
        subway7.showInfo();
    }

}


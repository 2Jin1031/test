//package InterfaceTest;
//
//class Guest {
//    private String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}
//
//class Guest1 extends Guest {
//    private String modifier;
//
//    public String getModifier() {
//        return modifier;
//    }
//
//    public void setModifier(String modifier) {
//        this.modifier = modifier;
//    }
//}
//
//class Guest2 extends Guest {
//
//}
//
//class Owner {
//    public void giveFood(Guest1 guest1) {
//        System.out.println("단골1번 이신 " + guest1.getName() + " 손님에게 참치김밥을 준다." + guest1.getModifier());
//    }
//    public void giveFood(Guest2 guest2) {
//        System.out.println("단골2번 이신 " + guest2.getName() + " 손님에게 치즈김밥을 준다");
//    }
//}
//public class MyInterfaceTest {
//    public static void main(String[] args) {
//        Owner owner = new Owner();
//
//        Guest1 guest1 = new Guest1();
//        Guest2 guest2 = new Guest2();
//
//        guest1.setName("이진");
//        guest1.setModifier("(정말 자주 오시니 잘 챙겨 드리려)");
//        guest2.setName("고윤정");
//
//        owner.giveFood(guest1);
//        owner.giveFood(guest2);
//    }
//
//}

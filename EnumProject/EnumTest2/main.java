package EnumProject.EnumTest2;

public class main {
    public static void main(String[] args) {
        MenuItem[] menuItems = MenuItem.getMenuNames();

        for (int i = 0; i < menuItems.length; i++) {
            System.out.println(menuItems[i]);
        }
    }
}

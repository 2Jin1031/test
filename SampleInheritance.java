import lombok.Setter;

@Setter
class Animal {
    protected String name;
}

class Dog extends Animal {
    void onomatopoeia() {
        System.out.println(name+" 멍멍");
    }
}

public class SampleInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "poppy";
        System.out.println(dog.name);
        dog.onomatopoeia();
    }
}
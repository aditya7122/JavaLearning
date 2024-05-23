package construcor_learning;

public class Constructor {
    public static void main(String[] args) {
        Dog one = new Dog();
        Dog two = new Dog("Tommy", 4);
    }
}

class Dog {
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog() {
        this.name = "No Name";
        this.age = 0;
    }
}

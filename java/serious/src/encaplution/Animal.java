package encaplution;

public class Animal {

    public void display() {
        System.out.println("This is an animal");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}

class Dog extends Animal {
}


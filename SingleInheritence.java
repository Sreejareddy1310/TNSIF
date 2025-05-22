class Animal {
    String name;

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    String breed;

    void bark() {
        System.out.println("Dog is barking");
    }

    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat(); // Inherited from Animal class
        myDog.bark();
    }
}

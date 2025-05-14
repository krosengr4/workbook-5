package inheritance.animals;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        inheritanceBasics();
        overridingMethods();
        arrayListOfAnimals();
        exampleInstanceOf();
    }

    public static void inheritanceBasics () {
        Cat myCat = new Cat("Bambu", 9, "Tuxedo");

        //Because inheritance.animals.Cat is a child of inheritance.animals.Animal, we can set and get name and age, which were defined in inheritance.animals.Animal.java class
        System.out.println("My cat, " + myCat.getName() + ", is " + myCat.getAge() + " years old.");

        //We can also set the breed, which was defined in inheritance.animals.Cat.java class
        System.out.println(myCat.getName() + " is a " + myCat.getBreed());

        //Another example with a inheritance.animals.Dog object in inheritance.animals.Dog.java class
        Dog newDog = new Dog("Spot", 2, "Dalmatian");
        System.out.printf("%s is %d years old. He is a %s\n", newDog.getName(), newDog.getAge(), newDog.getBreed());
    }

    public static void overridingMethods() {
        //We override these methods so that in each class, they print out something different
        Animal.eat();
        Dog.eat();
        Cat.eat();
    }

    public static void arrayListOfAnimals() {
        Animal a1;
        a1 = new Cat("Max", 11, "Tuxedo");

        Cat c1 = new Cat ("Alex", 2, "Jungle");
        Dog d1 = new Dog("Spot", 5, "Golden Retriever");

        //Because this array list is of inheritance.animals.Animal objects, we can add both dogs and cats
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(a1);
        animals.add(c1);
        System.out.println(animals.toArray().length);
    }

    public static void exampleInstanceOf() {
        Cat myCat = new Cat("Bambu", 9, "Tuxedo");
        Dog newDog = new Dog("Spot", 2, "Dalmatian");
        Animal a1;
        a1 = new Cat("Max", 11, "Tuxedo");

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(myCat);
        animals.add(newDog);
        animals.add(a1);

        //for all the animals in the List
        for (Animal a : animals) {
            //if instance a is a inheritance.animals.Cat object
            if (a instanceof Cat) {
                System.out.println(a.getName() + " says ");
                //!Casting to force instance a to be a cat
                ((Cat)a).eat();
            }
            if (a instanceof Dog) {
                //Casting newDog instance to new instance called d2
                Dog d2 = (Dog)a;
                System.out.println(d2.getName());
            }
        }
    }
}

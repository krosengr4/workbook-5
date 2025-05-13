public class Main {

    public static void main(String[] args) {
        Cat myCat = new Cat("Bambu", 9, "Tuxedo");

        //Because Cat is a child of Animal, we can set and get name and age, which were defined in Animal.java class
        System.out.println("My cat, " + myCat.getName() + ", is " + myCat.getAge() + " years old.");

        //We can also set the breed, which was defined in Cat.java class
        System.out.println(myCat.getName() + " is a " + myCat.getBreed());

        //Another example with a Dog object in Dog.java class
        Dog newDog = new Dog("Spot", 2, "Dalmatian");
        System.out.printf("%s is %d years old. He is a %s\n", newDog.getName(), newDog.getAge(), newDog.getBreed());


        //We override these methods so that in each class, they print out something different
        Animal.eat();
        Dog.eat();
        Cat.eat();
    }
}

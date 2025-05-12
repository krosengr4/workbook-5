public class Main {

    public static void main(String[] args) {
        Cat myCat = new Cat();

        //Because Cat is a child of Animal, we can set and get name and age, which were defined in Animal class
        myCat.setAge(9);
        myCat.setName("Bambu");
        System.out.println("My cat, " + myCat.getName() + ", is " + myCat.getAge() + " years old.");

        //We can also set the breed, which was defined in Animal class
        myCat.setBreed("Tuxedo");
        System.out.println(myCat.getName() + " is a " + myCat.getBreed());

    }
}

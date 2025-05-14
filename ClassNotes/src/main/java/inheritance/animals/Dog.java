package inheritance.animals;

public class Dog extends Animal {

    String breed;

    //Use the super keyword in constructor to specify that age and name are from inheritance.animals.Animal constructor
    public Dog (String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }

    public static void eat() {
        System.out.println("Chomp Chomp");
    }


}

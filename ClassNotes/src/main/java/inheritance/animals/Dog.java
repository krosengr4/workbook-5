package inheritance.animals;

//!keyword extends makes dog a child class of animal
public class Dog extends Animal {

    String breed;

    //Use the super keyword in constructor to specify that age and name are from inheritance.animals.Animal constructor
    public Dog (String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    //region getter and setter
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }
    //endregion

    //Override eat() method to print out different message for Dog object
    public static void eat() {
        System.out.println("Chomp Chomp");
    }


}

package inheritance.animals;

public class Cat extends Animal {
//    ! The extends keyword makes inheritance.animals.Cat class a child of inheritance.animals.Animal class
//    ! This means all the fields in inheritance.animals.Animal are inherited by inheritance.animals.Cat

    String breed;

    //Use the super keyword in constructor to specify that age and name are from inheritance.animals.Animal constructor
    public Cat(String name, int age, String breed) {
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
        System.out.println("Nom Nom Nom");
    }


}

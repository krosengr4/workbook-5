public class Cat extends Animal {
//    ! The extends keyword makes Cat class a child of Animal class
//    ! This means all the fields in Animal are inherited by Cat

    String breed;

    //Use the super keyword in constructor to specify that age and name are from Animal constructor
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

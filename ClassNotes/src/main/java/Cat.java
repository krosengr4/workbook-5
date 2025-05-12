public class Cat extends Animal {
//    ! The extends keyword makes Cat class a child of Animal class
//    ! This means all the fields in Animal are inherited by Cat

    String breed;

    public Cat() {
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }


}

public class Cat extends Animal {
//    ! The extends keyword makes Developer class a child of Person class
//    ! This means all the fields in Person are inherited by Developer

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

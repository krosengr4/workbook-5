package inheritance.animals;

//!Parent class of Cat and Dog classes
public class Animal {

    String name;
    int age;

    //Animal constructor
    public Animal (String name, int age) {
        this.name = name;
        this.age = age;
    }

    //region getters and setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //endregion

    public static void eat() {
        System.out.println("Munch Munch");
    }
}

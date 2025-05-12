public class Main {

    public static void main(String[] args) {
        Developer dev = new Developer();

        //Because Developer is a child of Person, we can set and get age
        dev.setAge(25);
        System.out.println("This dev's age is: " + dev.getAge());
    }
}

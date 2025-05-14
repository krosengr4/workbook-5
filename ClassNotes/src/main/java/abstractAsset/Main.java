package abstractAsset;

public class Main {

    //! You CANNOT instantiate an abstract class
//    Asset asset = new Asset(); <---ERROR

    //!You CAN instantiate a class that inherits an abstract class
    House myHouse = new House("My House", 1993, 380000.00, "2341 Happy ln", 43560, 2000);

}

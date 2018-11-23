public class Mobile {


    private final String brand;
    private final String name;
    private final String color;

    public Mobile(String name, String color, String brand) {
        this.name = name;
        this.color = color;
        this.brand = brand;
    }

    public void makeCall(String message) {
        System.out.printf("Message : %s\n",message);
    }


    public void getBasicInfo() {
        System.out.printf("name: %s, color: %s, brand: %s\n",name,color,brand);

    }
}

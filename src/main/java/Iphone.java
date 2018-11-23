public class Iphone extends Mobile {
    public Iphone(String name, String color, String brand) {
        super(name,  color,  brand);
    }

    @Override
    public void makeCall(String message) {
        if (message.length()> 50){
            System.out.println("<iPhone> Message cannot be sent");
        }else{
            System.out.print("<iPhone> ");
            super.makeCall(message);
        }
    }
}

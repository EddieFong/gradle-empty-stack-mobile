public class Android extends Mobile {
    public Android(String name, String color, String brand) {
        super(name,  color,  brand);
    }

    @Override
    public void makeCall(String message) {
        if (message.length()> 5){
            System.out.println("<Android> Message cannot be sent");
        }else{
            System.out.print("<Android> ");
            super.makeCall(message);
        }

    }

}

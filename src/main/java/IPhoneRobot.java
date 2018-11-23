public class IPhoneRobot  {
    Iphone iphone;
    public IPhoneRobot(Iphone iphone) {
        this.iphone = iphone;
    }

    public void makeCall(String message) {
        this.iphone.makeCall(message);
    }
}

public class Person {
    public Mobile getMobile() {
        return mobile;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    private Mobile mobile;

    public Person(Mobile mobile) {
        this.mobile = mobile;
    }

    public void makeCall(String message) {
        this.mobile.makeCall(message);
    }
}

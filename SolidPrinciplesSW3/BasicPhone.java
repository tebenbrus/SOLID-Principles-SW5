package SolidPrinciplesSW3;


public class BasicPhone implements SMS, PhoneCall{
    @Override
    public void makeCall(String number) {
        System.out.println("Basic Phone is Calling " + number);
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("Sending message: " + message + " to " + number);
    }

}

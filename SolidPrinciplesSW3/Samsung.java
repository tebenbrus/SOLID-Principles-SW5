package SolidPrinciplesSW3;


public class Samsung implements SMS, PhoneCall, Browser, Camera{
    @Override
    public void makeCall(String number) {
        System.out.println("Samsung is Calling " + number);
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("Samsung Sending message: " + message + " to " + number);
    }


    @Override
    public void browseWeb(String url) {
        System.out.println("Samsung Browsing on the " + url);
    }

    @Override
    public void takePicture() {
        System.out.println("Samsung Took a picture");
    }
}

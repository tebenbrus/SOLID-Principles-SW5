package SolidPrinciplesSW3;

public class Main {
    public static void main(String[] args) {
        BasicPhone basicPhone = new BasicPhone();
        Samsung samsung = new Samsung();
        Iphone iphone = new Iphone();


        System.out.println();

        System.out.println("Basic Phone:");
        basicPhone.makeCall("0923321231");
        basicPhone.sendSMS("09123456789", "what's brod!");
        
        System.out.println();

        System.out.println("Samsung:");
        samsung.makeCall("0923321231");
        samsung.sendSMS("09123456789", "Good morning, How are you?");
        samsung.browseWeb("vle.com");
        samsung.takePicture();

        System.out.println();

        System.out.println("Iphone:");
        iphone.makeCall("0923321231");
        iphone.sendSMS("09123456789", "How are you?");
        iphone.browseWeb("github.com");
        iphone.takePicture();
    }
}

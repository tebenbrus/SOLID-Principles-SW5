package SolidPrinciplesSW2;

public class Main{

    public static void main(String[] args) {

        Customer student = new Customer("Steven", new StudentDiscount());
        Customer seniorCitizen = new Customer("Nanay", new SeniorCitizenDiscount());
        Customer regular = new Customer("Ara", new RegularDiscount());

        double amount = 100.0;

        System.out.println(student.getName() + " pays: ₱" + student.applyDiscount(amount));
        System.out.println(seniorCitizen.getName() + " pays: ₱" + seniorCitizen.applyDiscount(amount));
        System.out.println(regular.getName() + " pays: ₱" + regular.applyDiscount(amount));
    }
}
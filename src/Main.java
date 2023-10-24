import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a, b;
        Scanner ulaz = new Scanner(System.in); // Ulazni objekat
        System.out.println("Unesite prvi broj: ");
        a = ulaz.nextInt();
        System.out.println("Unesite drugi broj: ");
        b = ulaz.nextInt();
        System.out.println("Brojevi su:" + a + " i " + b);
    }
}

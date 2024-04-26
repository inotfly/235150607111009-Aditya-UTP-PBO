import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cinema cgv = new Cinema("CGV Center Point", 3);
        cgv.init();
        getBalance(cgv);
    }
    private static void getBalance(Cinema cgv) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------");
        System.out.println("Selamat datang di " + cgv.getName());
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Exit");
        System.out.println("Pick your choice:");
        double balance = scanner.nextDouble();
        scanner.close();
    }
}

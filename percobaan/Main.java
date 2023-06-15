package Percobaan;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Login login = new Login();

        // System.out.println("=== Sign Up ===");
        // System.out.println("Masukkan username:");
        // String username = scanner.nextLine();

        // System.out.println("Masukkan password:");
        // String password = scanner.nextLine();

        // SignUp.signUp(username, password);
        // System.out.println("Sign Up berhasil!");

        System.out.println("\n=== Login ===");
        System.out.println("Masukkan username:");
        String enteredUsername = scanner.nextLine();
        login.setUsername(enteredUsername);

        System.out.println("Masukkan password:");
        String enteredPassword = scanner.nextLine();
        login.setPassword(enteredPassword);

        if (login.authenticate()) {
            System.out.println("Login berhasil!");
        } else {
            System.out.println("Login gagal! Username atau password salah.");
        }
    }
}


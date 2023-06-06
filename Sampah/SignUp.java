import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SignUp extends Login {
    private String email;

    public SignUp(String username, String password, String email) {
        super(username, password);
        this.email = email;
    }

    public void displaySignUpForm() {
        System.out.println("=== Sign Up ===");
        System.out.println("Please enter your details:");
        System.out.print("Username: ");
        Scanner scanner = new Scanner(System.in);
        username = scanner.nextLine();
        System.out.print("Password: ");
        password = scanner.nextLine();
        System.out.print("Email: ");
        email = scanner.nextLine();
    }

    public void displaySignUpSuccessMessage() {
        System.out.println("Sign up successful! Welcome, " + username + ".");
    }
    public void saveToFile() {
        try {
            FileWriter writer = new FileWriter("users.txt", true); // true untuk menambahkan data ke file yang sudah ada

            // Menulis data pengguna ke dalam file
            writer.write(username + ":" + password + "\n");

            writer.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

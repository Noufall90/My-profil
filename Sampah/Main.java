import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        SignUp signUp = new SignUp("", "", "");
        signUp.displaySignUpForm();
        signUp.displaySignUpSuccessMessage();
        signUp.saveToFile();

        String filePath = "users.txt";
        Login login = new Login("admin", "password");
        login.setDataFromFile(filePath);
        System.out.println("Username: " + login.getUsername());
        System.out.println("Password: " + login.getPassword());
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Login System ===");
        System.out.print("Username: ");
        String enteredUsername = scanner.nextLine();
        System.out.print("Password: ");
        String enteredPassword = scanner.nextLine();

        if (login.authenticate(enteredUsername, enteredPassword)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }

        scanner.close();
        
    }
}

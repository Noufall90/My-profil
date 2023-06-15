package Percobaan;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SignUp {
    private static final String FILE_PATH = "data_user.txt";

    public static void signUp(String username, String password) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write(username + "," + password);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

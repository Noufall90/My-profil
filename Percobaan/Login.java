package Percobaan;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Login {
    private static final String FILE_PATH = "data_user.txt";
    private String username;
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public boolean authenticate() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 2) {
                    String savedUsername = data[0];
                    String savedPassword = data[1];
                    if (username.equals(savedUsername) && password.equals(savedPassword)) {
                        return true;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}

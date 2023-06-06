import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Login {
    protected String username;
    protected String password;

    public Login(String username,String password) {
        this.username=username;
        this.password=password;
    }
    public void setUsername(String username){
        this.username=username;
    }

    public String getUsername(){
        return username;
    }
    public void setPassword(String password){
        this.password=password;
    }

    public String getPassword(){
        return password;
    }

    public boolean authenticate(String enteredUsername, String enteredPassword) {
        return username.equals(enteredUsername) && password.equals(enteredPassword);
    }
    public void setDataFromFile(String filePath) {
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            if ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(":"); // Misalkan data dipisahkan dengan koma (,)

                if (data.length >= 2) {
                    username = data[0];
                    password = data[1];
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
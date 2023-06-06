import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Sdata{
    public String line;
    public Sdata(String line){
        this.line=line;
    }
    public void sdatadisplay() {
        System.out.println("Baris: "+this.line);
    }
    public static void main(String[] args) {
        String filePath = "users.txt";

        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                processLine(line); // Panggil metode untuk mengolah baris sebagai parameter
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void processLine(String line) {
        // Lakukan sesuatu dengan baris sebagai parameter
        System.out.println(line);
    }
}

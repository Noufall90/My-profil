public class Login {
    private String username;
    private String password;
    private boolean isLoggedIn;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
        this.isLoggedIn = false;
    }

    public void login() {
        // Implementasi logika untuk proses login
        // Misalnya, memeriksa apakah username dan password sesuai dengan data yang valid
        // Jika sesuai, set isLoggedIn menjadi true
    }

    public void logout() {
        // Implementasi logika untuk proses logout
        // Misalnya, menghapus informasi login dan set isLoggedIn menjadi false
    }

    // Getter dan setter untuk atribut-atribut

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }
}
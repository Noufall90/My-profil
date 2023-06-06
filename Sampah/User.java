public class User extends Login {
    protected String nama;
    protected String email;

    public User(String nama, String username, String password, String email) {
        super(username,password);
        this.nama = nama;
        this.email = email;
    }

    public String getnama() {
        return nama;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void displayUserInfo() {
        System.out.println("User Information:");
        System.out.println("User ID: " + nama);
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
    }
}
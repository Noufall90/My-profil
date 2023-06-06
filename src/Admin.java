public class Admin extends Customer {
    private int adminID;

    public Admin(String nama,String alamat,String email,String nomor_telepon,Login login,int adminID){
        super(nama, alamat, email, nomor_telepon, login);
        this.adminID=adminID;
    }

    public void setadminID(int adminID){
        this.adminID=adminID;
    }
    public int getadminID(){
        return adminID;
    }
    @Override
    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getnomor_telepon(){
        return this.nomor_telepon;
    }
    public void setnomor_telepon(String nomor_telepon){
        this.nomor_telepon=nomor_telepon;
    }

}

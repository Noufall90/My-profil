public class Customer {
    protected String nama;
    protected String alamat;
    protected String email;
    protected String nomor_telepon;
    protected Login login; 

    public Customer(String nama,String alamat,String email,String nomor_telepon,Login login){
        this.nama=nama;
        this.alamat=alamat;
        this.email=email;
        this.nomor_telepon=nomor_telepon;
        this.login=login;
    }
    // Method Customer
    public void login() {
        login.login();
        System.out.println("Pembeli " + nama + " berhasil login.");
    }

    public void logout() {
        login.logout();
        System.out.println("Pembeli " + nama + " berhasil logout.");
    }
    public Login getLogin() {
        return login;
    }

    public void cariProduk(String namaProduk) {
        // Implementasi logika untuk mencari produk berdasarkan nama
        // Misalnya, menampilkan daftar produk dengan nama yang sesuai
    }

    public void pilihProduk(Produk produk) {
        daftar_pemesanan.add(produk);
        System.out.println("Produk " + produk.getnama_barang() + " ditambahkan ke keranjang belanja.");
    }
    public void tambahJumlahProduk(Produk produk, int jumlah) {
        // Implementasi logika untuk menambah jumlah produk yang dibeli dalam keranjang belanja
        // Misalnya, menambahkan jumlah produk yang sudah dipilih sebelumnya
    }

    public void batalkanProduk(Produk produk) {
        daftar_pemesanan.remove(produk);
        System.out.println("Produk " + produk.getnama_barang() + " dibatalkan dari keranjang belanja.");
    }

    public void checkout() {
        // Implementasi logika untuk melakukan checkout barang
        // Misalnya, membuat objek Transaksi baru dan menyimpannya dalam history pembelian
    }
    public void lihatHistoryPembelian() {
        System.out.println("History Pembelian:");
        for (Produk produk : daftar_pemesanan) {
            System.out.println("- Nama: " + produk.getnama_barang() + ", Harga: " + produk.getharga_barang() + ", Jumlah: " + produk.getStock_barang());
        // Implementasi logika untuk melihat history pembelian barang
        // Misalnya, menampilkan daftar transaksi yang pernah dilakukan oleh pembeli
        }
    }
    public void lihatdaftar_pemesanan() {
        System.out.println("Daftar Pemesanan:");
        for (Produk produk : daftar_pemesanan) {
            System.out.println("- " + produk.getnama_barang());
        }
    }

    // Setter dan Getter atribut
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getnomor_telepon(){
        return nomor_telepon;
    }
    public void setnomor_telepon(String nomor_telepon){
        this.nomor_telepon=nomor_telepon;
    }
}

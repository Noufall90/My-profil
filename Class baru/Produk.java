public class Produk {
    protected String idProduk;
    protected String namaProduk;
    protected double harga;
    
    public Produk(String idProduk, String namaProduk, double harga) {
        this.idProduk = idProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
    }
    
    public String getIdProduk() {
        return idProduk;
    }
    
    public String getNamaProduk() {
        return namaProduk;
    }
    
    public double getHarga() {
        return harga;
    }
}
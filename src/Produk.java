import java.math.BigDecimal;

public class Produk {
    private String nama_barang;
    private BigDecimal harga_barang;
    private int Stock_barang;

    Produk(String nama_barang,BigDecimal harga_barang,int Stock_barang){
        this.nama_barang=nama_barang;
        this.harga_barang=harga_barang;
        this.Stock_barang=Stock_barang;
    }
    // Method Produk and Get,Set
    // Nama Barang
    public void setnama_barang(String nama_barang){
        this.nama_barang=nama_barang;
    }
    public String getnama_barang(){
        return nama_barang;
    }
    // Harga
    public void setharga_barang(BigDecimal harga_barang){
        this.harga_barang=harga_barang;
    }
    public BigDecimal getharga_barang(){
        return harga_barang;
    }
    // Stock
    public void setStock_barang(int Stock_barang){
        this.Stock_barang=Stock_barang;
    }
    public int getStock_barang(){
        return Stock_barang;
    }
    // Method Update Produk
    public void updateJumlahBarang(int jumlah) {
        Stock_barang += jumlah;
        System.out.println("Stok barang " + nama_barang + " berhasil diperbarui. Stok saat ini: " + Stock_barang);
    }

    public void updateharga_barang(BigDecimal harga) {
        harga_barang = harga;
        System.out.println("Harga barang " + nama_barang + " berhasil diperbarui. Harga saat ini: " + harga_barang);
    }
    public void add(Produk produk) {
    }
    public void remove(Produk produk) {
    }
}

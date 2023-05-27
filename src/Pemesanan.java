import java.math.BigDecimal;

public class Pemesanan extends Produk {
    public Produk daftar_pemesanan;

    Pemesanan(String nama_barang,BigDecimal harga_barang,int stock_barang,Produk daftar_pemesanan){
        super(nama_barang,harga_barang,stock_barang);
        this.daftar_pemesanan=daftar_pemesanan;
    }
}

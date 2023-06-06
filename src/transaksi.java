public class transaksi {
    public String nomor_tranksaksi;
    public Customer pelanggan;
    public Pemesanan produk_yangdipesan;
    public float total_harga;
    public String status_pengiriman;

    public transaksi(String nomor_tranksaksi,Customer pelanggan,Pemesanan produk_yangdipesan,float total_harga,String status_pengiriman){
        this.nomor_tranksaksi=nomor_tranksaksi;
        this.pelanggan=pelanggan;
        this.produk_yangdipesan=produk_yangdipesan;
        this.total_harga=total_harga;
        this.status_pengiriman=status_pengiriman;
    } 
}

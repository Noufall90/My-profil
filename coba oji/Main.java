public class Main {

    public static void main(String[] args) {
        Produk produk1 = new Produk("Sepatu", 100.0, 10);
        System.out.println("Nama Produk: " + produk1.getNama());
        System.out.println("Harga Produk: " + produk1.getHarga());
        System.out.println("Stok Produk: " + produk1.getStok());
        
        produk1.updateStok(50);
        produk1.updateHarga(75.0);
        
        System.out.println("Stok Produk setelah update: " + produk1.getStok());
        System.out.println("Harga Produk setelah update: " + produk1.getHarga());
         }
        
        
    }
    


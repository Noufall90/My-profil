import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class keranjang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sistem Keranjang");
        System.out.println("-----------------");

        Map<String, Integer> keranjang = new HashMap<>();

        // Loop untuk menambahkan barang ke dalam keranjang
        String input;
        do {
            System.out.print("Masukkan nama barang (kosongkan untuk selesai): ");
            input = scanner.nextLine();

            if (!input.isEmpty()) {
                System.out.print("Masukkan jumlah barang: ");
                int jumlah = scanner.nextInt();
                scanner.nextLine();

                tambahBarang(keranjang, input, jumlah);
            }
        } while (!input.isEmpty());

        // Menampilkan isi keranjang
        System.out.println("\nIsi Keranjang:");
        tampilkanKeranjang(keranjang);

        // Menghitung total pembelian
        int total = hitungTotal(keranjang);
        System.out.println("\nTotal pembelian: Rp." + total);

        // Meneruskan ke file pembayaran
        pembayaran.processPayment("0987654321", total);

        scanner.close();
    }

    public static void tambahBarang(Map<String, Integer> keranjang, String namaBarang, int jumlah) {
        if (keranjang.containsKey(namaBarang)) {
            int totalJumlah = keranjang.get(namaBarang) + jumlah;
            keranjang.put(namaBarang, totalJumlah);
        } else {
            keranjang.put(namaBarang, jumlah);
        }
    }

    public static void tampilkanKeranjang(Map<String, Integer> keranjang) {
        for (Map.Entry<String, Integer> entry : keranjang.entrySet()) {
            String namaBarang = entry.getKey();
            int jumlah = entry.getValue();
            System.out.println(namaBarang + ": " + jumlah);
        }
    }

    public static int hitungTotal(Map<String, Integer> keranjang) {
        int total = 0;
        for (Map.Entry<String, Integer> entry : keranjang.entrySet()) {
            int jumlah = entry.getValue();
            // Hitung total harga barang (sesuaikan dengan logika harga barang)
            int hargaBarang = 20000
        ; // Contoh harga per barang
            int totalHarga = hargaBarang * jumlah;
            total = totalHarga;
        }
        return total;
    }
}

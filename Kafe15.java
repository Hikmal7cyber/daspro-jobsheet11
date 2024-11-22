import java.util.Scanner;
public class Kafe15 {
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Berikan diskon 50%");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Berikan diskon 30%");
        } else {
            System.out.println("Kode invalid");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }

    public static int hitungTotalHarga15(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItem = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItem[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equals("DISKON50")) {
            hargaTotal = hargaTotal * 50 / 100; 
        } else if (kodePromo.equals("DISKON30")) {
            hargaTotal = hargaTotal * 30 / 100;  
        } else {
            System.out.println("Kode promo tidak valid. Tidak ada pengurangan harga.");
        }

        return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = sc.nextLine();
        
        System.out.print("Apakah Anda member (true/false)? ");
        boolean isMember = sc.nextBoolean();
        sc.nextLine(); 

        System.out.print("Masukkan kode promo: ");
        String kodePromo = sc.nextLine();

        Menu(namaPelanggan, isMember, kodePromo);

        int totalHarga = 0;
        char lanjutkan;
 
        do {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();
            sc.nextLine(); 

            int hargaMenu = hitungTotalHarga15(pilihanMenu, banyakItem, kodePromo);
            totalHarga += hargaMenu; 

            System.out.println("Harga untuk pesanan ini: Rp " + hargaMenu);

            System.out.print("\nApakah Anda ingin menambah menu lain? (y/n): ");
            lanjutkan = sc.nextLine().charAt(0);

        } while (lanjutkan == 'y' || lanjutkan == 'Y');

        System.out.println("\nTotal harga keseluruhan pesanan Anda: Rp " + totalHarga);
    }
}

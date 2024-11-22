public class PengunjungCafe15 {
    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung: ");
        for (String name : namaPengunjung) {
            System.out.println("- " + name);
        }
    }

    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
    }
}

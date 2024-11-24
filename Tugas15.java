import java.util.Scanner;
public class Tugas15 {
static int [][] penjualan = new int [7][5];
static String [] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};

    public static void main (String[]args){
        dataPenjualan();
        rekapPenjualan();
        menuTertinggi();
        rataPenjualan();
    }
    
    public static void dataPenjualan(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            if (i == 0) {
                System.out.println("Rekap hari Senin: ");
            } else if (i == 1) {
                System.out.println("Rekap hari Selasa: ");
            } else if (i == 2){
                System.out.println("Rekap hari Rabu: ");
            } else if (i == 3) {
                System.out.println("Rekap hari Kamis: ");
            } else if (i == 4) {
                System.out.println("Rekap hari Jumat: ");
            } else if (i == 5) {
                System.out.println("Rekap hari Sabtu: ");
            } else if (i == 6) {
                System.out.println("Rekap hari Minggu: ");
            }
            for (int j = 0; j < 5 ; j++) {
                System.out.print("Jumlah penjualan "+ menu[j]+ " :");
                penjualan[i][j] = sc.nextInt();
            }
        }
    }

    public static void rekapPenjualan(){
        System.out.println("----- Rekap penjualan selama seminggu -----");
        for (int i = 0; i < 7; i++) {
            if (i == 0) {
                System.out.println("Senin: ");
            } else if (i == 1) {
                System.out.println("\nSelasa: ");
            } else if (i == 2){
                System.out.println("\nRabu: ");
            } else if (i == 3) {
                System.out.println("\nKamis: ");
            } else if (i == 4) {
                System.out.println("\nJumat: ");
            } else if (i == 5) {
                System.out.println("\nSabtu: ");
            } else if (i == 6) {
                System.out.println("\nMinggu: ");
            }
            for (int j = 0; j < 5; j++) {
                System.out.print(menu[j]+" : " + penjualan[i][j]+ "       ");
            }
        }
    }

    public static void menuTertinggi(){
        int[] totalPenjualan = new int[5];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                totalPenjualan[j] += penjualan[i][j];
            }
        }
        int menuTertinggi = 0;
        for (int j = 0; j < totalPenjualan.length; j++) {
            if (totalPenjualan[j] > totalPenjualan[menuTertinggi] ) {
                menuTertinggi = j;
            }
        }
        System.out.println("\nPenjualan tertinggi:  " + menu[menuTertinggi] + " sebanyak: " + totalPenjualan[menuTertinggi]);
    }
        
    public static void rataPenjualan(){
        for (int i = 0; i < 5; i++) {
            int penjualanPerMenu = 0;
            for (int j = 0; j < 7; j++) {
                penjualanPerMenu += penjualan[j][i];
            }
            double rata2 = penjualanPerMenu / 7;
            System.out.println("Rata rata penjualan " + menu[i]+ " :" + rata2);
            }
    }
}

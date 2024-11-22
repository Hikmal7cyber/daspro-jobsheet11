import java.util.Scanner;
public class Kubus15 {
    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);

        int s, volume, permukaan;

        System.out.print("Masukkan panjang sisi kubus: ");
        s = input15.nextInt();

        volume = hitungVolume15(s);
        System.out.println("Volume kubus dengan panjang sisi " + s + " adalah: " + volume);
        permukaan = hitungPermukaan15(s);
        System.out.println("Luas permukaan kubus dengan panjang sisi " + s + " adalah: " + permukaan);
    }

    public static int hitungVolume15 (int s){
        int volume = s * s * s ;
        return volume;
    }

    public static int hitungPermukaan15 (int s){
        int permukaan = 6 * (s*s);
        return permukaan;
    }
}

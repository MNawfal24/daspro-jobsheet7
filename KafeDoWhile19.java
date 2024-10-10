import java.util.Scanner;
public class KafeDoWhile19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int hargakopi = 12000, hargateh = 7000, hargaroti = 20000, totalHarga, kopi, teh, roti;
        String namaPelanggan;
        do {
            System.out.println(" Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if(namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan." );
                break;
            }
            System.out.print("jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("jumlah roti : ");
            roti = sc.nextInt();
            totalHarga = (kopi * hargakopi) + (teh * hargateh) + (roti * hargaroti);
            System.out.println(" total yang hars dibayar : Rp " + totalHarga);
            sc.nextLine();
        } while (true);

        System.out.println(" Semua Transaksi Selesai ");
    }
}

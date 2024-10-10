import java.util.Scanner;
public class Tugas1Jobsheet7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double hargaTiket = 50000, diskon = 0, bnykTiket, hargaPembayaran, totaldiskon, totalSatuHari = 0;

                System.out.println( " SELAMAT DATANG DI BIOSKOP");
        do{
            System.out.print("Berapa tiket yang ingin anda beli (jika pembelian tiket selesai gunakan angka 0 ): ");
            bnykTiket = sc.nextDouble();
                if (bnykTiket < 1) {
                    System.out.println(" Inputan banyak tiket yang ingin di beli invalid");
                    continue;
                }
            
                if (bnykTiket > 4 && bnykTiket <= 10 ) {
                    diskon = 0.1;
                } else if (bnykTiket > 10) {
                    diskon = 0.15;
                } 
                totaldiskon = diskon * hargaTiket * bnykTiket;
                totalSatuHari += hargaTiket * bnykTiket - totaldiskon;

                
        } while (bnykTiket != 0);

        System.out.println(" Jumlah pendapatan yang di terima adalah : " + totalSatuHari);
    }
}

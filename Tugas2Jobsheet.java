import java.util.Scanner;
public class Tugas2Jobsheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jnsKendaraan, lamaparkir = 0, totalBayar = 0;

        do {
            System.out.println(" Masukkan Jenis Kendaraan anda (1.Mobil 2.Motor 3.Batal)");
            jnsKendaraan = sc.nextInt();
                if (jnsKendaraan == 1 || jnsKendaraan ==2){
                    System.out.println("Berapa lama anda Memparkir Kendaraan : " );
                    lamaparkir = sc.nextInt();

                    if (lamaparkir >5){
                        totalBayar += 12500;
                    } else if (jnsKendaraan == 1) {
                        totalBayar += lamaparkir * 3000;
                    } else if (jnsKendaraan == 2) {
                        totalBayar += lamaparkir * 2000;
                    }
                }     
        }while (jnsKendaraan != 3);
         System.out.println(" Total pembayaran anda adalah :" + totalBayar);
    }
    
    
}

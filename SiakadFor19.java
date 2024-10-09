import java.util.Scanner;
public class SiakadFor19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, terendah = 100, tertinggi = 0;
        int lulus = 0, tdkLulus = 0;
        
        for (int i = 1; i <=10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai < 60) {
                tdkLulus++;
            } else {
                lulus++;
            }
        }
        System.out.println(" Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai Terendah : " + terendah);
        System.out.println(" Jumlah mahaiswa lulus = " + lulus);
        System.out.println(" Jumlah mahasiswa tidak lulus = " + tdkLulus);
    }
}

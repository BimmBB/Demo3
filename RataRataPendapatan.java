import java.util.Scanner;

/**
 * Program ini menghitung rata-rata pendapatan selama 1 minggu berdasarkan
 * pendapatan harian
 */
public class RataRataPendapatan {
    /**
     *
     * @param args Argumen baris perintah (tidak digunakan dalam program ini).
     *
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalPendapatan = 0;

        System.out.println("Masukkan pendapatan harian selama 1 minggu : ");
        for (int hari = 1; hari <= 7; hari++) {
            System.out.print("Hari " + hari + ": ");
            double pendapatanHarian = input.nextDouble();
            totalPendapatan += pendapatanHarian;
        }

        double rataRataPendapatan = totalPendapatan / 7;

        System.out.println("Rata-rata pendapatan selama 1 minggu adalah: " + rataRataPendapatan);
    }
}

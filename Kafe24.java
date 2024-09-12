import java.util.Scanner;

public class Kafe24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean keanggotaan;
        int jmlkopi, jmlteh, jmlroti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0;
        float diskon = 10 / 100f;

        System.out.print("Masukkan kenggotaan (true/false):");
        keanggotaan = input.nextBoolean();
        System.out.print("Masukkan jumlah pembelian kopi:");
        jmlkopi = input.nextInt();
        System.out.print("Masukkan jumlah pembelian teh:");
        jmlteh = input.nextInt();
        System.out.print("Masukkan jumlah pembelian roti:");
        jmlroti = input.nextInt();

        double totalHarga = (jmlkopi * hargaKopi) + (jmlteh * hargaRoti) + (jmlteh * hargaTeh);
        double nominalBayar = totalHarga - (diskon * totalHarga);

        System.out.println("Keanggotan pelanggan" + keanggotaan);
        System.out.println("Item pebelian" + jmlkopi + "kopi, " + jmlteh + "teh, " + jmlroti + "roti, ");
        System.out.println("Nominal bayar Rp" + nominalBayar);

    }
}
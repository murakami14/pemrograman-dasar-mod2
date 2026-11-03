import java.util.Scanner;

public class MOD_2G {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        double mp, uts, uas, nilaiAkhir;

        System.out.print("Nama\t\t: ");
        nama = input.nextLine();
        System.out.print("Nilai MP\t: ");
        mp = input.nextDouble();
        System.out.print("Nilai UTS\t: ");
        uts = input.nextDouble();
        System.out.print("Nilai UAS\t: ");
        uas = input.nextDouble();

        nilaiAkhir = (6 * mp + 2 * uts + 2 * uas) / 10;

        System.out.println("\n--HASIL NILAI AKHIR--");
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Matakuliah\t: Pemrograman Dasar");
        System.out.println("Nilai Akhir\t: " + nilaiAkhir);

        input.close();
    }
}
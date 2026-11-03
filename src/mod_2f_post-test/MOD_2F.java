import java.util.Scanner;

public class MOD_2F {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, nim, prodi, fakultas, ttl, alamat;

        System.out.print("Nama Lengkap          : ");
        nama = input.nextLine();
        System.out.print("NIM                   : ");
        nim = input.nextLine();
        System.out.print("Program Studi         : ");
        prodi = input.nextLine();
        System.out.print("Fakultas              : ");
        fakultas = input.nextLine();
        System.out.print("Tempat, Tanggal Lahir : ");
        ttl = input.nextLine();
        System.out.print("Alamat                : ");
        alamat = input.nextLine();

        System.out.println("\n--- KARTU TANDA MAHASISWA ---");
        System.out.println("Universitas Kuningan");
        System.out.println("Nama\t\t\t: " + nama);
        System.out.println("NIM\t\t\t: " + nim);
        System.out.println("Program Studi\t\t: " + prodi);
        System.out.println("Fakultas\t\t: " + fakultas);
        System.out.println("Tempat, Tgl Lahir\t: " + ttl);
        System.out.println("Alamat\t\t\t: " + alamat);

        input.close();
    }
}
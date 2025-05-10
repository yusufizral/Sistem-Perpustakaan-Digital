import java.util.Scanner;

public class Perpustakaan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Berapa jumlah buku yang ingin dimasukkan? ");
        int jumlah = scanner.nextInt();
        scanner.nextLine(); // konsumsi newline

        Buku[] koleksi = new Buku[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData buku ke-" + (i + 1));
            System.out.print("Jenis buku (1 = Umum, 2 = Fiksi, 3 = Fantasi): ");
            int jenis = scanner.nextInt();
            scanner.nextLine(); // konsumsi newline

            System.out.print("Judul       : ");
            String judul = scanner.nextLine();
            System.out.print("Penulis     : ");
            String penulis = scanner.nextLine();
            System.out.print("Tahun Terbit: ");
            int tahun = scanner.nextInt();
            scanner.nextLine(); // konsumsi newline

            if (jenis == 1) {
                koleksi[i] = new Buku(judul, penulis, tahun);
            } else if (jenis == 2) {
                System.out.print("Genre       : ");
                String genre = scanner.nextLine();
                koleksi[i] = new BukuFiksi(judul, penulis, tahun, genre);
            } else if (jenis == 3) {
                System.out.print("Genre       : ");
                String genre = scanner.nextLine();
                System.out.print("Dunia Fiksi : ");
                String dunia = scanner.nextLine();
                koleksi[i] = new BukuFiksiFantasi(judul, penulis, tahun, genre, dunia);
            } else {
                System.out.println("Jenis tidak valid, diinput sebagai Buku Umum.");
                koleksi[i] = new Buku(judul, penulis, tahun);
            }
        }

        // Menampilkan hasil
        System.out.println("\n=== Daftar Buku Perpustakaan ===\n");
        for (Buku buku : koleksi) {
            buku.tampilkanInfo();
            System.out.println("--------------------------------");
        }

        scanner.close();
    }
}

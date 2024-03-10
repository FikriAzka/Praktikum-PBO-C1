// Nama			: Fikri Azka Pradya
// NIM			: 24060122140171
// Tanggal		: 10 Maret 2024
// Deskripsi	: Kelas yang berisi program utama untuk mengaplikasikan kelas Anggota dan Buku
public class Main {
    public static void main(String[] args) {
        Buku Alpro = new Buku("Algoritma Pemrograman");
        Buku PBO = new Buku("Pemrograman Berbasis Objek");
        Buku Strukdat = new Buku("Struktur Data");
        Buku Daspro = new Buku("Dasar Pemrograman");

        Anggota P1 = new Anggota("Azka");
        Anggota P2 = new Anggota("Fikri");

        try {
            P1.pinjamBuku(Daspro);
            P1.pinjamBuku(Strukdat);
            P1.pinjamBuku(PBO);
            // P1.pinjamBuku(Alpro); MaksBuku
            P2.pinjamBuku(PBO); // Buku tidak tersedia

        } catch (BukuTidakTersediaException | MaksimumBukuTerpinjamException  e) {
            System.out.println(e.getMessage());
        }

        // Buku yang dipinjam Azka
        System.out.println("Jumlah buku yang dipinjam oleh " + P1.getNama() + ": " + P1.getJumlahBukuPinjaman());
        System.out.println("Buku yang dipinjam:");
        for (Buku bukuAzka : P1.getBukuPinjaman()) {
            if (bukuAzka != null) {
                System.out.println(bukuAzka.getJudul());
            }
        }

    }
}

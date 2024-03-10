// Nama			: Fikri Azka Pradya
// NIM			: 24060122140171
// Tanggal		: 10 Maret 2024
// Deskripsi	: Kelas yang berisi program class Anggota
public class Anggota {
    private String nama;
    private Buku[] bukuPinjaman;
    private int jumlahBukuPinjaman;

    public Anggota(String nama) {
        this.nama = nama;
        bukuPinjaman = new Buku[3];
        jumlahBukuPinjaman = 0;
    }
    public String getNama() {
        return nama;
    }
    public Buku[] getBukuPinjaman() {
        return bukuPinjaman;
    }
    public int getJumlahBukuPinjaman() {
        return jumlahBukuPinjaman;
    }
    public void pinjamBuku(Buku buku) throws MaksimumBukuTerpinjamException, BukuTidakTersediaException {
        if (jumlahBukuPinjaman >= 3) {
            throw new MaksimumBukuTerpinjamException("Hanya boleh meminjam 3 buku");
        } else if (!buku.isTersedia()) {
            throw new BukuTidakTersediaException("Buku tidak tersedia");
        } else {
            buku.setTersedia(false);
            bukuPinjaman[jumlahBukuPinjaman] = buku;
            jumlahBukuPinjaman++;
        }
    }
    
}
    
// Nama			: Fikri Azka Pradya
// NIM			: 24060122140171
// Tanggal		: 10 Maret 2024
// Deskripsi	: Eksepsi buatan sendiri, memberitahukan batas jumlah meminjam buku hanyalah 3
public class MaksimumBukuTerpinjamException extends Exception{
    public MaksimumBukuTerpinjamException(String message) {
        super(message);
    }
}
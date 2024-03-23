// Nama         : Fikri Azka Pradya
// NIM          : 24060122140171
// Deskripsi    : kelas implementasi IArean berupa cara menghitung luas lingkaran
// Tanggal      : 23 Maret 2024 
import static java.lang.Math.PI;

public class Lingkaran {
    private double jejari;

    public Lingkaran(double r){
        jejari = r;
    }

    public double hitungLuas(){
        return PI*jejari*jejari;
    }
}

// Nama         : Fikri Azka Pradya
// NIM          : 24060122140171
// Deskripsi    : implementasi cara menghitung luas lingkaran
// Tanggal      : 23 Maret 2024 
import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan jari-jari lingkaran: ");
    double jejari = scan.nextDouble(); 
    Lingkaran ba = new Lingkaran(jejari);
    System.out.println("Luas bujur sangkar dengan sisi " + jejari + " satuan adalah " + ba.hitungLuas());

    scan.close();

    }
}

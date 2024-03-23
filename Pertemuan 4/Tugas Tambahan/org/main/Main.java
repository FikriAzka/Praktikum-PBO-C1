// Nama         : Fikri Azka Pradya
// NIM          : 24060122140171
// Deskripsi    : driver class untuk Mahasiswa dan Wali Mahasiswa
// Tanggal      : 23 Maret 2024 

package org.main;

import org.mahasiswa.Mahasiswa;
import org.walimahasiswa.WaliMahasiswa;

public class Main{
    public static void main(String[] args) {
        WaliMahasiswa wali1 = new WaliMahasiswa("Pak Jamal", "3671010112345", "08123415981", "Jl. Buntung 123");
        Mahasiswa mhs1 = new Mahasiswa("Fikaz", "36712345671245", "24060122140171", "Informatika", wali1);

        mhs1.cetak();
        wali1.cetak();
    }
}
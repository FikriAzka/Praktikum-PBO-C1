// Nama         : Fikri Azka Pradya
// NIM          : 24060122140171
// Deskripsi    : Representasi dari objek WaliMahasiswa, turunan kelas Orang
// Tanggal      : 23 Maret 2024 
package org.walimahasiswa;

import org.orang.Orang;

public class WaliMahasiswa extends Orang {
    private String nomorHP;
    private String alamat;

    public WaliMahasiswa(String nama, String nik, String nomorHP, String alamat) {
        super(nama, nik);
        this.nomorHP = nomorHP;
        this.alamat = alamat;
    }

    public String getNomorHP(){
        return nomorHP;
    }

    public String getAlamat(){
        return alamat;
    }

    public void setNomorHP(String nomorHP){
        this.nomorHP = nomorHP;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public void cetak(){
        System.out.println("Nama Wali Mahasiswa     : " + getNama());
        System.out.println("NIK Wali Mahasiswa      : " + getNik());
        System.out.println("Nomor HP Wali Mahasiswa : " + getNomorHP());
        System.out.println("Alamat Wali Mahasiswa   : " + getAlamat());
    }
}

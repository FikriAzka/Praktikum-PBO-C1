// Nama         : Fikri Azka Pradya
// NIM          : 24060122140171
// Deskripsi    : Kelas yang berisi program utama untuk mengaplikasikan kelas Mahasiswa dan WaliMahasiswa
// Tanggal      : 3 Maret 2024 

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1;
        Mahasiswa mahasiswa2;
        WaliMahasiswa wali1;
        
        wali1 = new WaliMahasiswa("Ambatronz", "089610502345", "Jl. Ngawi Selatan 691, Kecamatan Janggar");
        mahasiswa1 = new Mahasiswa("Azka", "24060120140999", "Teknik Mesin", wali1);

        mahasiswa2 = new Mahasiswa("Ambatukam", "24060122120404", "Desain Komunikasi Visual", new WaliMahasiswa("Fuad", "086912385423", "Jl. Prabroro Jonggrang 901, Kecamatan Gibrang"));
        // Method Mahasiswa
        System.out.println("Method Mahasiswa");
        System.out.println("Nama Mahasiswa 1: " + mahasiswa1.getNama());
        System.out.println("NIM Mahasiswa 1: " + mahasiswa1.getNim());
        System.out.println("Jurusan Mahasiswa 1: " + mahasiswa1.getJurusan());
        mahasiswa1.setNama("Fikri Azka Pradya");
        mahasiswa1.setNim("24060122140171");
        mahasiswa1.setJurusan("Informatika");

        // Method waliMahasiswa
        System.out.println("\nWali Mahasiswa 1 : " + mahasiswa1.getWali().getNama());
        System.out.println("Nomor HP Wali Mahasiswa 1 : " + mahasiswa1.getWali().getNomorHP());
        System.out.println("Alamat Wali Mahasiswa 1 : " + mahasiswa1.getWali().getAlamat());
        mahasiswa1.setWali(new WaliMahasiswa("Bagas", "08123456789", "Jl. Dribble 222, Kota Semarang"));

        // Cetak Mahasiswa 1
        System.out.println("\nCetak Mahasiswa 1");
        mahasiswa1.cetak();

        // Cetak Mahasiswa 2
        System.out.println("\nCetak Mahasiswa 2");
        mahasiswa2.cetak();
    }  
}
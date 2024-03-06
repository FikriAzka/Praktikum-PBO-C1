// Nama         : Fikri Azka Pradya
// NIM          : 24060122140171
// Deskripsi    : Program untuk demo asersi yang akan menolah input jari-jari lingkaran yang bernilai nol
// Tanggal      : 3 Maret 2024 

class Lingkaran {
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari > 0):"jari jari tidak boleh nol dan negatif!!!";
        Lingkaran ling = new Lingkaran(jariJari);
        double kelilingLingkaran = ling.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}

// pesan untuk assertnya dirubah sesuai perintah assertnya
// Nama			: Fikri Azka Pradya
// NIM			: 24060122140171
// Tanggal		: 29 Februari 2024
// Deskripsi	: Kelas yang berisi program class Garis

public class Garis{
    private Titik titikAwal,titikAkhir;

    public Garis (Titik titikAwal,Titik titikAkhir){
        this.titikAwal=titikAwal;
        this.titikAkhir=titikAkhir;
    }

    public void setTitikAwal(Titik t){
        titikAwal = t;
    }
    public void setTitikAkhir(Titik t){
        titikAkhir = t;
    }
    public Titik getTitikAwal( ){
        return titikAwal;
    }
    public Titik getTitikAkhir( ){
        return titikAkhir;
    }

    public double getPanjang(){
        double x = getTitikAkhir().getAbsis()-getTitikAwal().getAbsis();
        double y = getTitikAkhir().getOrdinat()-getTitikAwal().getOrdinat();
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }


    public double getGradien(){
        return ((getTitikAkhir().getOrdinat())-(getTitikAwal().getOrdinat()))/((getTitikAkhir().getAbsis())-(getTitikAwal().getAbsis()));
    }

    public Garis getrefleksiY(){
        return new Garis(getTitikAwal().getRefleksiY(),getTitikAkhir().getRefleksiY());
        
    }

    public boolean IstegakLurus(Garis g){
        return getGradien() == -1/g.getGradien();
    }

}


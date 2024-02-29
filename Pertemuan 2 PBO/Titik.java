// Nama			: Fikri Azka Pradya
// NIM			: 24060122140171
// Tanggal		: 29 Februari 2024
// Deskripsi	: Kelas yang berisi program class Titik
public class Titik {
	private float absis;
	private float ordinat;
	static float counterTitik;

	Titik(){
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}

    Titik(float absis, float o){
        this.absis = absis;
        ordinat = o;
        counterTitik++;
    }

	void setAbsis(float a){
		absis = a;
	}
	
	void setOrdinat(float o){
		ordinat = o;
	}

	float getAbsis(){
		return absis;
	}

	float getOrdinat(){
		return ordinat;
	}

	static float getCounterTitik(){
		return counterTitik;
	}

	public float getJarakPusat(){
		return (float) Math.sqrt(absis*absis + ordinat*ordinat); 
	}

	public void refleksiX(){
		this.ordinat = -(this.ordinat);
	}

	public void refleksiY(){
		this.absis = this.absis*(-1);
	}

	public Titik getRefleksiX(){
		return new Titik(this.absis, -(this.ordinat));
	}

	public Titik getRefleksiY(){
		Titik t = new Titik(-(this.absis), this.ordinat);
		return t;
	}
}
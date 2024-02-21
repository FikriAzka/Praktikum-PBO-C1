public class Titik {
	float absis;
	float ordinat;
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
}
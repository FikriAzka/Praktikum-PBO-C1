public class Main {
	public static void main(String[] args) {
		Titik t1;
		Titik t2;
        Titik t3;

		t1 = new Titik();
		t2 = new Titik();
        t3 = new Titik(5,6);

		t1.setAbsis(5);
		t1.setOrdinat(7);
		t2.setAbsis(5);
		t2.setOrdinat(7);

		float counterTitik;
		float absis;
		float ordinat;

		counterTitik = Titik.getCounterTitik();
		System.out.println("Jumlah objek titik: " + counterTitik);

        absis = t1.getAbsis();
        ordinat = t1.getOrdinat();
        //System.out.printf("t1(%.1f, %.1f)\n", absis, ordinat);
        System.out.println("t1("+absis + ", " + ordinat + ")");

        absis = t2.getAbsis();
        ordinat = t2.getOrdinat();
        System.out.printf("t2(%.1f, %.1f)\n", absis, ordinat);
        //System.out.println("t2("+absis + ", " + ordinat + ")");

        // absis = t3.getAbsis();
        // ordinat = t3.getOrdinat();
        System.out.printf("t3(%.1f, %.1f)\n", t3.getAbsis(), t3.getOrdinat());
        //System.out.println("t3("+ t3.getAbsis() + ", " + t3.getOrdinat() + ")");

	}
}
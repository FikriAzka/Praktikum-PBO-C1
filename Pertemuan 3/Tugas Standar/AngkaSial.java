// Nama         : Fikri Azka Pradya
// NIM          : 24060122140171
public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukang angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(5);
            as.cobaAngka(9);
        } catch(AngkaSialException ase){
            // method getMessage() telah ada pada kelas Exception
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka !!!");
        }
    }
}

// jawab pertanyaan: tidak dieksekusi karena langsung ke catchnya
// : dieksekusi karena terdapat angka 13

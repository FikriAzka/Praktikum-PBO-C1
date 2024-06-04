// Nama     : Fikri Azka Pradya
// NIM      : 24060122140171
public class Superman extends Kyrptonian {
    
    private String name;

    public Superman(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    
    public void Eat(){
        System.out.println("Superman juga harus makan seperti pada manusia umumnya");
    }

    public void takeOff(){
        System.out.println(this.name + "sedang lepas landas");
    }

    public void land(){
        System.out.println(this.name + "sedang mendarat");
    }

    public void fly(){
        System.out.println(this.name + "sedang terbang");
    }

    public void leapBuilding(){
        System.out.println(this.name + "sedang loncat dari gedung yang tinggi");
    }

    public void stopBullet() {
        System.out.println(this.name + "dapat menghetikan peluru");
    }

    public void eat() {
        System.out.println("Nasi Goreng");
    }
}


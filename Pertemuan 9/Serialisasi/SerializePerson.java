// Nama     : Fikri Azka Pradya
// NIM      : 24060122140171
// Deskripsi: Program untuk serialisasi objek Person
// Tanggal  : 21 Mei 2024 

import java.io.*;

class Person implements Serializable {
    private String name;
    public Person(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}

public class SerializePerson {
    public static void main(String[] args) {
        Person p = new Person("Azkada");
        try {
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(p);
            System.out.println("Selesai menulis objek person");
            s.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
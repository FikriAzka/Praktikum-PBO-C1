// Nama     : Fikri Azka Pradya
// NIM      : 24060122140171
// Deskripsi: Main Program untuk akses DAO
// Tanggal  : 21 Mei 2024 
public class MainDAO {
    public static void main(String[] args) {
        Person person = new Person("Azkada");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        try{
            m.getPersonDAO().savePerson(person);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}

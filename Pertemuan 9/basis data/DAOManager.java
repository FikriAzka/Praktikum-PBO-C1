// Nama     : Fikri Azka Pradya
// NIM      : 24060122140171
// Deskripsi: Pengelola DAO dalam program
// Tanggal  : 21 Mei 2024 
public class DAOManager {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person){
        personDAO = person;
    }

    public PersonDAO getPersonDAO(){
        return personDAO;
    }
}

// Nama         : Fikri Azka Pradya
// NIM          : 24060122140171
public class ExceptionOnArray {
	public static void main(String[] args){
		Integer[] arrayInteger = new Integer[4];
		try{
			arrayInteger[2] = 11;
			arrayInteger[4] = 10;
			System.out.println(arrayInteger[2]);
		} 
		catch(ArrayIndexOutOfBoundsException exception){
			System.out.println("index error");
		} catch (Exception exception){
			System.out.println("error umum");
		} finally {
			System.out.println("clean up code...");
		}

		System.out.println("test");
	}
}
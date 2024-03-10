// Nama			: Fikri Azka Pradya
// NIM			: 24060122140171
// Tanggal		: 10 Maret 2024
// Deskripsi	: Kelas yang berisi program utama untuk mengaplikasikan kelas Product
public class MProduct {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 4, 500);

        // product.setName("");
        // product.setPrice(-1);
        // product.setStock(-1);
        System.out.println("Product Name: " + product.getName());
        System.out.println("Product Stock: " + product.getStock());
        System.out.println("Product Price: " + product.getPrice());
        product.purchaseProduct(5);
        product.addStock(1);
        System.out.println("Product Stock: " + product.getStock());
    }
}
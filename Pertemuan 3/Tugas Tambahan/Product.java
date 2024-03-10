// Nama			: Fikri Azka Pradya
// NIM			: 24060122140171
// Tanggal		: 10 Maret 2024
// Deskripsi	: Kelas yang berisi program class Product
public class Product {
    private String name;
    private int stock;
    private int price;
    public Product() {
    this.name = "";
    this.stock = 0;
    this.price = 0;
    }
    public Product(String name, int stock, int price) {
        this.name = name;
        this.stock = stock;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public int getStock() {
        return stock;
    }
    public int getPrice() {
        return price;
    }
    public void setName(String name) {
        assert(name != ""):"Nama tidak boleh kosong!";
        this.name = name;
    }
    public void setStock(int stock) {
        assert(stock > 0):"Stock tidak boleh nol, harus positif!";
        this.stock = stock;
    }
    public void setPrice(int price) {
        assert(price > 0):"Harga tidak boleh nol, harus positif!";
        this.price = price;
    }
    
    public void purchaseProduct(int quantity) {
        assert(quantity > 0 && quantity <= stock):"Pembeilian tidak boleh nol, harus positif dan Stock harus mencukupi!!";
        this.stock -= quantity;
    }
    public void addStock(int quantity) {
        assert(quantity > 0):"Menambahkan tidak boleh nol, Harus positifff";
        this.stock += quantity;
    }  
}

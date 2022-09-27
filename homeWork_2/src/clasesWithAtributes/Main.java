package clasesWithAtributes;

public class Main {
    
    
    public static void main(String[] args) {
    
        Product product= new Product(25, "Cep Telefonu", "Real me", 6000, 56, "sarı","96");

        Product product2= new Product();

        
        product2.setId(250);
        product2.setName("Laptop");
        product2.setDescription("Asus");
        product2.setPrice(15000);
        product2.setStockAmount(15);


        ProductManager productManager= new ProductManager();
        productManager.add(product);
        productManager.add(product2);
       


    }
}

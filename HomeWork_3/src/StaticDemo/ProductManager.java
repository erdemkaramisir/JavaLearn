package HomeWork_3.StaticDemo;

public class ProductManager {
    public void add( Product product){

        ProductValidator validator= new ProductValidator();
        
        
        if(validator.isValid(product)){

            System.out.println(" eklendi");
        }else{
            System.out.println(" Ürün bilgileri geçersizdir ");
        }

    }
}

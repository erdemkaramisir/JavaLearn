package Classes;

public class Main {

    public static void main(String[] args) {
    
        CustomerManager customerManager= new CustomerManager();

        customerManager.add();

        customerManager.remove();

        customerManager.upDate();

        // new PAHALIDIR

        CustomerManager customerManager2= new CustomerManager();

        customerManager= customerManager2;

        // Stack de yapılan değişim ile  customerManager referansını gösteren bir kod kalmadı heap de bulunan hafıza boşa düştü. Garbage collector tarafından referansı olmayan bölüm temizlenecek.

        // Stack;  Lifo ( son giren ilk çıkar )mantığı ile çalıştığı için verilen değerler hemen değişmez. Atanmasını bekler. 

        // heap; Referans tipleri tuttuğu için ve aktif bir şekilde çalıştığından dolayı atanmalarda sıra beklemez, tuttuğu adresi değiştirir. yapılan değişiklikleri anında yansıtır.

        //Stack: ilkel( primitive tip) . Java dili, bu veri tiplerinin, onlara ait nesneler yaratılmaksızın kullanılmasına olanak sağlar. 

        //heap: referans tip







    }
}

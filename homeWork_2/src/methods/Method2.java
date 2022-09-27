package methods;

public class Method2 {

    public static void ekle(){
        System.out.println(" Eklendi ...");

    }
    public static void sil(){
        System.out.println(" Silindi ... ");
    }
    public static void guncelle(){

        System.out.println(" Güncellendi ...");
    }


    //-------------------------------------------------
    public static int topla(int a,int b){

        return a+b;
    
    }

    public static int cikar(int a, int b){
        return a-b;
    }

    public static String sehirver(){
        return "Ankara";
    }

    public static int topla2 (int... sayilar) {

        int toplam=0;

        for( int sayi:sayilar){
            toplam= toplam+sayi;
            
        }return toplam;

    }








 //-----------------------------------------------------------------   
    public static void main(String[] args) {
        
        int cikarma=cikar(10,6);


        String mesaj= "Bugün hava çok güzel.";
        String yeniMesaj= mesaj.substring(0,2);

        System.out.println(mesaj);

        System.out.println(yeniMesaj);

        
        System.out.println(topla(3,6));

        System.out.println(cikarma);

        System.out.println(sehirver());

        
        int toplam = topla2(10,3,36,98,54);

        System.out.println(toplam);
    }
}

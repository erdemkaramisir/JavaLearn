package methods;

public class Main {

    // ---------------------------------------------------------

    public static void sayiBulmaca() {

        System.out.println(" Sayı Bulmaca");

        int[] sayilar = { 1, 2, 5, 7, 9, 0 };
        int aranacak = 3;
        boolean varMi = false;

        // for (int i=0; i<sayilar.length; i++) {
        // if ( sayilar[i] == aranacak) {
        // varMi = true;
        // break;
        // }
        // }

        for (int sayi : sayilar) {
            if (aranacak == sayi) {
                varMi = true;
                break;
            }

        }

        if (varMi == true) {
           mesajVer(aranacak);
            // System.out.println(" Sayı Mevcuttur :" + aranacak);

        } else {
            System.out.println(" Sayı Mevcut Değildir : " + aranacak);

        }
    }
//-----------------------------------------------
    public static void mesajVer(int aranacak){
        System.out.println(" Sayı Mevcuttur  :" + aranacak);

    }
// --------------------------------------------------------------------------------
    public static void main(String[] args) {

        sayiBulmaca();

    }

}
